package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterDwithinMod {
  
  @JSImport("ol/format/filter/DWithin", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ol.formatFilterSpatialMod.default {
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default, distance: Double, unit: String) = this()
    def this(
      geometryName: String,
      geometry: typings.ol.geomGeometryMod.default,
      distance: Double,
      unit: String,
      opt_srsName: String
    ) = this()
  }
  
  type DWithin = typings.ol.formatFilterSpatialMod.default
}
