package typings
package olLib.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Graticule", JSImport.Default)
@js.native
class default () extends Graticule {
  def this(opt_options: Options) = this()
  /* CompleteClass */
  override def getMap(): olLib.pluggableMapMod.default = js.native
  /* CompleteClass */
  override def getMeridians(): js.Array[olLib.geomLineStringMod.default] = js.native
  /* CompleteClass */
  override def getParallels(): js.Array[olLib.geomLineStringMod.default] = js.native
  /* CompleteClass */
  override def setMap(map: olLib.pluggableMapMod.default): scala.Unit = js.native
}

