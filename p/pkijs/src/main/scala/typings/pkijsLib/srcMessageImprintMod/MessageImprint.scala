package typings
package pkijsLib.srcMessageImprintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageImprint extends js.Object {
  var hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var hashedMessage: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object MessageImprint {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    hashedMessage: asn1jsLib.asn1jsMod.OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): MessageImprint = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm, hashedMessage = hashedMessage, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[MessageImprint]
  }
}

