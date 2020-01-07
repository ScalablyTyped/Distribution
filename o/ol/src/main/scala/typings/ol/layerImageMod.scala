package typings.ol

import typings.ol.layerBaseImageMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer/Image", JSImport.Namespace)
@js.native
object layerImageMod extends js.Object {
  @js.native
  trait ImageLayer
    extends typings.ol.layerBaseImageMod.default
  
  @js.native
  class default () extends ImageLayer {
    def this(opt_options: Options) = this()
  }
  
}

