package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScrollEvent extends js.Object {
  
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
  implicit class IScrollEventOps[Self <: IScrollEvent] (val x: Self) extends AnyVal {
    
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
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHeightChanged(value: Boolean): Self = this.set("scrollHeightChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftChanged(value: Boolean): Self = this.set("scrollLeftChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopChanged(value: Boolean): Self = this.set("scrollTopChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidth(value: Double): Self = this.set("scrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidthChanged(value: Boolean): Self = this.set("scrollWidthChanged", value.asInstanceOf[js.Any])
  }
}
