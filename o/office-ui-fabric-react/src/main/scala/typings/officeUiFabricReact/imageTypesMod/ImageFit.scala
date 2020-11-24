package typings.officeUiFabricReact.imageTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImageFit extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageFit")
@js.native
object ImageFit extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageFit with Double] = js.native
  
  /**
    * The image is not scaled. The image is centered and cropped within the content box.
    */
  @js.native
  sealed trait center extends ImageFit
  /* 0 */ @js.native
  object center extends TopLevel[center with Double]
  
  /**
    * The image will be centered horizontally and vertically within the frame and maintains its aspect ratio. It will
    * behave as ImageFit.center if the image's natural height and width is less than the Image frame's height and width,
    * but if either natural height or width are larger than the frame it will behave as ImageFit.contain.
    */
  @js.native
  sealed trait centerContain extends ImageFit
  /* 5 */ @js.native
  object centerContain extends TopLevel[centerContain with Double]
  
  /**
    * The image will be centered horizontally and vertically within the frame and maintains its aspect ratio. It will
    * behave as ImageFit.center if the image's natural height or width is less than the Image frame's height or width,
    * but if both natural height and width are larger than the frame it will behave as ImageFit.cover.
    */
  @js.native
  sealed trait centerCover extends ImageFit
  /* 4 */ @js.native
  object centerCover extends TopLevel[centerCover with Double]
  
  /**
    * The image is scaled to maintain its aspect ratio while being fully contained within the frame. The image will
    * be centered horizontally and vertically within the frame. The space in the top and bottom or in the sides of
    * the frame will be empty depending on the difference in aspect ratio between the image and the frame.
    */
  @js.native
  sealed trait contain extends ImageFit
  /* 1 */ @js.native
  object contain extends TopLevel[contain with Double]
  
  /**
    * The image is scaled to maintain its aspect ratio while filling the frame. Portions of the image will be cropped
    * from the top and bottom, or the sides, depending on the difference in aspect ratio between the image and the frame.
    */
  @js.native
  sealed trait cover extends ImageFit
  /* 2 */ @js.native
  object cover extends TopLevel[cover with Double]
  
  /**
    * Neither the image nor the frame are scaled. If their sizes do not match, the image will either be cropped or the
    * frame will have empty space.
    */
  @js.native
  sealed trait none extends ImageFit
  /* 3 */ @js.native
  object none extends TopLevel[none with Double]
}
