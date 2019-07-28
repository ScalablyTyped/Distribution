package typings.monacoDashEditor.monacoDashEditorMod

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
    val __obj = js.Dynamic.literal(scrollHeight = scrollHeight, scrollHeightChanged = scrollHeightChanged, scrollLeft = scrollLeft, scrollLeftChanged = scrollLeftChanged, scrollTop = scrollTop, scrollTopChanged = scrollTopChanged, scrollWidth = scrollWidth, scrollWidthChanged = scrollWidthChanged)
  
    __obj.asInstanceOf[IScrollEvent]
  }
}

