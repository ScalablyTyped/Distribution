package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterWithinMod {
  
  @JSImport("ol/format/filter/Within", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ol.formatFilterSpatialMod.default {
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default) = this()
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String) = this()
  }
  
  type Within = typings.ol.formatFilterSpatialMod.default
}
