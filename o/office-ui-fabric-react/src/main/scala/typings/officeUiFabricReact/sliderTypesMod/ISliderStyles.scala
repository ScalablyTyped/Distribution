package typings.officeUiFabricReact.sliderTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISliderStyles extends js.Object {
  /**
    * Style set for active portion of the line.
    */
  var activeSection: IStyle = js.native
  /**
    * Style set for the container of the slider.
    */
  var container: IStyle = js.native
  /**
    * Style set for inactive portion of the line.
    */
  var inactiveSection: IStyle = js.native
  /**
    * Style set for element that contains all the lines.
    */
  var line: IStyle = js.native
  /**
    * Style set for both active and inactive sections of the line.
    */
  var lineContainer: IStyle = js.native
  /**
    * Style set for the root element.
    */
  var root: IStyle = js.native
  /**
    * Style set for the actual box containting interactive elements of the slider.
    */
  var slideBox: IStyle = js.native
  /**
    * Style set for thumb of the slider.
    */
  var thumb: IStyle = js.native
  /**
    * Style set for the title label above the slider.
    */
  var titleLabel: IStyle = js.native
  /**
    * Style set for value label on right/below of the slider.
    */
  var valueLabel: IStyle = js.native
  /**
    * Style set for tick on 0 on number line. This element only shows up when originFromZero prop is true.
    */
  var zeroTick: IStyle = js.native
}

object ISliderStyles {
  @scala.inline
  def apply(): ISliderStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISliderStyles]
  }
  @scala.inline
  implicit class ISliderStylesOps[Self <: ISliderStyles] (val x: Self) extends AnyVal {
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
    def setActiveSection(value: IStyle): Self = this.set("activeSection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveSection: Self = this.set("activeSection", js.undefined)
    @scala.inline
    def setActiveSectionNull: Self = this.set("activeSection", null)
    @scala.inline
    def setContainer(value: IStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setInactiveSection(value: IStyle): Self = this.set("inactiveSection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactiveSection: Self = this.set("inactiveSection", js.undefined)
    @scala.inline
    def setInactiveSectionNull: Self = this.set("inactiveSection", null)
    @scala.inline
    def setLine(value: IStyle): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setLineNull: Self = this.set("line", null)
    @scala.inline
    def setLineContainer(value: IStyle): Self = this.set("lineContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineContainer: Self = this.set("lineContainer", js.undefined)
    @scala.inline
    def setLineContainerNull: Self = this.set("lineContainer", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setSlideBox(value: IStyle): Self = this.set("slideBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideBox: Self = this.set("slideBox", js.undefined)
    @scala.inline
    def setSlideBoxNull: Self = this.set("slideBox", null)
    @scala.inline
    def setThumb(value: IStyle): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
    @scala.inline
    def setThumbNull: Self = this.set("thumb", null)
    @scala.inline
    def setTitleLabel(value: IStyle): Self = this.set("titleLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleLabel: Self = this.set("titleLabel", js.undefined)
    @scala.inline
    def setTitleLabelNull: Self = this.set("titleLabel", null)
    @scala.inline
    def setValueLabel(value: IStyle): Self = this.set("valueLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueLabel: Self = this.set("valueLabel", js.undefined)
    @scala.inline
    def setValueLabelNull: Self = this.set("valueLabel", null)
    @scala.inline
    def setZeroTick(value: IStyle): Self = this.set("zeroTick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZeroTick: Self = this.set("zeroTick", js.undefined)
    @scala.inline
    def setZeroTickNull: Self = this.set("zeroTick", null)
  }
  
}

