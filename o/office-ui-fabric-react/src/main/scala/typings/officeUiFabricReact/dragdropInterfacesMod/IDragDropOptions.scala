package typings.officeUiFabricReact.dragdropInterfacesMod

import typings.officeUiFabricReact.anon.Callback
import typings.std.DragEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragDropOptions extends js.Object {
  
  /**
    * Whether or not drag action is allowed.
    */
  var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /**
    * Whether or not drop action is allowed.
    */
  var canDrop: js.UndefOr[
    js.Function2[
      /* dropContext */ js.UndefOr[IDragDropContext], 
      /* dragContext */ js.UndefOr[IDragDropContext], 
      Boolean
    ]
  ] = js.native
  
  /**
    * Context associated with drag and drop event.
    */
  var context: IDragDropContext = js.native
  
  /**
    * Map of event name to callback function to subscribe to.
    */
  var eventMap: js.UndefOr[js.Array[Callback]] = js.native
  
  /**
    * Unique key to associate with instance.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * On drag end event callback.
    */
  var onDragEnd: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.native
  
  /**
    * On drag over element(s) event callback.
    */
  var onDragOver: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.native
  
  /**
    * On drag start event callback.
    */
  var onDragStart: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* itemIndex */ js.UndefOr[Double], 
      /* selectedItems */ js.UndefOr[js.Array[_]], 
      /* event */ js.UndefOr[MouseEvent], 
      Unit
    ]
  ] = js.native
  
  /**
    * On drop event callback.
    */
  var onDrop: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.native
  
  /**
    * Selection index on drag and drop event.
    */
  var selectionIndex: Double = js.native
  
  /**
    * Callback on drop state update.
    */
  def updateDropState(isDropping: Boolean, event: DragEvent): Unit = js.native
}
object IDragDropOptions {
  
  @scala.inline
  def apply(context: IDragDropContext, selectionIndex: Double, updateDropState: (Boolean, DragEvent) => Unit): IDragDropOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any], updateDropState = js.Any.fromFunction2(updateDropState))
    __obj.asInstanceOf[IDragDropOptions]
  }
  
  @scala.inline
  implicit class IDragDropOptionsOps[Self <: IDragDropOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: IDragDropContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionIndex(value: Double): Self = this.set("selectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDropState(value: (Boolean, DragEvent) => Unit): Self = this.set("updateDropState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCanDrag(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = this.set("canDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCanDrag: Self = this.set("canDrag", js.undefined)
    
    @scala.inline
    def setCanDrop(
      value: (/* dropContext */ js.UndefOr[IDragDropContext], /* dragContext */ js.UndefOr[IDragDropContext]) => Boolean
    ): Self = this.set("canDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCanDrop: Self = this.set("canDrop", js.undefined)
    
    @scala.inline
    def setEventMapVarargs(value: Callback*): Self = this.set("eventMap", js.Array(value :_*))
    
    @scala.inline
    def setEventMap(value: js.Array[Callback]): Self = this.set("eventMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventMap: Self = this.set("eventMap", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = this.set("onDragEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = this.set("onDragOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(
      value: (/* item */ js.UndefOr[js.Any], /* itemIndex */ js.UndefOr[Double], /* selectedItems */ js.UndefOr[js.Array[_]], /* event */ js.UndefOr[MouseEvent]) => Unit
    ): Self = this.set("onDragStart", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDrop(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = this.set("onDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
  }
}
