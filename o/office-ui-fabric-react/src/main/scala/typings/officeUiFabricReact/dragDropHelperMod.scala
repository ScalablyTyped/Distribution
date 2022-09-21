package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Dispose
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropOptions
import typings.officeUiFabricReact.utilitiesMod.EventGroup
import typings.std.HTMLElement
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragDropHelperMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/dragdrop/DragDropHelper", "DragDropHelper")
  @js.native
  open class DragDropHelper protected ()
    extends StObject
       with IDragDropHelper {
    def this(params: IDragDropHelperParams) = this()
    
    /* private */ var _activeTargets: Any = js.native
    
    /* private */ var _dragData: Any = js.native
    
    /* private */ var _dragEnterCounts: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _initialized: Any = js.native
    
    /**
      * determine whether the child target is a descendant of the parent
      */
    /* private */ var _isChild: Any = js.native
    
    /* private */ var _isDraggable: Any = js.native
    
    /* private */ var _isDragging: Any = js.native
    
    /* private */ var _isDroppable: Any = js.native
    
    /* private */ var _lastId: Any = js.native
    
    /**
      * clear drag data when mouse up outside of the document
      */
    /* private */ var _onDocumentMouseUp: Any = js.native
    
    /* private */ var _onDragEnd: Any = js.native
    
    /**
      * when mouse down on a draggable item, we start to track dragdata.
      */
    /* private */ var _onMouseDown: Any = js.native
    
    /**
      * when mouse leave a target while dragging some items, fire dragleave to the target
      */
    /* private */ var _onMouseLeave: Any = js.native
    
    /**
      * when mouse move over a new drop target while dragging some items,
      * fire dragleave on the old target and fire dragenter to the new target
      * The target will handle style change on dragenter and dragleave events.
      */
    /* private */ var _onMouseMove: Any = js.native
    
    /**
      * clear drag data when mouse up on body
      */
    /* private */ var _onMouseUp: Any = js.native
    
    /* private */ var _selection: Any = js.native
    
    /**
      * Dispose of listeners bound to instance of helper.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Subscribe to events on a DOM node with drag and drop configuration.
      */
    /* CompleteClass */
    override def subscribe(root: HTMLElement, events: EventGroup, options: IDragDropOptions): Dispose = js.native
    
    /**
      * Unsubscribe to events registered on a DOM node with key.
      */
    /* CompleteClass */
    override def unsubscribe(root: HTMLElement, key: String): Unit = js.native
  }
  
  trait IDragDropHelperParams extends StObject {
    
    var minimumPixelsForDrag: js.UndefOr[Double] = js.undefined
    
    var selection: ISelection[IObjectWithKey]
  }
  object IDragDropHelperParams {
    
    inline def apply(selection: ISelection[IObjectWithKey]): IDragDropHelperParams = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDragDropHelperParams]
    }
    
    extension [Self <: IDragDropHelperParams](x: Self) {
      
      inline def setMinimumPixelsForDrag(value: Double): Self = StObject.set(x, "minimumPixelsForDrag", value.asInstanceOf[js.Any])
      
      inline def setMinimumPixelsForDragUndefined: Self = StObject.set(x, "minimumPixelsForDrag", js.undefined)
      
      inline def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
}
