package typings.pkijs.revocationInfoChoicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevocationInfoChoices extends js.Object {
  var crls: js.Array[typings.pkijs.certificateRevocationListMod.default] = js.native
  var otherRevocationInfos: js.Array[typings.pkijs.otherRevocationInfoFormatMod.default] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
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
  @scala.inline
  implicit class RevocationInfoChoicesOps[Self <: RevocationInfoChoices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCrlsVarargs(value: typings.pkijs.certificateRevocationListMod.default*): Self = this.set("crls", js.Array(value :_*))
    @scala.inline
    def setCrls(value: js.Array[typings.pkijs.certificateRevocationListMod.default]): Self = this.set("crls", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setOtherRevocationInfosVarargs(value: typings.pkijs.otherRevocationInfoFormatMod.default*): Self = this.set("otherRevocationInfos", js.Array(value :_*))
    @scala.inline
    def setOtherRevocationInfos(value: js.Array[typings.pkijs.otherRevocationInfoFormatMod.default]): Self = this.set("otherRevocationInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
  
}

