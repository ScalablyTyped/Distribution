package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterSpatialMod {
  
  /* note: abstract class */ @JSImport("ol/format/filter/Spatial", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ol.formatFilterFilterMod.default {
    def this(tagName: String, geometryName: String, geometry: typings.ol.geomGeometryMod.default) = this()
    def this(
      tagName: String,
      geometryName: String,
      geometry: typings.ol.geomGeometryMod.default,
      opt_srsName: String
    ) = this()
  }
  
  type Spatial = typings.ol.formatFilterFilterMod.default
}
