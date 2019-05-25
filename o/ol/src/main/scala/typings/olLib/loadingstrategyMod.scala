package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/loadingstrategy", JSImport.Namespace)
@js.native
object loadingstrategyMod extends js.Object {
  def all(extent: olLib.extentMod.Extent, resolution: scala.Double): js.Array[olLib.extentMod.Extent] = js.native
  def bbox(extent: olLib.extentMod.Extent, resolution: scala.Double): js.Array[olLib.extentMod.Extent] = js.native
  def tile(tileGrid: olLib.tilegridTileGridMod.default): js.Function2[
    /* param0 */ olLib.extentMod.Extent, 
    /* param1 */ scala.Double, 
    js.Array[olLib.extentMod.Extent]
  ] = js.native
}

