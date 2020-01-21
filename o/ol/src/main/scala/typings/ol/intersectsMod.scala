package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/Intersects", JSImport.Namespace)
@js.native
object intersectsMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.spatialMod.default {
    def this(geometryName: String, geometry: typings.ol.geometryMod.default) = this()
    def this(geometryName: String, geometry: typings.ol.geometryMod.default, opt_srsName: String) = this()
  }
  
  type Intersects = typings.ol.spatialMod.default
}

