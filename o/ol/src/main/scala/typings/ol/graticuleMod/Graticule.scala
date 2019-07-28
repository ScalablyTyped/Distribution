package typings.ol.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graticule extends js.Object {
  def getMap(): typings.ol.pluggableMapMod.default
  def getMeridians(): js.Array[typings.ol.geomLineStringMod.default]
  def getParallels(): js.Array[typings.ol.geomLineStringMod.default]
  def setMap(map: typings.ol.pluggableMapMod.default): Unit
}

object Graticule {
  @scala.inline
  def apply(
    getMap: () => typings.ol.pluggableMapMod.default,
    getMeridians: () => js.Array[typings.ol.geomLineStringMod.default],
    getParallels: () => js.Array[typings.ol.geomLineStringMod.default],
    setMap: typings.ol.pluggableMapMod.default => Unit
  ): Graticule = {
    val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap), getMeridians = js.Any.fromFunction0(getMeridians), getParallels = js.Any.fromFunction0(getParallels), setMap = js.Any.fromFunction1(setMap))
  
    __obj.asInstanceOf[Graticule]
  }
}

