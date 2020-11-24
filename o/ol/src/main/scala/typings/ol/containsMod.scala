package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/format/filter/Contains", JSImport.Namespace)
@js.native
object containsMod extends js.Object {
  
  @js.native
  class default protected ()
    extends typings.ol.spatialMod.default {
    def this(geometryName: String, geometry: typings.ol.geometryMod.default) = this()
    def this(geometryName: String, geometry: typings.ol.geometryMod.default, opt_srsName: String) = this()
  }
  
  type Contains = typings.ol.spatialMod.default
}
