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
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): DigestInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("digest")(digest)
    __obj.updateDynamic("digestAlgorithm")(digestAlgorithm)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[DigestInfo]
  }
}

