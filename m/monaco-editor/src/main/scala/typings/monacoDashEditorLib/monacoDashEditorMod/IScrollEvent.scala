package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollEvent extends js.Object {
  val scrollHeight: scala.Double
  val scrollHeightChanged: scala.Boolean
  val scrollLeft: scala.Double
  val scrollLeftChanged: scala.Boolean
  val scrollTop: scala.Double
  val scrollTopChanged: scala.Boolean
  val scrollWidth: scala.Double
  val scrollWidthChanged: scala.Boolean
}

object IScrollEvent {
  @scala.inline
  def apply(
    scrollHeight: scala.Double,
    scrollHeightChanged: scala.Boolean,
    scrollLeft: scala.Double,
    scrollLeftChanged: scala.Boolean,
    scrollTop: scala.Double,
    scrollTopChanged: scala.Boolean,
    scrollWidth: scala.Double,
    scrollWidthChanged: scala.Boolean
  ): IScrollEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scrollHeight")(scrollHeight)
    __obj.updateDynamic("scrollHeightChanged")(scrollHeightChanged)
    __obj.updateDynamic("scrollLeft")(scrollLeft)
    __obj.updateDynamic("scrollLeftChanged")(scrollLeftChanged)
    __obj.updateDynamic("scrollTop")(scrollTop)
    __obj.updateDynamic("scrollTopChanged")(scrollTopChanged)
    __obj.updateDynamic("scrollWidth")(scrollWidth)
    __obj.updateDynamic("scrollWidthChanged")(scrollWidthChanged)
    __obj.asInstanceOf[IScrollEvent]
  }
}

