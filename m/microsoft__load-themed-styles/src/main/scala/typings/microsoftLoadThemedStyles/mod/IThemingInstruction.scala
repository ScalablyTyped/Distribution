package typings.microsoftLoadThemedStyles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemingInstruction extends js.Object {
  var defaultValue: js.UndefOr[String] = js.native
  var rawString: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
}

object IThemingInstruction {
  @scala.inline
  def apply(): IThemingInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemingInstruction]
  }
  @scala.inline
  implicit class IThemingInstructionOps[Self <: IThemingInstruction] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setRawString(value: String): Self = this.set("rawString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawString: Self = this.set("rawString", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

