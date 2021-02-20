package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContentSizeChangedEvent extends StObject {
  
  val contentHeight: Double = js.native
  
  val contentHeightChanged: Boolean = js.native
  
  val contentWidth: Double = js.native
  
  val contentWidthChanged: Boolean = js.native
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
  
  @scala.inline
  implicit class IContentSizeChangedEventMutableBuilder[Self <: IContentSizeChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHeightChanged(value: Boolean): Self = StObject.set(x, "contentHeightChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWidthChanged(value: Boolean): Self = StObject.set(x, "contentWidthChanged", value.asInstanceOf[js.Any])
  }
}
