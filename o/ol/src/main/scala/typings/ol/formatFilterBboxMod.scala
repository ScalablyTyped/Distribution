package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterBboxMod {
  
  @JSImport("ol/format/filter/Bbox", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ol.formatFilterFilterMod.default {
    def this(geometryName: String, extent: Extent) = this()
    def this(geometryName: String, extent: Extent, opt_srsName: String) = this()
  }
  
  type Bbox = typings.ol.formatFilterFilterMod.default
}
