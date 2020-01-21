package typings.pkijs.revocationInfoChoicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevocationInfoChoices extends js.Object {
  var crls: js.Array[typings.pkijs.certificateRevocationListMod.default]
  var otherRevocationInfos: js.Array[typings.pkijs.otherRevocationInfoFormatMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RevocationInfoChoices {
  @scala.inline
  def apply(
    crls: js.Array[typings.pkijs.certificateRevocationListMod.default],
    fromSchema: js.Any => Unit,
    otherRevocationInfos: js.Array[typings.pkijs.otherRevocationInfoFormatMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RevocationInfoChoices = {
    val __obj = js.Dynamic.literal(crls = crls.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), otherRevocationInfos = otherRevocationInfos.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[RevocationInfoChoices]
  }
}

