package typings.ol

import typings.ol.layerBaseVectorMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer/Vector", JSImport.Namespace)
@js.native
object layerVectorMod extends js.Object {
  @js.native
  trait VectorLayer
    extends typings.ol.layerBaseVectorMod.default[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]]
  
  @js.native
  class default () extends VectorLayer {
    def this(opt_options: Options) = this()
  }
  
}

