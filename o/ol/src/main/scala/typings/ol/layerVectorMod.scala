package typings.ol

import typings.ol.layerBaseVectorMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerVectorMod {
  
  @JSImport("ol/layer/Vector", JSImport.Default)
  @js.native
  open class default () extends VectorLayer {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait VectorLayer
    extends typings.ol.layerBaseVectorMod.default[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]]
}
