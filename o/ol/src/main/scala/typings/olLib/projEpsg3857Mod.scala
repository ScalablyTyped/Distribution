package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj/epsg3857", JSImport.Namespace)
@js.native
object projEpsg3857Mod extends js.Object {
  val EXTENT: olLib.extentMod.Extent = js.native
  val HALF_SIZE: scala.Double = js.native
  val PROJECTIONS: js.Array[olLib.projProjectionMod.default] = js.native
  val RADIUS: scala.Double = js.native
  val WORLD_EXTENT: olLib.extentMod.Extent = js.native
  def fromEPSG4326(input: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def fromEPSG4326(input: js.Array[scala.Double], opt_output: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def fromEPSG4326(input: js.Array[scala.Double], opt_output: js.Array[scala.Double], opt_dimension: scala.Double): js.Array[scala.Double] = js.native
  def toEPSG4326(input: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toEPSG4326(input: js.Array[scala.Double], opt_output: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toEPSG4326(input: js.Array[scala.Double], opt_output: js.Array[scala.Double], opt_dimension: scala.Double): js.Array[scala.Double] = js.native
}

