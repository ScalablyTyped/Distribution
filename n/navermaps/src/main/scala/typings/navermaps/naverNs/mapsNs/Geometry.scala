package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Geometry")
@js.native
class Geometry protected () extends KVO {
  def this(rawGeometry: js.Any) = this()
  def getCoords(): ArrayOfCoords = js.native
  def getType(): String = js.native
}

