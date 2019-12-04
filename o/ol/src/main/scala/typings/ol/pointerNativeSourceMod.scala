package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/pointer/NativeSource", JSImport.Namespace)
@js.native
object pointerNativeSourceMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.pointerEventSourceMod.default {
    def this(dispatcher: typings.ol.pointerPointerEventHandlerMod.default) = this()
  }
  
  type NativeSource = typings.ol.pointerEventSourceMod.default
}

