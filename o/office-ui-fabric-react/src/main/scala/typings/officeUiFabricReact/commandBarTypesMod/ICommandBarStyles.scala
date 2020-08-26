package typings.officeUiFabricReact.commandBarTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandBarStyles extends js.Object {
  var primarySet: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
  var secondarySet: js.UndefOr[IStyle] = js.native
}

object ICommandBarStyles {
  @scala.inline
  def apply(): ICommandBarStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandBarStyles]
  }
  @scala.inline
  implicit class ICommandBarStylesOps[Self <: ICommandBarStyles] (val x: Self) extends AnyVal {
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
    def setPrimarySet(value: IStyle): Self = this.set("primarySet", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimarySet: Self = this.set("primarySet", js.undefined)
    @scala.inline
    def setPrimarySetNull: Self = this.set("primarySet", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setSecondarySet(value: IStyle): Self = this.set("secondarySet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondarySet: Self = this.set("secondarySet", js.undefined)
    @scala.inline
    def setSecondarySetNull: Self = this.set("secondarySet", null)
  }
  
}

