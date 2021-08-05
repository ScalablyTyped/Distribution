package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ShouldFadeIn
import typings.officeUiFabricReact.imageTypesMod.IImageProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "Image")
  @js.native
  val Image: FunctionComponent[IImageProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase")
  @js.native
  class ImageBase protected ()
    extends typings.officeUiFabricReact.imageBaseMod.ImageBase {
    def this(props: IImageProps) = this()
  }
  /* static members */
  object ImageBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase._svgRegex")
    @js.native
    def _svgRegex: js.Any = js.native
    inline def _svgRegex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_svgRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase.defaultProps")
    @js.native
    def defaultProps: ShouldFadeIn = js.native
    inline def defaultProps_=(x: ShouldFadeIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageCoverStyle")
  @js.native
  object ImageCoverStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle & Double] = js.native
    
    /* 0 */ val landscape: typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle.landscape & Double = js.native
    
    /* 1 */ val portrait: typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle.portrait & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageFit")
  @js.native
  object ImageFit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.imageTypesMod.ImageFit & Double] = js.native
    
    /* 0 */ val center: typings.officeUiFabricReact.imageTypesMod.ImageFit.center & Double = js.native
    
    /* 5 */ val centerContain: typings.officeUiFabricReact.imageTypesMod.ImageFit.centerContain & Double = js.native
    
    /* 4 */ val centerCover: typings.officeUiFabricReact.imageTypesMod.ImageFit.centerCover & Double = js.native
    
    /* 1 */ val contain: typings.officeUiFabricReact.imageTypesMod.ImageFit.contain & Double = js.native
    
    /* 2 */ val cover: typings.officeUiFabricReact.imageTypesMod.ImageFit.cover & Double = js.native
    
    /* 3 */ val none: typings.officeUiFabricReact.imageTypesMod.ImageFit.none & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageLoadState")
  @js.native
  object ImageLoadState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.imageTypesMod.ImageLoadState & Double] = js.native
    
    /* 2 */ val error: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.error & Double = js.native
    
    /* 3 */ val errorLoaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.errorLoaded & Double = js.native
    
    /* 1 */ val loaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.loaded & Double = js.native
    
    /* 0 */ val notLoaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.notLoaded & Double = js.native
  }
}
