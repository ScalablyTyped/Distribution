package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ShouldFadeIn
import typings.officeUiFabricReact.libComponentsImageImageDottypesMod.IImageProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImageMod {
  
  @JSImport("office-ui-fabric-react/lib/Image", "Image")
  @js.native
  val Image: FunctionComponent[IImageProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Image", "ImageBase")
  @js.native
  open class ImageBase protected ()
    extends typings.officeUiFabricReact.libComponentsImageMod.ImageBase {
    def this(props: IImageProps) = this()
  }
  /* static members */
  object ImageBase {
    
    @JSImport("office-ui-fabric-react/lib/Image", "ImageBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Image", "ImageBase._svgRegex")
    @js.native
    def _svgRegex: Any = js.native
    inline def _svgRegex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_svgRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/Image", "ImageBase.defaultProps")
    @js.native
    def defaultProps: ShouldFadeIn = js.native
    inline def defaultProps_=(x: ShouldFadeIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Image", "ImageCoverStyle")
  @js.native
  object ImageCoverStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageCoverStyle & Double
      ] = js.native
    
    /* 0 */ val landscape: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageCoverStyle.landscape & Double = js.native
    
    /* 1 */ val portrait: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageCoverStyle.portrait & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Image", "ImageFit")
  @js.native
  object ImageFit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit & Double] = js.native
    
    /* 0 */ val center: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.center & Double = js.native
    
    /* 5 */ val centerContain: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.centerContain & Double = js.native
    
    /* 4 */ val centerCover: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.centerCover & Double = js.native
    
    /* 1 */ val contain: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.contain & Double = js.native
    
    /* 2 */ val cover: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.cover & Double = js.native
    
    /* 3 */ val none: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.none & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Image", "ImageLoadState")
  @js.native
  object ImageLoadState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState & Double
      ] = js.native
    
    /* 2 */ val error: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.error & Double = js.native
    
    /* 3 */ val errorLoaded: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.errorLoaded & Double = js.native
    
    /* 1 */ val loaded: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.loaded & Double = js.native
    
    /* 0 */ val notLoaded: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.notLoaded & Double = js.native
  }
}
