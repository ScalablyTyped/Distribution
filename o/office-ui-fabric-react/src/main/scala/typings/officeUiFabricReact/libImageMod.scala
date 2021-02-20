package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ShouldFadeIn
import typings.officeUiFabricReact.imageTypesMod.IImageProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImageMod {
  
  @JSImport("office-ui-fabric-react/lib/Image", "Image")
  @js.native
  val Image: FunctionComponent[IImageProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Image", "ImageBase")
  @js.native
  class ImageBase protected ()
    extends typings.officeUiFabricReact.imageMod.ImageBase {
    def this(props: IImageProps) = this()
  }
  /* static members */
  object ImageBase {
    
    @JSImport("office-ui-fabric-react/lib/Image", "ImageBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Image", "ImageBase._svgRegex")
    @js.native
    def _svgRegex: js.Any = js.native
    @scala.inline
    def _svgRegex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_svgRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/Image", "ImageBase.defaultProps")
    @js.native
    def defaultProps: ShouldFadeIn = js.native
    @scala.inline
    def defaultProps_=(x: ShouldFadeIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Image", "ImageCoverStyle")
  @js.native
  object ImageCoverStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle with Double] = js.native
    
    /* 0 */ val landscape: typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle.landscape with Double = js.native
    
    /* 1 */ val portrait: typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle.portrait with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Image", "ImageFit")
  @js.native
  object ImageFit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.imageTypesMod.ImageFit with Double] = js.native
    
    /* 0 */ val center: typings.officeUiFabricReact.imageTypesMod.ImageFit.center with Double = js.native
    
    /* 5 */ val centerContain: typings.officeUiFabricReact.imageTypesMod.ImageFit.centerContain with Double = js.native
    
    /* 4 */ val centerCover: typings.officeUiFabricReact.imageTypesMod.ImageFit.centerCover with Double = js.native
    
    /* 1 */ val contain: typings.officeUiFabricReact.imageTypesMod.ImageFit.contain with Double = js.native
    
    /* 2 */ val cover: typings.officeUiFabricReact.imageTypesMod.ImageFit.cover with Double = js.native
    
    /* 3 */ val none: typings.officeUiFabricReact.imageTypesMod.ImageFit.none with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Image", "ImageLoadState")
  @js.native
  object ImageLoadState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.imageTypesMod.ImageLoadState with Double] = js.native
    
    /* 2 */ val error: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.error with Double = js.native
    
    /* 3 */ val errorLoaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.errorLoaded with Double = js.native
    
    /* 1 */ val loaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.loaded with Double = js.native
    
    /* 0 */ val notLoaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.notLoaded with Double = js.native
  }
}
