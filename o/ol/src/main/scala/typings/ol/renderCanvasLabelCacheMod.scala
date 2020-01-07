package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/LabelCache", JSImport.Namespace)
@js.native
object renderCanvasLabelCacheMod extends js.Object {
  @js.native
  trait LabelCache
    extends typings.ol.structsLRUCacheMod.default[js.Any] {
    def release(consumer: typings.ol.renderCanvasExecutorMod.default): Unit = js.native
  }
  
  @js.native
  class default () extends LabelCache
  
}

