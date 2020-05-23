package typings.officeUiFabricReact.coachmarkTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoachmarkStyleProps extends js.Object {
  /**
    * Beacon color one
    */
  var beaconColorOne: js.UndefOr[String] = js.undefined
  /**
    * Beacon color two
    */
  var beaconColorTwo: js.UndefOr[String] = js.undefined
  /**
    * ClassName to provide on the root style area.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Is the Coachmark collapsed.
    * Deprecated, use `isCollapsed` instead.
    * @deprecated Use `isCollapsed` instead.
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * Color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Delay time for the animation to start
    */
  var delayBeforeCoachmarkAnimation: js.UndefOr[String] = js.undefined
  /**
    * The height measured before the component has been mounted
    * in pixels
    */
  var entityHostHeight: js.UndefOr[String] = js.undefined
  /**
    * The width measured in pixels
    */
  var entityHostWidth: js.UndefOr[String] = js.undefined
  /**
    * Height of the coachmark
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * Is the beacon currently animating.
    */
  var isBeaconAnimating: Boolean
  /**
    * Is the Coachmark collapsed
    */
  var isCollapsed: Boolean
  /**
    * Is the Coachmark finished measuring the dimensions of innerHostElement
    */
  var isMeasured: Boolean
  /**
    * Is the component taking measurements
    */
  var isMeasuring: Boolean
  /**
    * Current theme.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Transform origin for teaching bubble content
    */
  var transformOrigin: js.UndefOr[String] = js.undefined
  /**
    * Width of the coachmark
    */
  var width: js.UndefOr[String] = js.undefined
}

object ICoachmarkStyleProps {
  @scala.inline
  def apply(
    isBeaconAnimating: Boolean,
    isCollapsed: Boolean,
    isMeasured: Boolean,
    isMeasuring: Boolean,
    beaconColorOne: String = null,
    beaconColorTwo: String = null,
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    delayBeforeCoachmarkAnimation: String = null,
    entityHostHeight: String = null,
    entityHostWidth: String = null,
    height: String = null,
    theme: ITheme = null,
    transformOrigin: String = null,
    width: String = null
  ): ICoachmarkStyleProps = {
    val __obj = js.Dynamic.literal(isBeaconAnimating = isBeaconAnimating.asInstanceOf[js.Any], isCollapsed = isCollapsed.asInstanceOf[js.Any], isMeasured = isMeasured.asInstanceOf[js.Any], isMeasuring = isMeasuring.asInstanceOf[js.Any])
    if (beaconColorOne != null) __obj.updateDynamic("beaconColorOne")(beaconColorOne.asInstanceOf[js.Any])
    if (beaconColorTwo != null) __obj.updateDynamic("beaconColorTwo")(beaconColorTwo.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (delayBeforeCoachmarkAnimation != null) __obj.updateDynamic("delayBeforeCoachmarkAnimation")(delayBeforeCoachmarkAnimation.asInstanceOf[js.Any])
    if (entityHostHeight != null) __obj.updateDynamic("entityHostHeight")(entityHostHeight.asInstanceOf[js.Any])
    if (entityHostWidth != null) __obj.updateDynamic("entityHostWidth")(entityHostWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkStyleProps]
  }
}

