package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContentSizeChangedEvent extends js.Object {
  val contentHeight: Double
  val contentHeightChanged: Boolean
  val contentWidth: Double
  val contentWidthChanged: Boolean
}

object IContentSizeChangedEvent {
  @scala.inline
  def apply(
    contentHeight: Double,
    contentHeightChanged: Boolean,
    contentWidth: Double,
    contentWidthChanged: Boolean
  ): IContentSizeChangedEvent = {
    val __obj = js.Dynamic.literal(contentHeight = contentHeight.asInstanceOf[js.Any], contentHeightChanged = contentHeightChanged.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], contentWidthChanged = contentWidthChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IContentSizeChangedEvent]
  }
}

