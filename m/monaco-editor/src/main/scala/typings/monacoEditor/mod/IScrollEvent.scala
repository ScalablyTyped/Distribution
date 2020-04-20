package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollEvent extends js.Object {
  val scrollHeight: Double
  val scrollHeightChanged: Boolean
  val scrollLeft: Double
  val scrollLeftChanged: Boolean
  val scrollTop: Double
  val scrollTopChanged: Boolean
  val scrollWidth: Double
  val scrollWidthChanged: Boolean
}

object IScrollEvent {
  @scala.inline
  def apply(
    scrollHeight: Double,
    scrollHeightChanged: Boolean,
    scrollLeft: Double,
    scrollLeftChanged: Boolean,
    scrollTop: Double,
    scrollTopChanged: Boolean,
    scrollWidth: Double,
    scrollWidthChanged: Boolean
  ): IScrollEvent = {
    val __obj = js.Dynamic.literal(scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollHeightChanged = scrollHeightChanged.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollLeftChanged = scrollLeftChanged.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollTopChanged = scrollTopChanged.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], scrollWidthChanged = scrollWidthChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollEvent]
  }
}

