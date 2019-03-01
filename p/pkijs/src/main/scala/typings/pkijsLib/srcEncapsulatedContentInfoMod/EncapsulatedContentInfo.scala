package typings
package pkijsLib.srcEncapsulatedContentInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncapsulatedContentInfo extends js.Object {
  var eContent: asn1jsLib.asn1jsMod.OctetString
  var eContentType: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncapsulatedContentInfo {
  @scala.inline
  def apply(
    eContent: asn1jsLib.asn1jsMod.OctetString,
    eContentType: java.lang.String,
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): EncapsulatedContentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eContent")(eContent)
    __obj.updateDynamic("eContentType")(eContentType)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[EncapsulatedContentInfo]
  }
}

