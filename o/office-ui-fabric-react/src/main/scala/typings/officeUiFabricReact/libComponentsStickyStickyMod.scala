package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsScrollablePaneScrollablePaneDottypesMod.IScrollablePaneContext
import typings.officeUiFabricReact.libComponentsStickyStickyDottypesMod.IStickyProps
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.Context
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsStickyStickyMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky", "Sticky")
  @js.native
  open class Sticky protected () extends Component[IStickyProps, IStickyState, Any] {
    def this(props: IStickyProps) = this()
    
    /* private */ var _activeElement: Any = js.native
    
    /* private */ var _getBackground: Any = js.native
    
    /* private */ var _getContentStyles: Any = js.native
    
    /* private */ var _getContext: Any = js.native
    
    /* private */ var _getNonStickyDistanceFromTop: Any = js.native
    
    /* private */ var _getNonStickyPlaceholderHeightAndWidth: Any = js.native
    
    /* private */ var _getStickyDistanceFromTop: Any = js.native
    
    /* private */ var _getStickyDistanceFromTopForFooter: Any = js.native
    
    /* private */ var _getStickyPlaceholderHeight: Any = js.native
    
    /* private */ var _nonStickyContent: Any = js.native
    
    /* private */ var _onScrollEvent: Any = js.native
    
    /* private */ var _placeHolder: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _stickyContentBottom: Any = js.native
    
    /* private */ var _stickyContentTop: Any = js.native
    
    def addSticky(stickyContent: HTMLDivElement): Unit = js.native
    
    val canStickyBottom: Boolean = js.native
    
    val canStickyTop: Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSticky(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSticky(prevProps: IStickyProps, prevState: IStickyState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSticky(): Unit = js.native
    
    val nonStickyContent: HTMLDivElement | Null = js.native
    
    val placeholder: HTMLDivElement | Null = js.native
    
    def resetSticky(): Unit = js.native
    
    val root: HTMLDivElement | Null = js.native
    
    def setDistanceFromTop(container: HTMLDivElement): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MSticky(nextProps: IStickyProps, nextState: IStickyState): Boolean = js.native
    
    val stickyContentBottom: HTMLDivElement | Null = js.native
    
    val stickyContentTop: HTMLDivElement | Null = js.native
    
    def syncScroll(container: HTMLElement): Unit = js.native
  }
  /* static members */
  object Sticky {
    
    @JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky", "Sticky")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky", "Sticky.contextType")
    @js.native
    def contextType: Context[IScrollablePaneContext] = js.native
    inline def contextType_=(x: Context[IScrollablePaneContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky", "Sticky.defaultProps")
    @js.native
    def defaultProps: IStickyProps = js.native
    inline def defaultProps_=(x: IStickyProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IStickyContext extends StObject {
    
    var scrollablePane: Requireable[js.Object]
  }
  object IStickyContext {
    
    inline def apply(scrollablePane: Requireable[js.Object]): IStickyContext = {
      val __obj = js.Dynamic.literal(scrollablePane = scrollablePane.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStickyContext]
    }
    
    extension [Self <: IStickyContext](x: Self) {
      
      inline def setScrollablePane(value: Requireable[js.Object]): Self = StObject.set(x, "scrollablePane", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStickyState extends StObject {
    
    var distanceFromTop: js.UndefOr[Double] = js.undefined
    
    var isStickyBottom: Boolean
    
    var isStickyTop: Boolean
  }
  object IStickyState {
    
    inline def apply(isStickyBottom: Boolean, isStickyTop: Boolean): IStickyState = {
      val __obj = js.Dynamic.literal(isStickyBottom = isStickyBottom.asInstanceOf[js.Any], isStickyTop = isStickyTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStickyState]
    }
    
    extension [Self <: IStickyState](x: Self) {
      
      inline def setDistanceFromTop(value: Double): Self = StObject.set(x, "distanceFromTop", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromTopUndefined: Self = StObject.set(x, "distanceFromTop", js.undefined)
      
      inline def setIsStickyBottom(value: Boolean): Self = StObject.set(x, "isStickyBottom", value.asInstanceOf[js.Any])
      
      inline def setIsStickyTop(value: Boolean): Self = StObject.set(x, "isStickyTop", value.asInstanceOf[js.Any])
    }
  }
}
