package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ShouldFadeIn
import typings.officeUiFabricReact.imageTypesMod.IImageProps
import typings.officeUiFabricReact.imageTypesMod.ImageLoadState
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Image/Image.base", "ImageBase")
  @js.native
  class ImageBase protected ()
    extends Component[IImageProps, IImageState, js.Any] {
    def this(props: IImageProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MImageBase(nextProps: IImageProps): Unit = js.native
    
    var _checkImageLoaded: js.Any = js.native
    
    var _computeCoverStyle: js.Any = js.native
    
    var _coverStyle: js.Any = js.native
    
    var _frameElement: js.Any = js.native
    
    var _imageElement: js.Any = js.native
    
    var _onImageError: js.Any = js.native
    
    var _onImageLoaded: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MImageBase(prevProps: IImageProps, prevState: IImageState): Unit = js.native
  }
  /* static members */
  object ImageBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Image/Image.base", "ImageBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Image/Image.base", "ImageBase._svgRegex")
    @js.native
    def _svgRegex: js.Any = js.native
    @scala.inline
    def _svgRegex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_svgRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Image/Image.base", "ImageBase.defaultProps")
    @js.native
    def defaultProps: ShouldFadeIn = js.native
    @scala.inline
    def defaultProps_=(x: ShouldFadeIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IImageState extends StObject {
    
    var loadState: js.UndefOr[ImageLoadState] = js.native
  }
  object IImageState {
    
    @scala.inline
    def apply(): IImageState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageState]
    }
    
    @scala.inline
    implicit class IImageStateMutableBuilder[Self <: IImageState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadState(value: ImageLoadState): Self = StObject.set(x, "loadState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadStateUndefined: Self = StObject.set(x, "loadState", js.undefined)
    }
  }
}
