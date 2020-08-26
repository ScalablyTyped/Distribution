package typings.officeUiFabricReact.sliderTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Slider/Slider.types.ISliderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Slider/Slider.types.ISliderProps, 'className' | 'disabled' | 'vertical'> & {  showTransitions :boolean | undefined,   showValue :boolean | undefined,   titleLabelClassName :string | undefined} */
@js.native
trait ISliderStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var showTransitions: js.UndefOr[Boolean] = js.native
  var showValue: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
  var titleLabelClassName: js.UndefOr[String] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object ISliderStyleProps {
  @scala.inline
  def apply(theme: ITheme): ISliderStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderStyleProps]
  }
  @scala.inline
  implicit class ISliderStylePropsOps[Self <: ISliderStyleProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setShowTransitions(value: Boolean): Self = this.set("showTransitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTransitions: Self = this.set("showTransitions", js.undefined)
    @scala.inline
    def setShowValue(value: Boolean): Self = this.set("showValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowValue: Self = this.set("showValue", js.undefined)
    @scala.inline
    def setTitleLabelClassName(value: String): Self = this.set("titleLabelClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleLabelClassName: Self = this.set("titleLabelClassName", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

