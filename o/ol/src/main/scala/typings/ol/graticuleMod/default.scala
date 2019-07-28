package typings.ol.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Graticule", JSImport.Default)
@js.native
class default () extends Graticule {
  def this(opt_options: Options) = this()
  /* CompleteClass */
  override def getMap(): typings.ol.pluggableMapMod.default = js.native
  /* CompleteClass */
  override def getMeridians(): js.Array[typings.ol.geomLineStringMod.default] = js.native
  /* CompleteClass */
  override def getParallels(): js.Array[typings.ol.geomLineStringMod.default] = js.native
  /* CompleteClass */
  override def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
}

