package typings.officeUiFabricReact.checkTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckStyles extends js.Object {
  /**
    * The 'check' icon styles.
    */
  var check: IStyle = js.native
  /**
    * Check host style
    * @deprecated Not used directly within the component. Instead, use `CheckGlobalClassNames.checkHost` from
    * `Check.styles.ts` to get the static class name to apply to the parent element of the Check.
    */
  var checkHost: IStyle = js.native
  /**
    * The 'circle' icon styles.
    */
  var circle: IStyle = js.native
  /**
    * Style for the root element.
    */
  var root: IStyle = js.native
}

object ICheckStyles {
  @scala.inline
  def apply(): ICheckStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckStyles]
  }
  @scala.inline
  implicit class ICheckStylesOps[Self <: ICheckStyles] (val x: Self) extends AnyVal {
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
    def setCheck(value: IStyle): Self = this.set("check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setCheckNull: Self = this.set("check", null)
    @scala.inline
    def setCheckHost(value: IStyle): Self = this.set("checkHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckHost: Self = this.set("checkHost", js.undefined)
    @scala.inline
    def setCheckHostNull: Self = this.set("checkHost", null)
    @scala.inline
    def setCircle(value: IStyle): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    @scala.inline
    def setCircleNull: Self = this.set("circle", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

