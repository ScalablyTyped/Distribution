package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ShouldFadeIn
import typings.officeUiFabricReact.imageTypesMod.IImageProps
import typings.officeUiFabricReact.imageTypesMod.ImageLoadState
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Image/Image.base", "ImageBase")
  @js.native
  class ImageBase protected ()
    extends Component[IImageProps, IImageState, js.Any] {
    def this(props: IImageProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MImageBase(nextProps: IImageProps): Unit = js.native
    
    /* private */ var _checkImageLoaded: js.Any = js.native
    
    /* private */ var _computeCoverStyle: js.Any = js.native
    
    /* private */ var _coverStyle: js.Any = js.native
    
    /* private */ var _frameElement: js.Any = js.native
    
    /* private */ var _imageElement: js.Any = js.native
    
    /* private */ var _onImageError: js.Any = js.native
    
    /* private */ var _onImageLoaded: js.Any = js.native
    
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
    inline def _svgRegex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_svgRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Image/Image.base", "ImageBase.defaultProps")
    @js.native
    def defaultProps: ShouldFadeIn = js.native
    inline def defaultProps_=(x: ShouldFadeIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IImageState extends StObject {
    
    var loadState: js.UndefOr[ImageLoadState] = js.undefined
  }
  object IImageState {
    
    inline def apply(): IImageState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageState]
    }
    
    extension [Self <: IImageState](x: Self) {
      
      inline def setLoadState(value: ImageLoadState): Self = StObject.set(x, "loadState", value.asInstanceOf[js.Any])
      
      inline def setLoadStateUndefined: Self = StObject.set(x, "loadState", js.undefined)
    }
  }
}
