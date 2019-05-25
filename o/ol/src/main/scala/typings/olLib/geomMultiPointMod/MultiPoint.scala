package typings
package olLib.geomMultiPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPoint
  extends olLib.geomSimpleGeometryMod.default {
  def appendPoint(point: olLib.geomPointMod.default): scala.Unit = js.native
  def getPoint(index: scala.Double): olLib.geomPointMod.default = js.native
  def getPoints(): js.Array[olLib.geomPointMod.default] = js.native
}

