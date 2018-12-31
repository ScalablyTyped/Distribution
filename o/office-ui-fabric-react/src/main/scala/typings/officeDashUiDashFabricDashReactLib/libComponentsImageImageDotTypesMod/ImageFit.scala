package typings
package officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageFit extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageFit")
@js.native
object ImageFit extends js.Object {
  /**
    * The image is not scaled. The image is centered and cropped within the content box.
    */
  @js.native
  sealed trait center
    extends officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.ImageFit
  
  /**
    * The image will be centered horizontally and vertically within the frame and maintains its aspect ratio. It will
    * behave as ImageFit.center if the image's natural height or width is less than the Image frame's height or width,
    * but if both natural height and width are larger than the frame it will behave as ImageFit.cover.
    */
  @js.native
  sealed trait centerCover
    extends officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.ImageFit
  
  /**
    * The image is scaled to maintain its aspect ratio while being fully contained within the frame. The image will
    * be centered horizontally and vertically within the frame. The space in the top and bottom or in the sides of
    * the frame will be empty depending on the difference in aspect ratio between the image and the frame.
    */
  @js.native
  sealed trait contain
    extends officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.ImageFit
  
  /**
    * The image is scaled to maintain its aspect ratio while filling the frame. Portions of the image will be cropped from
    * the top and bottom, or from the sides, depending on the difference in aspect ratio between the image and the frame.
    */
  @js.native
  sealed trait cover
    extends officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.ImageFit
  
  /**
    * Neither the image nor the frame are scaled. If their sizes do not match, the image will either be cropped or the
    * frame will have empty space.
    */
  @js.native
  sealed trait none
    extends officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.ImageFit
  
  /* 0 */ val center: center with scala.Double = js.native
  /* 4 */ val centerCover: centerCover with scala.Double = js.native
  /* 1 */ val contain: contain with scala.Double = js.native
  /* 2 */ val cover: cover with scala.Double = js.native
  /* 3 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.ImageFit with scala.Double
  ] = js.native
}

