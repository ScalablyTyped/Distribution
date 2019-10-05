package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.IImageProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Image", JSImport.Namespace)
@js.native
object libImageMod extends js.Object {
  @js.native
  class ImageBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsImageMod.ImageBase {
    def this(props: IImageProps) = this()
  }
  
  val Image: StatelessComponent[IImageProps] = js.native
  /* static members */
  @js.native
  object ImageBase extends js.Object {
    var _svgRegex: js.Any = js.native
    var defaultProps: Anon_ShouldFadeIn = js.native
  }
  
  @js.native
  object ImageCoverStyle extends js.Object {
    /* 0 */ val landscape: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageCoverStyle.landscape with Double = js.native
    /* 1 */ val portrait: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageCoverStyle.portrait with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageCoverStyle with Double
      ] = js.native
  }
  
  @js.native
  object ImageFit extends js.Object {
    /* 0 */ val center: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.center with Double = js.native
    /* 5 */ val centerContain: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.centerContain with Double = js.native
    /* 4 */ val centerCover: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.centerCover with Double = js.native
    /* 1 */ val contain: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.contain with Double = js.native
    /* 2 */ val cover: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.cover with Double = js.native
    /* 3 */ val none: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit with Double
      ] = js.native
  }
  
  @js.native
  object ImageLoadState extends js.Object {
    /* 2 */ val error: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.error with Double = js.native
    /* 3 */ val errorLoaded: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.errorLoaded with Double = js.native
    /* 1 */ val loaded: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.loaded with Double = js.native
    /* 0 */ val notLoaded: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.notLoaded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState with Double
      ] = js.native
  }
  
}

