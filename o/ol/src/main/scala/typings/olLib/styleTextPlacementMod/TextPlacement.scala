package typings
package olLib.styleTextPlacementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextPlacement extends js.Object

@JSImport("ol/style/TextPlacement", "TextPlacement")
@js.native
object TextPlacement extends js.Object {
  @js.native
  sealed trait LINE
    extends olLib.styleTextPlacementMod.TextPlacement
  
  @js.native
  sealed trait POINT
    extends olLib.styleTextPlacementMod.TextPlacement
  
}

