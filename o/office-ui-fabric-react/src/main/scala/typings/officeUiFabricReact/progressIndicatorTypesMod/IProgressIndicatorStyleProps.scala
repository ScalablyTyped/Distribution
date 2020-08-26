package typings.officeUiFabricReact.progressIndicatorTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressIndicatorStyleProps extends js.Object {
  var barHeight: js.UndefOr[Double] = js.native
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  var indeterminate: js.UndefOr[Boolean] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme = js.native
}

object IProgressIndicatorStyleProps {
  @scala.inline
  def apply(theme: ITheme): IProgressIndicatorStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressIndicatorStyleProps]
  }
  @scala.inline
  implicit class IProgressIndicatorStylePropsOps[Self <: IProgressIndicatorStyleProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarHeight(value: Double): Self = this.set("barHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarHeight: Self = this.set("barHeight", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
  }
  
}

