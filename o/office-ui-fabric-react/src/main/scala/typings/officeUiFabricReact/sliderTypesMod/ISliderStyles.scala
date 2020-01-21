package typings.officeUiFabricReact.sliderTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderStyles extends js.Object {
  /**
    * Style set for active portion of the line.
    */
  var activeSection: IStyle
  /**
    * Style set for the container of the slider.
    */
  var container: IStyle
  /**
    * Style set for inactive portion of the line.
    */
  var inactiveSection: IStyle
  /**
    * Style set for element that contains all the lines.
    */
  var line: IStyle
  /**
    * Style set for both active and inactive sections of the line.
    */
  var lineContainer: IStyle
  /**
    * Style set for the root element.
    */
  var root: IStyle
  /**
    * Style set for the actual box containting interactive elements of the slider.
    */
  var slideBox: IStyle
  /**
    * Style set for thumb of the slider.
    */
  var thumb: IStyle
  /**
    * Style set for the title label above the slider.
    */
  var titleLabel: IStyle
  /**
    * Style set for value label on right/below of the slider.
    */
  var valueLabel: IStyle
  /**
    * Style set for tick on 0 on number line. This element only shows up when originFromZero prop is true.
    */
  var zeroTick: IStyle
}

object ISliderStyles {
  @scala.inline
  def apply(
    activeSection: IStyle = null,
    container: IStyle = null,
    inactiveSection: IStyle = null,
    line: IStyle = null,
    lineContainer: IStyle = null,
    root: IStyle = null,
    slideBox: IStyle = null,
    thumb: IStyle = null,
    titleLabel: IStyle = null,
    valueLabel: IStyle = null,
    zeroTick: IStyle = null
  ): ISliderStyles = {
    val __obj = js.Dynamic.literal()
    if (activeSection != null) __obj.updateDynamic("activeSection")(activeSection.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (inactiveSection != null) __obj.updateDynamic("inactiveSection")(inactiveSection.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lineContainer != null) __obj.updateDynamic("lineContainer")(lineContainer.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (slideBox != null) __obj.updateDynamic("slideBox")(slideBox.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (titleLabel != null) __obj.updateDynamic("titleLabel")(titleLabel.asInstanceOf[js.Any])
    if (valueLabel != null) __obj.updateDynamic("valueLabel")(valueLabel.asInstanceOf[js.Any])
    if (zeroTick != null) __obj.updateDynamic("zeroTick")(zeroTick.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderStyles]
  }
}

