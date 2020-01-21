package typings.ol.tilegridWmtsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSTileGrid
  extends typings.ol.tilegridTileGridMod.default {
  def getMatrixId(z: Double): String = js.native
  def getMatrixIds(): js.Array[String] = js.native
}

