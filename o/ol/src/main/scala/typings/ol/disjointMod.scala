package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disjointMod {
  
  @JSImport("ol/format/filter/Disjoint", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ol.spatialMod.default {
    def this(geometryName: String, geometry: typings.ol.geometryMod.default) = this()
    def this(geometryName: String, geometry: typings.ol.geometryMod.default, opt_srsName: String) = this()
  }
  
  type Disjoint = typings.ol.spatialMod.default
}
