package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spatialMod {
  
  @JSImport("ol/format/filter/Spatial", JSImport.Default)
  @js.native
  abstract class default protected ()
    extends typings.ol.filterFilterMod.default {
    def this(tagName: String, geometryName: String, geometry: typings.ol.geometryMod.default) = this()
    def this(
      tagName: String,
      geometryName: String,
      geometry: typings.ol.geometryMod.default,
      opt_srsName: String
    ) = this()
  }
  
  type Spatial = typings.ol.filterFilterMod.default
}
