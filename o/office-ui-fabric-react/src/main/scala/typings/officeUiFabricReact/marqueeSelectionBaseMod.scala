package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.IsEnabled
import typings.officeUiFabricReact.marqueeSelectionTypesMod.IMarqueeSelectionProps
import typings.react.mod.Component
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marqueeSelectionBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/MarqueeSelection/MarqueeSelection.base", "MarqueeSelectionBase")
  @js.native
  class MarqueeSelectionBase protected ()
    extends Component[IMarqueeSelectionProps, IMarqueeSelectionState, js.Any] {
    def this(props: IMarqueeSelectionProps) = this()
    
    var _allSelectedIndices: js.Any = js.native
    
    var _async: js.Any = js.native
    
    var _autoScroll: js.Any = js.native
    
    var _dragOrigin: js.Any = js.native
    
    var _evaluateSelection: js.Any = js.native
    
    var _events: js.Any = js.native
    
    var _getRootRect: js.Any = js.native
    
    /**
      * We do not want to start the marquee if we're trying to marquee
      * from within an existing marquee selection.
      */
    var _isDragStartInSelection: js.Any = js.native
    
    var _isInSelectionToggle: js.Any = js.native
    
    /** Determine if the mouse event occured on a scrollbar of the target element. */
    var _isMouseEventOnScrollbar: js.Any = js.native
    
    var _isPointInRectangle: js.Any = js.native
    
    var _isTouch: js.Any = js.native
    
    var _itemRectCache: js.Any = js.native
    
    var _lastMouseEvent: js.Any = js.native
    
    var _onAsyncMouseMove: js.Any = js.native
    
    var _onMouseDown: js.Any = js.native
    
    var _onMouseMove: js.Any = js.native
    
    var _onMouseUp: js.Any = js.native
    
    var _onPointerDown: js.Any = js.native
    
    var _onTouchStart: js.Any = js.native
    
    var _preservedIndicies: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _rootRect: js.Any = js.native
    
    var _scrollLeft: js.Any = js.native
    
    var _scrollTop: js.Any = js.native
    
    var _scrollableParent: js.Any = js.native
    
    var _scrollableSurface: js.Any = js.native
    
    var _selectedIndicies: js.Any = js.native
    
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
    @scala.inline
    def defaultProps_=(x: IsEnabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IMarqueeSelectionState extends StObject {
    
    var dragOrigin: js.UndefOr[Point] = js.undefined
    
    var dragRect: js.UndefOr[IRectangle] = js.undefined
  }
  object IMarqueeSelectionState {
    
    @scala.inline
    def apply(): IMarqueeSelectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMarqueeSelectionState]
    }
    
    @scala.inline
    implicit class IMarqueeSelectionStateMutableBuilder[Self <: IMarqueeSelectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragOrigin(value: Point): Self = StObject.set(x, "dragOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOriginUndefined: Self = StObject.set(x, "dragOrigin", js.undefined)
      
      @scala.inline
      def setDragRect(value: IRectangle): Self = StObject.set(x, "dragRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragRectUndefined: Self = StObject.set(x, "dragRect", js.undefined)
    }
  }
}
