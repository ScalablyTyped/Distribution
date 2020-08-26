package typings.officeUiFabricReact.baseCardTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseCardStyles extends js.Object {
  /**
    * Style for the root element in the default enabled, non-toggled state.
    */
  var root: js.UndefOr[IStyle] = js.native
}

object IBaseCardStyles {
  @scala.inline
  def apply(): IBaseCardStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseCardStyles]
  }
  @scala.inline
  implicit class IBaseCardStylesOps[Self <: IBaseCardStyles] (val x: Self) extends AnyVal {
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
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

