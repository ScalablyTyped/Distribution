package typings.officeUiFabricReact

import typings.officeUiFabricReact.shimmerTypesMod.IShimmerProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.base", "ShimmerBase")
  @js.native
  class ShimmerBase protected ()
    extends Component[IShimmerProps, IShimmerState, js.Any] {
    def this(props: IShimmerProps) = this()
    
    var _async: js.Any = js.native
    
    var _classNames: js.Any = js.native
    
    var _lastTimeoutId: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MShimmerBase(prevProps: IShimmerProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MShimmerBase(): Unit = js.native
  }
  /* static members */
  object ShimmerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.base", "ShimmerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.base", "ShimmerBase.defaultProps")
    @js.native
    def defaultProps: IShimmerProps = js.native
    @scala.inline
    def defaultProps_=(x: IShimmerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IShimmerState extends StObject {
    
    /**
      * Flag for knowing when to remove the shimmerWrapper from the DOM.
      */
    var contentLoaded: js.UndefOr[Boolean] = js.undefined
  }
  object IShimmerState {
    
    @scala.inline
    def apply(): IShimmerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerState]
    }
    
    @scala.inline
    implicit class IShimmerStateMutableBuilder[Self <: IShimmerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentLoaded(value: Boolean): Self = StObject.set(x, "contentLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLoadedUndefined: Self = StObject.set(x, "contentLoaded", js.undefined)
    }
  }
}
