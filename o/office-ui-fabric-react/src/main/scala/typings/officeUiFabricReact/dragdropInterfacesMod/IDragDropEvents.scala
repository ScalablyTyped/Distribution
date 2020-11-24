package typings.officeUiFabricReact.dragdropInterfacesMod

import typings.std.DragEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragDropEvents extends js.Object {
  
  /**
    * Whether or not drag action is allowed.
    */
  var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /**
    * Whether the whole group is draggable. This applies after canDrag returns true for the group.
    */
  var canDragGroups: js.UndefOr[Boolean] = js.native
  
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
    * On drag end event callback.
    */
  var onDragEnd: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.native
  
  /**
    * On drag enter region event callback.
    * Returned string is the css classes that will be added to the entering element.
    */
  var onDragEnter: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], String]
  ] = js.native
  
  /**
    * On drag leave region event callback.
    */
  var onDragLeave: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.native
  
  /**
    * On drag over event callback.
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
}
object IDragDropEvents {
  
  @scala.inline
  def apply(): IDragDropEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragDropEvents]
  }
  
  @scala.inline
  implicit class IDragDropEventsOps[Self <: IDragDropEvents] (val x: Self) extends AnyVal {
    
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
    def setCanDrag(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = this.set("canDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCanDrag: Self = this.set("canDrag", js.undefined)
    
    @scala.inline
    def setCanDragGroups(value: Boolean): Self = this.set("canDragGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDragGroups: Self = this.set("canDragGroups", js.undefined)
    
    @scala.inline
    def setCanDrop(
      value: (/* dropContext */ js.UndefOr[IDragDropContext], /* dragContext */ js.UndefOr[IDragDropContext]) => Boolean
    ): Self = this.set("canDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCanDrop: Self = this.set("canDrop", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = this.set("onDragEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => String): Self = this.set("onDragEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = this.set("onDragLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
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
