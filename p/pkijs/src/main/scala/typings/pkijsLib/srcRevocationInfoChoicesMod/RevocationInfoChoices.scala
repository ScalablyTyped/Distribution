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
    fromSchema: js.Any => scala.Unit,
    otherRevocationInfos: js.Array[pkijsLib.srcOtherRevocationInfoFormatMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RevocationInfoChoices = {
    val __obj = js.Dynamic.literal(crls = crls, fromSchema = js.Any.fromFunction1(fromSchema), otherRevocationInfos = otherRevocationInfos, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[RevocationInfoChoices]
  }
}

