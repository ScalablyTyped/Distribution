package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.IsEnabled
import typings.officeUiFabricReact.libComponentsMarqueeSelectionMarqueeSelectionDottypesMod.IMarqueeSelectionProps
import typings.react.mod.Component
import typings.uifabricUtilities.libIrectangleMod.IRectangle
import typings.uifabricUtilities.libPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMarqueeSelectionMarqueeSelectionDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/MarqueeSelection/MarqueeSelection.base", "MarqueeSelectionBase")
  @js.native
  open class MarqueeSelectionBase protected () extends Component[IMarqueeSelectionProps, IMarqueeSelectionState, Any] {
    def this(props: IMarqueeSelectionProps) = this()
    
    /* private */ var _allSelectedIndices: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _autoScroll: Any = js.native
    
    /* private */ var _dragOrigin: Any = js.native
    
    /* private */ var _evaluateSelection: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _getRootRect: Any = js.native
    
    /**
      * We do not want to start the marquee if we're trying to marquee
      * from within an existing marquee selection.
      */
    /* private */ var _isDragStartInSelection: Any = js.native
    
    /* private */ var _isInSelectionToggle: Any = js.native
    
    /** Determine if the mouse event occured on a scrollbar of the target element. */
    /* private */ var _isMouseEventOnScrollbar: Any = js.native
    
    /* private */ var _isPointInRectangle: Any = js.native
    
    /* private */ var _isTouch: Any = js.native
    
    /* private */ var _itemRectCache: Any = js.native
    
    /* private */ var _lastMouseEvent: Any = js.native
    
    /* private */ var _onAsyncMouseMove: Any = js.native
    
    /* private */ var _onMouseDown: Any = js.native
    
    /* private */ var _onMouseMove: Any = js.native
    
    /* private */ var _onMouseUp: Any = js.native
    
    /* private */ var _onPointerDown: Any = js.native
    
    /* private */ var _onTouchStart: Any = js.native
    
    /* private */ var _preservedIndicies: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _rootRect: Any = js.native
    
    /* private */ var _scrollLeft: Any = js.native
    
    /* private */ var _scrollTop: Any = js.native
    
    /* private */ var _scrollableParent: Any = js.native
    
    /* private */ var _scrollableSurface: Any = js.native
    
    /* private */ var _selectedIndicies: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MMarqueeSelectionBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MMarqueeSelectionBase(): Unit = js.native
  }
  /* static members */
  object MarqueeSelectionBase {
    
    @JSImport("office-ui-fabric-react/lib/components/MarqueeSelection/MarqueeSelection.base", "MarqueeSelectionBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/MarqueeSelection/MarqueeSelection.base", "MarqueeSelectionBase.defaultProps")
    @js.native
    def defaultProps: IsEnabled = js.native
    inline def defaultProps_=(x: IsEnabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IMarqueeSelectionState extends StObject {
    
    var dragOrigin: js.UndefOr[Point] = js.undefined
    
    var dragRect: js.UndefOr[IRectangle] = js.undefined
  }
  object IMarqueeSelectionState {
    
    inline def apply(): IMarqueeSelectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMarqueeSelectionState]
    }
    
    extension [Self <: IMarqueeSelectionState](x: Self) {
      
      inline def setDragOrigin(value: Point): Self = StObject.set(x, "dragOrigin", value.asInstanceOf[js.Any])
      
      inline def setDragOriginUndefined: Self = StObject.set(x, "dragOrigin", js.undefined)
      
      inline def setDragRect(value: IRectangle): Self = StObject.set(x, "dragRect", value.asInstanceOf[js.Any])
      
      inline def setDragRectUndefined: Self = StObject.set(x, "dragRect", js.undefined)
    }
  }
}
