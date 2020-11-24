package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomPopmotionConfig
  extends /* key */ StringDictionary[js.Any] {
  
  var dragBounds: js.UndefOr[DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])] = js.native
  
  var draggable: js.UndefOr[Draggable] = js.native
  
  var hoverable: js.UndefOr[Boolean] = js.native
  
  var onDragEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
  
  var onPressEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
  
  var onPressStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
  
  var props: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object DomPopmotionConfig {
  
  @scala.inline
  def apply(): DomPopmotionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomPopmotionConfig]
  }
  
  @scala.inline
  implicit class DomPopmotionConfigOps[Self <: DomPopmotionConfig] (val x: Self) extends AnyVal {
    
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
    def setDragBoundsFunction1(value: /* props */ ResolverProps => DragBounds): Self = this.set("dragBounds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragBounds(value: DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])): Self = this.set("dragBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragBounds: Self = this.set("dragBounds", js.undefined)
    
    @scala.inline
    def setDraggable(value: Draggable): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: /* e */ MouseEvent | TouchEvent => _): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* e */ MouseEvent | TouchEvent => _): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnPressEnd(value: /* e */ MouseEvent | TouchEvent => _): Self = this.set("onPressEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressEnd: Self = this.set("onPressEnd", js.undefined)
    
    @scala.inline
    def setOnPressStart(value: /* e */ MouseEvent | TouchEvent => _): Self = this.set("onPressStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressStart: Self = this.set("onPressStart", js.undefined)
    
    @scala.inline
    def setProps(value: StringDictionary[js.Any]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
