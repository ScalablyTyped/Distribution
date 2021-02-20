package typings.officeUiFabricReact

import typings.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typings.officeUiFabricReact.stickyTypesMod.IStickyProps
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.Context
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickyStickyMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky", "Sticky")
  @js.native
  class Sticky protected ()
    extends Component[IStickyProps, IStickyState, js.Any] {
    def this(props: IStickyProps) = this()
    
    var _activeElement: js.Any = js.native
    
    var _getBackground: js.Any = js.native
    
    var _getContentStyles: js.Any = js.native
    
    var _getContext: js.Any = js.native
    
    var _getNonStickyDistanceFromTop: js.Any = js.native
    
    var _getNonStickyPlaceholderHeightAndWidth: js.Any = js.native
    
    var _getStickyDistanceFromTop: js.Any = js.native
    
    var _getStickyDistanceFromTopForFooter: js.Any = js.native
    
    var _getStickyPlaceholderHeight: js.Any = js.native
    
    var _nonStickyContent: js.Any = js.native
    
    var _onScrollEvent: js.Any = js.native
    
    var _placeHolder: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _stickyContentBottom: js.Any = js.native
    
    var _stickyContentTop: js.Any = js.native
    
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
    @scala.inline
    def contextType_=(x: Context[IScrollablePaneContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky", "Sticky.defaultProps")
    @js.native
    def defaultProps: IStickyProps = js.native
    @scala.inline
    def defaultProps_=(x: IStickyProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IStickyContext extends StObject {
    
    var scrollablePane: Requireable[js.Object] = js.native
  }
  object IStickyContext {
    
    @scala.inline
    def apply(scrollablePane: Requireable[js.Object]): IStickyContext = {
      val __obj = js.Dynamic.literal(scrollablePane = scrollablePane.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStickyContext]
    }
    
    @scala.inline
    implicit class IStickyContextMutableBuilder[Self <: IStickyContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollablePane(value: Requireable[js.Object]): Self = StObject.set(x, "scrollablePane", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStickyState extends StObject {
    
    var distanceFromTop: js.UndefOr[Double] = js.native
    
    var isStickyBottom: Boolean = js.native
    
    var isStickyTop: Boolean = js.native
  }
  object IStickyState {
    
    @scala.inline
    def apply(isStickyBottom: Boolean, isStickyTop: Boolean): IStickyState = {
      val __obj = js.Dynamic.literal(isStickyBottom = isStickyBottom.asInstanceOf[js.Any], isStickyTop = isStickyTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStickyState]
    }
    
    @scala.inline
    implicit class IStickyStateMutableBuilder[Self <: IStickyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistanceFromTop(value: Double): Self = StObject.set(x, "distanceFromTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceFromTopUndefined: Self = StObject.set(x, "distanceFromTop", js.undefined)
      
      @scala.inline
      def setIsStickyBottom(value: Boolean): Self = StObject.set(x, "isStickyBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStickyTop(value: Boolean): Self = StObject.set(x, "isStickyTop", value.asInstanceOf[js.Any])
    }
  }
}
