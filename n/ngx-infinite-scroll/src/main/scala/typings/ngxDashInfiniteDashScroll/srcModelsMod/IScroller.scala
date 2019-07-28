package typings.ngxDashInfiniteDashScroll.srcModelsMod

import typings.atAngularCore.atAngularCoreMod.ElementRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScroller extends js.Object {
  var alwaysCallback: Boolean
  var disable: Boolean
  var downDistance: Double
  var element: ElementRef[_]
  var fromRoot: Boolean
  var horizontal: Boolean
  var scrollContainer: String | ElementRef[_]
  var scrollWindow: Boolean
  var throttle: Double
  var upDistance: Double
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
    val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback, disable = disable, downDistance = downDistance, element = element, fromRoot = fromRoot, horizontal = horizontal, scrollContainer = scrollContainer.asInstanceOf[js.Any], scrollWindow = scrollWindow, throttle = throttle, upDistance = upDistance)
  
    __obj.asInstanceOf[IScroller]
  }
}

