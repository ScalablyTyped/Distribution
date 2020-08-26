package typings.mcustomscrollbar.anon

import typings.mcustomscrollbar.mcustomscrollbarStrings.auto
import typings.mcustomscrollbar.mcustomscrollbarStrings.x
import typings.mcustomscrollbar.mcustomscrollbarStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends js.Object {
  /**
    * Define the mouse-wheel scrolling axis when both vertical and horizontal scrollbars are present.
    * Set axis: "y" (default) for vertical or axis: "x" for horizontal scrolling.
    */
  var axis: js.UndefOr[x | y] = js.native
  /**
    * Set the number of pixels one wheel notch scrolls. The default value “auto” uses the OS/browser value.
    */
  var deltaFactor: js.UndefOr[Double] = js.native
  /**
    * Set the tags that disable mouse-wheel when cursor is over them.
    * Default value: ["select","option","keygen","datalist","textarea"]
    */
  var disableOver: js.UndefOr[js.Array[String]] = js.native
  /**
    * Enable or disable content scrolling via mouse-wheel.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Invert mouse-wheel scrolling direction.
    * Set to true to scroll down or right when mouse-wheel is turned upwards.
    */
  var invert: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable mouse-wheel (delta) acceleration.
    * Setting normalizeDelta: true translates mouse-wheel delta value to -1 or 1.
    */
  var normalizeDelta: js.UndefOr[Boolean] = js.native
  /**
    * Prevent the default behaviour which automatically scrolls the parent element when end
    * or beginning of scrolling is reached (same bahavior with browser’s native scrollbar).
    */
  var preventDefault: js.UndefOr[Boolean] = js.native
  /**
    * Set the mouse-wheel scrolling amount (in pixels).
    * The default value "auto" adjusts scrolling amount according to scrollable content length.
    */
  var scrollAmount: js.UndefOr[auto | Double] = js.native
}

object Axis {
  @scala.inline
  def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
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
    def setAxis(value: typings.mcustomscrollbar.mcustomscrollbarStrings.x | y): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setDeltaFactor(value: Double): Self = this.set("deltaFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaFactor: Self = this.set("deltaFactor", js.undefined)
    @scala.inline
    def setDisableOverVarargs(value: String*): Self = this.set("disableOver", js.Array(value :_*))
    @scala.inline
    def setDisableOver(value: js.Array[String]): Self = this.set("disableOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableOver: Self = this.set("disableOver", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    @scala.inline
    def setNormalizeDelta(value: Boolean): Self = this.set("normalizeDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizeDelta: Self = this.set("normalizeDelta", js.undefined)
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    @scala.inline
    def setScrollAmount(value: auto | Double): Self = this.set("scrollAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollAmount: Self = this.set("scrollAmount", js.undefined)
  }
  
}

