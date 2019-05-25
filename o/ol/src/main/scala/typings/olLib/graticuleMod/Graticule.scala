package typings
package olLib.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graticule extends js.Object {
  def getMap(): olLib.pluggableMapMod.default
  def getMeridians(): js.Array[olLib.geomLineStringMod.default]
  def getParallels(): js.Array[olLib.geomLineStringMod.default]
  def setMap(map: olLib.pluggableMapMod.default): scala.Unit
}

object Graticule {
  @scala.inline
  def apply(
    getMap: () => olLib.pluggableMapMod.default,
    getMeridians: () => js.Array[olLib.geomLineStringMod.default],
    getParallels: () => js.Array[olLib.geomLineStringMod.default],
    setMap: olLib.pluggableMapMod.default => scala.Unit
  ): Graticule = {
    val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap), getMeridians = js.Any.fromFunction0(getMeridians), getParallels = js.Any.fromFunction0(getParallels), setMap = js.Any.fromFunction1(setMap))
  
    __obj.asInstanceOf[Graticule]
  }
}

