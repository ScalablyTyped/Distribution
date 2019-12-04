package typings.ol

import typings.ol.pointerMsSourceMod.MsSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/pointer/MsSource", JSImport.Namespace)
@js.native
object pointerMsSourceMod extends js.Object {
  @js.native
  trait MsSource
    extends typings.ol.pointerEventSourceMod.default {
    def cleanup(pointerId: Double): Unit = js.native
  }
  
  @js.native
  class default protected () extends MsSource {
    def this(dispatcher: typings.ol.pointerPointerEventHandlerMod.default) = this()
  }
  
}

