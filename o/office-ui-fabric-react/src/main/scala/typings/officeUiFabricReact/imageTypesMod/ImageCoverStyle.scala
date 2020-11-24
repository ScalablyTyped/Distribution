package typings.officeUiFabricReact.imageTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImageCoverStyle extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageCoverStyle")
@js.native
object ImageCoverStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageCoverStyle with Double] = js.native
  
  /**
    * The image will be shown at 100% height of container and the width will be scaled accordingly
    */
  @js.native
  sealed trait landscape extends ImageCoverStyle
  /* 0 */ @js.native
  object landscape extends TopLevel[landscape with Double]
  
  /**
    * The image will be shown at 100% width of container and the height will be scaled accordingly
    */
  @js.native
  sealed trait portrait extends ImageCoverStyle
  /* 1 */ @js.native
  object portrait extends TopLevel[portrait with Double]
}
