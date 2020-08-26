package typings.ngxInfiniteScroll.modelsMod

import typings.angularCore.mod.ElementRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScroller extends js.Object {
  var alwaysCallback: Boolean = js.native
  var disable: Boolean = js.native
  var downDistance: Double = js.native
  var element: ElementRef[_] = js.native
  var fromRoot: Boolean = js.native
  var horizontal: Boolean = js.native
  var scrollContainer: String | ElementRef[_] = js.native
  var scrollWindow: Boolean = js.native
  var throttle: Double = js.native
  var upDistance: Double = js.native
}

object IScroller {
  @scala.inline
  def apply(
    alwaysCallback: Boolean,
    disable: Boolean,
    downDistance: Double,
    element: ElementRef[_],
    fromRoot: Boolean,
    horizontal: Boolean,
    scrollContainer: String | ElementRef[_],
    scrollWindow: Boolean,
    throttle: Double,
    upDistance: Double
  ): IScroller = {
    val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], downDistance = downDistance.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromRoot = fromRoot.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], scrollContainer = scrollContainer.asInstanceOf[js.Any], scrollWindow = scrollWindow.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], upDistance = upDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScroller]
  }
  @scala.inline
  implicit class IScrollerOps[Self <: IScroller] (val x: Self) extends AnyVal {
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
    def setAlwaysCallback(value: Boolean): Self = this.set("alwaysCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownDistance(value: Double): Self = this.set("downDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: ElementRef[_]): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromRoot(value: Boolean): Self = this.set("fromRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollContainer(value: String | ElementRef[_]): Self = this.set("scrollContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollWindow(value: Boolean): Self = this.set("scrollWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpDistance(value: Double): Self = this.set("upDistance", value.asInstanceOf[js.Any])
  }
  
}

