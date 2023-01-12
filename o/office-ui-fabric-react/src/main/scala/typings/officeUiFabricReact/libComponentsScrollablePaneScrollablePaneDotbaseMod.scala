package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsScrollablePaneScrollablePaneDottypesMod.IScrollablePane
import typings.officeUiFabricReact.libComponentsScrollablePaneScrollablePaneDottypesMod.IScrollablePaneProps
import typings.officeUiFabricReact.libStickyMod.Sticky
import typings.react.mod.Component
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsScrollablePaneScrollablePaneDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ScrollablePane/ScrollablePane.base", "ScrollablePaneBase")
  @js.native
  open class ScrollablePaneBase protected ()
    extends Component[IScrollablePaneProps, IScrollablePaneState, Any]
       with IScrollablePane {
    def this(props: IScrollablePaneProps) = this()
    
    /* private */ var _addToStickyContainer: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _checkStickyStatus: Any = js.native
    
    /* private */ var _contentContainer: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _getScrollablePaneContext: Any = js.native
    
    /* private */ var _getScrollbarHeight: Any = js.native
    
    /* private */ var _getScrollbarWidth: Any = js.native
    
    /* private */ var _getStickyContainerStyle: Any = js.native
    
    /* private */ var _mutationObserver: Any = js.native
    
    /* private */ var _notifyThrottled: Any = js.native
    
    /* private */ var _onScroll: Any = js.native
    
    /* private */ var _onWindowResize: Any = js.native
    
    /* private */ var _removeStickyFromContainers: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _stickies: Any = js.native
    
    /* private */ var _stickyAboveRef: Any = js.native
    
    /* private */ var _stickyBelowRef: Any = js.native
    
    /* private */ var _subscribers: Any = js.native
    
    def addSticky(sticky: Sticky): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MScrollablePaneBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MScrollablePaneBase(prevProps: IScrollablePaneProps, prevState: IScrollablePaneState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MScrollablePaneBase(): Unit = js.native
    
    val contentContainer: HTMLDivElement | Null = js.native
    
    /** Triggers a layout update for the pane. */
    /* CompleteClass */
    override def forceLayoutUpdate(): Unit = js.native
    
    /** Gets the current scroll position of the scrollable pane */
    /* CompleteClass */
    override def getScrollPosition(): Double = js.native
    
    def notifySubscribers(): Unit = js.native
    
    def removeSticky(sticky: Sticky): Unit = js.native
    
    val root: HTMLDivElement | Null = js.native
    
    def setStickiesDistanceFromTop(): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MScrollablePaneBase(nextProps: IScrollablePaneProps, nextState: IScrollablePaneState): Boolean = js.native
    
    def sortSticky(sticky: Sticky): Unit = js.native
    def sortSticky(sticky: Sticky, sortAgain: Boolean): Unit = js.native
    
    val stickyAbove: HTMLDivElement | Null = js.native
    
    val stickyBelow: HTMLDivElement | Null = js.native
    
    def subscribe(handler: js.Function): Unit = js.native
    
    def syncScrollSticky(sticky: Sticky): Unit = js.native
    
    def unsubscribe(handler: js.Function): Unit = js.native
    
    def updateStickyRefHeights(): Unit = js.native
  }
  
  trait IScrollablePaneState extends StObject {
    
    var scrollbarHeight: Double
    
    var scrollbarWidth: Double
    
    var stickyBottomHeight: Double
    
    var stickyTopHeight: Double
  }
  object IScrollablePaneState {
    
    inline def apply(
      scrollbarHeight: Double,
      scrollbarWidth: Double,
      stickyBottomHeight: Double,
      stickyTopHeight: Double
    ): IScrollablePaneState = {
      val __obj = js.Dynamic.literal(scrollbarHeight = scrollbarHeight.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any], stickyBottomHeight = stickyBottomHeight.asInstanceOf[js.Any], stickyTopHeight = stickyTopHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollablePaneState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScrollablePaneState] (val x: Self) extends AnyVal {
      
      inline def setScrollbarHeight(value: Double): Self = StObject.set(x, "scrollbarHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollbarWidth(value: Double): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
      
      inline def setStickyBottomHeight(value: Double): Self = StObject.set(x, "stickyBottomHeight", value.asInstanceOf[js.Any])
      
      inline def setStickyTopHeight(value: Double): Self = StObject.set(x, "stickyTopHeight", value.asInstanceOf[js.Any])
    }
  }
}
