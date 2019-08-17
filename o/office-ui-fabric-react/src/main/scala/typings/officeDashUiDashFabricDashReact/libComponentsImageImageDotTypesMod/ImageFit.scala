package typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod

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
  sealed trait center extends ImageFit
  
  /**
    * The image will be centered horizontally and vertically within the frame and maintains its aspect ratio. It will
    * behave as ImageFit.center if the image's natural height and width is less than the Image frame's height and width,
    * but if either natural height or width are larger than the frame it will behave as ImageFit.contain.
    */
  @js.native
  sealed trait centerContain extends ImageFit
  
  /**
    * The image will be centered horizontally and vertically within the frame and maintains its aspect ratio. It will
    * behave as ImageFit.center if the image's natural height or width is less than the Image frame's height or width,
    * but if both natural height and width are larger than the frame it will behave as ImageFit.cover.
    */
  @js.native
  sealed trait centerCover extends ImageFit
  
  /**
    * The image is scaled to maintain its aspect ratio while being fully contained within the frame. The image will
    * be centered horizontally and vertically within the frame. The space in the top and bottom or in the sides of
    * the frame will be empty depending on the difference in aspect ratio between the image and the frame.
    */
  @js.native
  sealed trait contain extends ImageFit
  
  /**
    * The image is scaled to maintain its aspect ratio while filling the frame. Portions of the image will be cropped from
    * the top and bottom, or from the sides, depending on the difference in aspect ratio between the image and the frame.
    */
  @js.native
  sealed trait cover extends ImageFit
  
  /**
    * Neither the image nor the frame are scaled. If their sizes do not match, the image will either be cropped or the
    * frame will have empty space.
    */
  @js.native
  sealed trait none extends ImageFit
  
  /* 0 */ val center: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.center with Double = js.native
  /* 5 */ val centerContain: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.centerContain with Double = js.native
  /* 4 */ val centerCover: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.centerCover with Double = js.native
  /* 1 */ val contain: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.contain with Double = js.native
  /* 2 */ val cover: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.cover with Double = js.native
  /* 3 */ val none: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageFit with Double] = js.native
}

