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
    activeSection: js.UndefOr[Null | IStyle] = js.undefined,
    container: js.UndefOr[Null | IStyle] = js.undefined,
    inactiveSection: js.UndefOr[Null | IStyle] = js.undefined,
    line: js.UndefOr[Null | IStyle] = js.undefined,
    lineContainer: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    slideBox: js.UndefOr[Null | IStyle] = js.undefined,
    thumb: js.UndefOr[Null | IStyle] = js.undefined,
    titleLabel: js.UndefOr[Null | IStyle] = js.undefined,
    valueLabel: js.UndefOr[Null | IStyle] = js.undefined,
    zeroTick: js.UndefOr[Null | IStyle] = js.undefined
  ): ISliderStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeSection)) __obj.updateDynamic("activeSection")(activeSection.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(inactiveSection)) __obj.updateDynamic("inactiveSection")(inactiveSection.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(lineContainer)) __obj.updateDynamic("lineContainer")(lineContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(slideBox)) __obj.updateDynamic("slideBox")(slideBox.asInstanceOf[js.Any])
    if (!js.isUndefined(thumb)) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(titleLabel)) __obj.updateDynamic("titleLabel")(titleLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(valueLabel)) __obj.updateDynamic("valueLabel")(valueLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroTick)) __obj.updateDynamic("zeroTick")(zeroTick.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderStyles]
  }
}

