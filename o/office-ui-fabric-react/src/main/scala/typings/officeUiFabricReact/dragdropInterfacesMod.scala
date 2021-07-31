package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Callback
import typings.officeUiFabricReact.anon.Dispose
import typings.officeUiFabricReact.utilitiesMod.EventGroup
import typings.std.DragEvent
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragdropInterfacesMod {
  
  trait IDragDropContext extends StObject {
    
    /**
      * Data associated with drag & drop action.
      */
    var data: js.Any
    
    /**
      * Index of drag & drop action.
      */
    var index: Double
    
    /**
      * Whether or not drag & drop region is indivual or group of content.
      */
    var isGroup: js.UndefOr[Boolean] = js.undefined
  }
  object IDragDropContext {
    
    @scala.inline
    def apply(data: js.Any, index: Double): IDragDropContext = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDragDropContext]
    }
    
    @scala.inline
    implicit class IDragDropContextMutableBuilder[Self <: IDragDropContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGroupUndefined: Self = StObject.set(x, "isGroup", js.undefined)
    }
  }
  
  trait IDragDropEvent extends StObject {
    
    /**
      * Whether or not the drag & drop event was handled.
      */
    var isHandled: js.UndefOr[Boolean] = js.undefined
  }
  object IDragDropEvent {
    
    @scala.inline
    def apply(): IDragDropEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragDropEvent]
    }
    
    @scala.inline
    implicit class IDragDropEventMutableBuilder[Self <: IDragDropEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHandled(value: Boolean): Self = StObject.set(x, "isHandled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHandledUndefined: Self = StObject.set(x, "isHandled", js.undefined)
    }
  }
  
  trait IDragDropEvents extends StObject {
    
    /**
      * Whether or not drag action is allowed.
      */
    var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.undefined
    
    /**
      * Whether the whole group is draggable. This applies after canDrag returns true for the group.
      */
    var canDragGroups: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not drop action is allowed.
      */
    var canDrop: js.UndefOr[
        js.Function2[
          /* dropContext */ js.UndefOr[IDragDropContext], 
          /* dragContext */ js.UndefOr[IDragDropContext], 
          Boolean
        ]
      ] = js.undefined
    
    /**
      * On drag end event callback.
      */
    var onDragEnd: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
      ] = js.undefined
    
    /**
      * On drag enter region event callback.
      * Returned string is the css classes that will be added to the entering element.
      */
    var onDragEnter: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], String]
      ] = js.undefined
    
    /**
      * On drag leave region event callback.
      */
    var onDragLeave: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
      ] = js.undefined
    
    /**
      * On drag over event callback.
      */
    var onDragOver: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
      ] = js.undefined
    
    /**
      * On drag start event callback.
      */
    var onDragStart: js.UndefOr[
        js.Function4[
          /* item */ js.UndefOr[js.Any], 
          /* itemIndex */ js.UndefOr[Double], 
          /* selectedItems */ js.UndefOr[js.Array[js.Any]], 
          /* event */ js.UndefOr[MouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * On drop event callback.
      */
    var onDrop: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
      ] = js.undefined
  }
  object IDragDropEvents {
    
    @scala.inline
    def apply(): IDragDropEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragDropEvents]
    }
    
    @scala.inline
    implicit class IDragDropEventsMutableBuilder[Self <: IDragDropEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanDrag(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "canDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanDragGroups(value: Boolean): Self = StObject.set(x, "canDragGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanDragGroupsUndefined: Self = StObject.set(x, "canDragGroups", js.undefined)
      
      @scala.inline
      def setCanDragUndefined: Self = StObject.set(x, "canDrag", js.undefined)
      
      @scala.inline
      def setCanDrop(
        value: (/* dropContext */ js.UndefOr[IDragDropContext], /* dragContext */ js.UndefOr[IDragDropContext]) => Boolean
      ): Self = StObject.set(x, "canDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => String): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(
        value: (/* item */ js.UndefOr[js.Any], /* itemIndex */ js.UndefOr[Double], /* selectedItems */ js.UndefOr[js.Array[js.Any]], /* event */ js.UndefOr[MouseEvent]) => Unit
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDrop(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    }
  }
  
  trait IDragDropHelper extends StObject {
    
    /**
      * Dispose of listeners bound to instance of helper.
      */
    def dispose(): Unit
    
    /**
      * Subscribe to events on a DOM node with drag and drop configuration.
      */
    def subscribe(root: HTMLElement, events: EventGroup, options: IDragDropOptions): Dispose
    
    /**
      * Unsubscribe to events registered on a DOM node with key.
      */
    def unsubscribe(root: HTMLElement, key: String): Unit
  }
  object IDragDropHelper {
    
    @scala.inline
    def apply(
      dispose: () => Unit,
      subscribe: (HTMLElement, EventGroup, IDragDropOptions) => Dispose,
      unsubscribe: (HTMLElement, String) => Unit
    ): IDragDropHelper = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), subscribe = js.Any.fromFunction3(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
      __obj.asInstanceOf[IDragDropHelper]
    }
    
    @scala.inline
    implicit class IDragDropHelperMutableBuilder[Self <: IDragDropHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubscribe(value: (HTMLElement, EventGroup, IDragDropOptions) => Dispose): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnsubscribe(value: (HTMLElement, String) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
    }
  }
  
  trait IDragDropOptions extends StObject {
    
    /**
      * Whether or not drag action is allowed.
      */
    var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.undefined
    
    /**
      * Whether or not drop action is allowed.
      */
    var canDrop: js.UndefOr[
        js.Function2[
          /* dropContext */ js.UndefOr[IDragDropContext], 
          /* dragContext */ js.UndefOr[IDragDropContext], 
          Boolean
        ]
      ] = js.undefined
    
    /**
      * Context associated with drag and drop event.
      */
    var context: IDragDropContext
    
    /**
      * Map of event name to callback function to subscribe to.
      */
    var eventMap: js.UndefOr[js.Array[Callback]] = js.undefined
    
    /**
      * Unique key to associate with instance.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * On drag end event callback.
      */
    var onDragEnd: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
      ] = js.undefined
    
    /**
      * On drag over element(s) event callback.
      */
    var onDragOver: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
      ] = js.undefined
    
    /**
      * On drag start event callback.
      */
    var onDragStart: js.UndefOr[
        js.Function4[
          /* item */ js.UndefOr[js.Any], 
          /* itemIndex */ js.UndefOr[Double], 
          /* selectedItems */ js.UndefOr[js.Array[js.Any]], 
          /* event */ js.UndefOr[MouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * On drop event callback.
      */
    var onDrop: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
      ] = js.undefined
    
    /**
      * Selection index on drag and drop event.
      */
    var selectionIndex: Double
    
    /**
      * Callback on drop state update.
      */
    def updateDropState(isDropping: Boolean, event: DragEvent): Unit
  }
  object IDragDropOptions {
    
    @scala.inline
    def apply(context: IDragDropContext, selectionIndex: Double, updateDropState: (Boolean, DragEvent) => Unit): IDragDropOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any], updateDropState = js.Any.fromFunction2(updateDropState))
      __obj.asInstanceOf[IDragDropOptions]
    }
    
    @scala.inline
    implicit class IDragDropOptionsMutableBuilder[Self <: IDragDropOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanDrag(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "canDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanDragUndefined: Self = StObject.set(x, "canDrag", js.undefined)
      
      @scala.inline
      def setCanDrop(
        value: (/* dropContext */ js.UndefOr[IDragDropContext], /* dragContext */ js.UndefOr[IDragDropContext]) => Boolean
      ): Self = StObject.set(x, "canDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
      
      @scala.inline
      def setContext(value: IDragDropContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventMap(value: js.Array[Callback]): Self = StObject.set(x, "eventMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventMapUndefined: Self = StObject.set(x, "eventMap", js.undefined)
      
      @scala.inline
      def setEventMapVarargs(value: Callback*): Self = StObject.set(x, "eventMap", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(
        value: (/* item */ js.UndefOr[js.Any], /* itemIndex */ js.UndefOr[Double], /* selectedItems */ js.UndefOr[js.Array[js.Any]], /* event */ js.UndefOr[MouseEvent]) => Unit
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDrop(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setSelectionIndex(value: Double): Self = StObject.set(x, "selectionIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDropState(value: (Boolean, DragEvent) => Unit): Self = StObject.set(x, "updateDropState", js.Any.fromFunction2(value))
    }
  }
  
  trait IDragDropTarget extends StObject {
    
    var key: String
    
    var options: IDragDropOptions
    
    var root: HTMLElement
  }
  object IDragDropTarget {
    
    @scala.inline
    def apply(key: String, options: IDragDropOptions, root: HTMLElement): IDragDropTarget = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDragDropTarget]
    }
    
    @scala.inline
    implicit class IDragDropTargetMutableBuilder[Self <: IDragDropTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: IDragDropOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: HTMLElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
