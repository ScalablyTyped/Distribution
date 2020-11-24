package typings.officeUiFabricReact.draggableZoneTypesMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDraggableZoneProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * Specifies a selector to be used as the handle that initiates drag
    */
  var handleSelector: js.UndefOr[String] = js.native
  
  /**
    * Callback for when the drag changes, while dragging
    */
  var onDragChange: js.UndefOr[
    js.Function2[
      /* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) with TouchEvent[HTMLElement], 
      /* dragData */ IDragData, 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback for when dragging starts
    */
  var onStart: js.UndefOr[
    js.Function2[
      /* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) with TouchEvent[HTMLElement], 
      /* dragData */ IDragData, 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback for when dragging stops
    */
  var onStop: js.UndefOr[
    js.Function2[
      /* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) with TouchEvent[HTMLElement], 
      /* dragData */ IDragData, 
      Unit
    ]
  ] = js.native
  
  /**
    * the X and Y coordinates to use as an offest to position the draggable content
    */
  var position: js.UndefOr[ICoordinates] = js.native
  
  /**
    * Specifies a selector to be used to prevent drag initialization.
    * For example, if you do not want buttons inside of your handleSelector
    * to have the cursor change to move or to allow users to select from buttons,
    * you could pass button here (the close button in the header of a dialog is a concrete example)
    */
  var preventDragSelector: js.UndefOr[String] = js.native
}
object IDraggableZoneProps {
  
  @scala.inline
  def apply(): IDraggableZoneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDraggableZoneProps]
  }
  
  @scala.inline
  implicit class IDraggableZonePropsOps[Self <: IDraggableZoneProps] (val x: Self) extends AnyVal {
    
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
    def setHandleSelector(value: String): Self = this.set("handleSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSelector: Self = this.set("handleSelector", js.undefined)
    
    @scala.inline
    def setOnDragChange(
      value: (/* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) with TouchEvent[HTMLElement], /* dragData */ IDragData) => Unit
    ): Self = this.set("onDragChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragChange: Self = this.set("onDragChange", js.undefined)
    
    @scala.inline
    def setOnStart(
      value: (/* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) with TouchEvent[HTMLElement], /* dragData */ IDragData) => Unit
    ): Self = this.set("onStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setOnStop(
      value: (/* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) with TouchEvent[HTMLElement], /* dragData */ IDragData) => Unit
    ): Self = this.set("onStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    
    @scala.inline
    def setPosition(value: ICoordinates): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPreventDragSelector(value: String): Self = this.set("preventDragSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDragSelector: Self = this.set("preventDragSelector", js.undefined)
  }
}
