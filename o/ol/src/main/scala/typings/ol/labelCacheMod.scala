package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/LabelCache", JSImport.Namespace)
@js.native
object labelCacheMod extends js.Object {
  @js.native
  trait LabelCache
    extends typings.ol.lrucacheMod.default[js.Any] {
    def release(consumer: typings.ol.executorMod.default): Unit = js.native
  }
  
  @js.native
  class default () extends LabelCache
  
}

