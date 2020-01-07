package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/Composite", JSImport.Namespace)
@js.native
object rendererCompositeMod extends js.Object {
  @js.native
  trait CompositeMapRenderer
    extends typings.ol.rendererMapMod.default
  
  @js.native
  class default protected () extends CompositeMapRenderer {
    def this(map: typings.ol.pluggableMapMod.default) = this()
  }
  
}

