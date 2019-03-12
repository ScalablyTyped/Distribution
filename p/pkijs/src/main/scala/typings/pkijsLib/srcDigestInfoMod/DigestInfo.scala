package typings
package pkijsLib.srcDigestInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestInfo extends js.Object {
  var digest: asn1jsLib.asn1jsMod.OctetString
  var digestAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object DigestInfo {
  @scala.inline
  def apply(
    digest: asn1jsLib.asn1jsMod.OctetString,
    digestAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): DigestInfo = {
    val __obj = js.Dynamic.literal(digest = digest, digestAlgorithm = digestAlgorithm, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[DigestInfo]
  }
}

