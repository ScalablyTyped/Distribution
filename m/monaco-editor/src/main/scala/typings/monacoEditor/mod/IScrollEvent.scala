package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScrollEvent extends StObject {
  
  val scrollHeight: Double = js.native
  
  val scrollHeightChanged: Boolean = js.native
  
  val scrollLeft: Double = js.native
  
  val scrollLeftChanged: Boolean = js.native
  
  val scrollTop: Double = js.native
  
  val scrollTopChanged: Boolean = js.native
  
  val scrollWidth: Double = js.native
  
  val scrollWidthChanged: Boolean = js.native
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
  
  @scala.inline
  implicit class IScrollEventMutableBuilder[Self <: IScrollEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHeightChanged(value: Boolean): Self = StObject.set(x, "scrollHeightChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftChanged(value: Boolean): Self = StObject.set(x, "scrollLeftChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopChanged(value: Boolean): Self = StObject.set(x, "scrollTopChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidthChanged(value: Boolean): Self = StObject.set(x, "scrollWidthChanged", value.asInstanceOf[js.Any])
  }
}
