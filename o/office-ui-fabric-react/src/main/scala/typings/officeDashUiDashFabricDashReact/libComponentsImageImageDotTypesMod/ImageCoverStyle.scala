package typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageCoverStyle extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageCoverStyle")
@js.native
object ImageCoverStyle extends js.Object {
  /**
    * The image will be shown at 100% height of container and the width will be scaled accordingly
    */
  @js.native
  sealed trait landscape extends ImageCoverStyle
  
  /**
    * The image will be shown at 100% width of container and the height will be scaled accordingly
    */
  @js.native
  sealed trait portrait extends ImageCoverStyle
  
  /* 0 */ val landscape: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageCoverStyle.landscape with Double = js.native
  /* 1 */ val portrait: typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageCoverStyle.portrait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageCoverStyle with Double] = js.native
}

