package typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageLoadState extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageLoadState")
@js.native
object ImageLoadState extends js.Object {
  /**
    * An error has been encountered while loading the image.
    */
  @js.native
  sealed trait error extends ImageLoadState
  
  /**
    * Deprecated at v1.3.6, to replace the src in case of errors, use `onLoadingStateChange` instead
    * and rerender the Image with a difference src.
    * @deprecated Use `onLoadingStateChange` instead
    * and rerender the Image with a difference src.
    */
  @js.native
  sealed trait errorLoaded extends ImageLoadState
  
  /**
    * The image has been loaded successfully.
    */
  @js.native
  sealed trait loaded extends ImageLoadState
  
  /**
    * The image has not yet been loaded, and there is no error yet.
    */
  @js.native
  sealed trait notLoaded extends ImageLoadState
  
  /* 2 */ val error: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.error with Double = js.native
  /* 3 */ val errorLoaded: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.errorLoaded with Double = js.native
  /* 1 */ val loaded: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.loaded with Double = js.native
  /* 0 */ val notLoaded: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.notLoaded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageLoadState with Double] = js.native
}

