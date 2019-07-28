package typings.pkijs.srcRevocationInfoChoicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevocationInfoChoices extends js.Object {
  var crls: js.Array[typings.pkijs.srcCertificateRevocationListMod.default]
  var otherRevocationInfos: js.Array[typings.pkijs.srcOtherRevocationInfoFormatMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RevocationInfoChoices {
  @scala.inline
  def apply(
    crls: js.Array[typings.pkijs.srcCertificateRevocationListMod.default],
    fromSchema: js.Any => Unit,
    otherRevocationInfos: js.Array[typings.pkijs.srcOtherRevocationInfoFormatMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RevocationInfoChoices = {
    val __obj = js.Dynamic.literal(crls = crls, fromSchema = js.Any.fromFunction1(fromSchema), otherRevocationInfos = otherRevocationInfos, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[RevocationInfoChoices]
  }
}

