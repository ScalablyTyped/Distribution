package typings
package pkijsLib.srcRevocationInfoChoicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevocationInfoChoices extends js.Object {
  var crls: js.Array[pkijsLib.srcCertificateRevocationListMod.default]
  var otherRevocationInfos: js.Array[pkijsLib.srcOtherRevocationInfoFormatMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RevocationInfoChoices {
  @scala.inline
  def apply(
    crls: js.Array[pkijsLib.srcCertificateRevocationListMod.default],
    fromSchema: js.Function1[js.Any, scala.Unit],
    otherRevocationInfos: js.Array[pkijsLib.srcOtherRevocationInfoFormatMod.default],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): RevocationInfoChoices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("crls")(crls)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("otherRevocationInfos")(otherRevocationInfos)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[RevocationInfoChoices]
  }
}

