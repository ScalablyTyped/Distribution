package typings.officeUiFabricReact.coachmarkTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoachmarkStyleProps extends js.Object {
  /**
    * Beacon color one
    */
  var beaconColorOne: js.UndefOr[String] = js.native
  /**
    * Beacon color two
    */
  var beaconColorTwo: js.UndefOr[String] = js.native
  /**
    * ClassName to provide on the root style area.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Is the Coachmark collapsed.
    * Deprecated, use `isCollapsed` instead.
    * @deprecated Use `isCollapsed` instead.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * Color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Delay time for the animation to start
    */
  var delayBeforeCoachmarkAnimation: js.UndefOr[String] = js.native
  /**
    * The height measured before the component has been mounted
    * in pixels
    */
  var entityHostHeight: js.UndefOr[String] = js.native
  /**
    * The width measured in pixels
    */
  var entityHostWidth: js.UndefOr[String] = js.native
  /**
    * Height of the coachmark
    */
  var height: js.UndefOr[String] = js.native
  /**
    * Is the beacon currently animating.
    */
  var isBeaconAnimating: Boolean = js.native
  /**
    * Is the Coachmark collapsed
    */
  var isCollapsed: Boolean = js.native
  /**
    * Is the Coachmark finished measuring the dimensions of innerHostElement
    */
  var isMeasured: Boolean = js.native
  /**
    * Is the component taking measurements
    */
  var isMeasuring: Boolean = js.native
  /**
    * Current theme.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Transform origin for teaching bubble content
    */
  var transformOrigin: js.UndefOr[String] = js.native
  /**
    * Width of the coachmark
    */
  var width: js.UndefOr[String] = js.native
}

object ICoachmarkStyleProps {
  @scala.inline
  def apply(isBeaconAnimating: Boolean, isCollapsed: Boolean, isMeasured: Boolean, isMeasuring: Boolean): ICoachmarkStyleProps = {
    val __obj = js.Dynamic.literal(isBeaconAnimating = isBeaconAnimating.asInstanceOf[js.Any], isCollapsed = isCollapsed.asInstanceOf[js.Any], isMeasured = isMeasured.asInstanceOf[js.Any], isMeasuring = isMeasuring.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkStyleProps]
  }
  @scala.inline
  implicit class ICoachmarkStylePropsOps[Self <: ICoachmarkStyleProps] (val x: Self) extends AnyVal {
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
    def setIsBeaconAnimating(value: Boolean): Self = this.set("isBeaconAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMeasured(value: Boolean): Self = this.set("isMeasured", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMeasuring(value: Boolean): Self = this.set("isMeasuring", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeaconColorOne(value: String): Self = this.set("beaconColorOne", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeaconColorOne: Self = this.set("beaconColorOne", js.undefined)
    @scala.inline
    def setBeaconColorTwo(value: String): Self = this.set("beaconColorTwo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeaconColorTwo: Self = this.set("beaconColorTwo", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDelayBeforeCoachmarkAnimation(value: String): Self = this.set("delayBeforeCoachmarkAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayBeforeCoachmarkAnimation: Self = this.set("delayBeforeCoachmarkAnimation", js.undefined)
    @scala.inline
    def setEntityHostHeight(value: String): Self = this.set("entityHostHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityHostHeight: Self = this.set("entityHostHeight", js.undefined)
    @scala.inline
    def setEntityHostWidth(value: String): Self = this.set("entityHostWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityHostWidth: Self = this.set("entityHostWidth", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

