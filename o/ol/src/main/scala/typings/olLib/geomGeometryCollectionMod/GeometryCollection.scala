package typings
package olLib.geomGeometryCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryCollection
  extends olLib.geomGeometryMod.default {
  def getGeometries(): js.Array[olLib.geomGeometryMod.default] = js.native
  def getGeometriesArray(): js.Array[olLib.geomGeometryMod.default] = js.native
  def isEmpty(): scala.Boolean = js.native
  def setGeometries(geometries: js.Array[olLib.geomGeometryMod.default]): scala.Unit = js.native
  def setGeometriesArray(geometries: js.Array[olLib.geomGeometryMod.default]): scala.Unit = js.native
}

