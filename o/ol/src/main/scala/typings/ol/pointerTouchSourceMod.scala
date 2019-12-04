package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/pointer/TouchSource", JSImport.Namespace)
@js.native
object pointerTouchSourceMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.pointerEventSourceMod.default {
    def this(
      dispatcher: typings.ol.pointerPointerEventHandlerMod.default,
      mouseSource: typings.ol.pointerMouseSourceMod.default
    ) = this()
  }
  
  type TouchSource = typings.ol.pointerEventSourceMod.default
}

