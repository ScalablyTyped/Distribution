package typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageLoadState with Double] = js.native
  /* 2 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 3 */ @js.native
  object errorLoaded extends TopLevel[errorLoaded with Double]
  
  /* 1 */ @js.native
  object loaded extends TopLevel[loaded with Double]
  
  /* 0 */ @js.native
  object notLoaded extends TopLevel[notLoaded with Double]
  
}

