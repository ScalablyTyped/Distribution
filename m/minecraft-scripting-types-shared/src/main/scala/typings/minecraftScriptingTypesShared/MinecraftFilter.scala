package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Equalssign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.EqualssignEqualssign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.ExclamationmarkEqualssign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Greaterthansign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.GreaterthansignEqualssign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Lessthansign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignEqualssign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignGreaterthansign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.equals
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.not
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.other
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.parent
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.player
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.self
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinecraftFilter extends js.Object {
  var all_of: js.UndefOr[js.Array[MinecraftFilter]] = js.native
  var any_of: js.UndefOr[js.Array[MinecraftFilter]] = js.native
  var domain: js.UndefOr[String] = js.native
  var operator: js.UndefOr[
    ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not
  ] = js.native
  var subject: js.UndefOr[other | parent | player | self | target] = js.native
  var test: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object MinecraftFilter {
  @scala.inline
  def apply(): MinecraftFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinecraftFilter]
  }
  @scala.inline
  implicit class MinecraftFilterOps[Self <: MinecraftFilter] (val x: Self) extends AnyVal {
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
    def setAll_ofVarargs(value: MinecraftFilter*): Self = this.set("all_of", js.Array(value :_*))
    @scala.inline
    def setAll_of(value: js.Array[MinecraftFilter]): Self = this.set("all_of", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll_of: Self = this.set("all_of", js.undefined)
    @scala.inline
    def setAny_ofVarargs(value: MinecraftFilter*): Self = this.set("any_of", js.Array(value :_*))
    @scala.inline
    def setAny_of(value: js.Array[MinecraftFilter]): Self = this.set("any_of", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAny_of: Self = this.set("any_of", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setOperator(
      value: ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not
    ): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setSubject(value: other | parent | player | self | target): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTest(value: String): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

