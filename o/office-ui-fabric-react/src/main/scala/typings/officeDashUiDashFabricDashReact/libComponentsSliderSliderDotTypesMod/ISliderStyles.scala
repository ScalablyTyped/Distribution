package typings.officeDashUiDashFabricDashReact.libComponentsSliderSliderDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
    activeSection: IStyle,
    container: IStyle,
    inactiveSection: IStyle,
    line: IStyle,
    lineContainer: IStyle,
    root: IStyle,
    slideBox: IStyle,
    thumb: IStyle,
    titleLabel: IStyle,
    valueLabel: IStyle,
    zeroTick: IStyle
  ): ISliderStyles = {
    val __obj = js.Dynamic.literal(activeSection = activeSection.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], inactiveSection = inactiveSection.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineContainer = lineContainer.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], slideBox = slideBox.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], titleLabel = titleLabel.asInstanceOf[js.Any], valueLabel = valueLabel.asInstanceOf[js.Any], zeroTick = zeroTick.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISliderStyles]
  }
}

