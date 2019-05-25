package typings
package olLib.imageStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageState extends js.Object

@JSImport("ol/ImageState", "ImageState")
@js.native
object ImageState extends js.Object {
  @js.native
  sealed trait ERROR
    extends olLib.imageStateMod.ImageState
  
  @js.native
  sealed trait IDLE
    extends olLib.imageStateMod.ImageState
  
  @js.native
  sealed trait LOADED
    extends olLib.imageStateMod.ImageState
  
  @js.native
  sealed trait LOADING
    extends olLib.imageStateMod.ImageState
  
}

