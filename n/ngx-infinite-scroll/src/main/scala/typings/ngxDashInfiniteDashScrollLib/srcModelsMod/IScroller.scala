package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScroller extends js.Object {
  var alwaysCallback: scala.Boolean
  var disable: scala.Boolean
  var downDistance: scala.Double
  var element: atAngularCoreLib.atAngularCoreMod.ElementRef[_]
  var fromRoot: scala.Boolean
  var horizontal: scala.Boolean
  var scrollContainer: java.lang.String | atAngularCoreLib.atAngularCoreMod.ElementRef[_]
  var scrollWindow: scala.Boolean
  var throttle: scala.Double
  var upDistance: scala.Double
}

object IScroller {
  @scala.inline
  def apply(
    alwaysCallback: scala.Boolean,
    disable: scala.Boolean,
    downDistance: scala.Double,
    element: atAngularCoreLib.atAngularCoreMod.ElementRef[_],
    fromRoot: scala.Boolean,
    horizontal: scala.Boolean,
    scrollContainer: java.lang.String | atAngularCoreLib.atAngularCoreMod.ElementRef[_],
    scrollWindow: scala.Boolean,
    throttle: scala.Double,
    upDistance: scala.Double
  ): IScroller = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysCallback")(alwaysCallback)
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("downDistance")(downDistance)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("fromRoot")(fromRoot)
    __obj.updateDynamic("horizontal")(horizontal)
    __obj.updateDynamic("scrollContainer")(scrollContainer.asInstanceOf[js.Any])
    __obj.updateDynamic("scrollWindow")(scrollWindow)
    __obj.updateDynamic("throttle")(throttle)
    __obj.updateDynamic("upDistance")(upDistance)
    __obj.asInstanceOf[IScroller]
  }
}

