package typings.ol.geomMultiPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPoint
  extends typings.ol.geomSimpleGeometryMod.default {
  def appendPoint(point: typings.ol.geomPointMod.default): Unit = js.native
  def getPoint(index: Double): typings.ol.geomPointMod.default = js.native
  def getPoints(): js.Array[typings.ol.geomPointMod.default] = js.native
}

