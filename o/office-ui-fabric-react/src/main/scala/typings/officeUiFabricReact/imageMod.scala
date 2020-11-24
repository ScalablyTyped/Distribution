package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ShouldFadeIn
import typings.officeUiFabricReact.imageTypesMod.IImageProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Image", JSImport.Namespace)
@js.native
object imageMod extends js.Object {
  
  val Image: FunctionComponent[IImageProps] = js.native
  
  @js.native
  class ImageBase protected ()
    extends typings.officeUiFabricReact.imageBaseMod.ImageBase {
    def this(props: IImageProps) = this()
  }
  /* static members */
  @js.native
  object ImageBase extends js.Object {
    
    var _svgRegex: js.Any = js.native
    
    var defaultProps: ShouldFadeIn = js.native
  }
  
  @js.native
  object ImageCoverStyle extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle with Double] = js.native
    
    /* 0 */ val landscape: typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle.landscape with Double = js.native
    
    /* 1 */ val portrait: typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle.portrait with Double = js.native
  }
  
  @js.native
  object ImageFit extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.imageTypesMod.ImageFit with Double] = js.native
    
    /* 0 */ val center: typings.officeUiFabricReact.imageTypesMod.ImageFit.center with Double = js.native
    
    /* 5 */ val centerContain: typings.officeUiFabricReact.imageTypesMod.ImageFit.centerContain with Double = js.native
    
    /* 4 */ val centerCover: typings.officeUiFabricReact.imageTypesMod.ImageFit.centerCover with Double = js.native
    
    /* 1 */ val contain: typings.officeUiFabricReact.imageTypesMod.ImageFit.contain with Double = js.native
    
    /* 2 */ val cover: typings.officeUiFabricReact.imageTypesMod.ImageFit.cover with Double = js.native
    
    /* 3 */ val none: typings.officeUiFabricReact.imageTypesMod.ImageFit.none with Double = js.native
  }
  
  @js.native
  object ImageLoadState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.imageTypesMod.ImageLoadState with Double] = js.native
    
    /* 2 */ val error: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.error with Double = js.native
    
    /* 3 */ val errorLoaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.errorLoaded with Double = js.native
    
    /* 1 */ val loaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.loaded with Double = js.native
    
    /* 0 */ val notLoaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.notLoaded with Double = js.native
  }
}
