package typings
package olLib.styleIconOriginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconOrigin extends js.Object

@JSImport("ol/style/IconOrigin", "IconOrigin")
@js.native
object IconOrigin extends js.Object {
  @js.native
  sealed trait BOTTOM_LEFT
    extends olLib.styleIconOriginMod.IconOrigin
  
  @js.native
  sealed trait BOTTOM_RIGHT
    extends olLib.styleIconOriginMod.IconOrigin
  
  @js.native
  sealed trait TOP_LEFT
    extends olLib.styleIconOriginMod.IconOrigin
  
  @js.native
  sealed trait TOP_RIGHT
    extends olLib.styleIconOriginMod.IconOrigin
  
}

