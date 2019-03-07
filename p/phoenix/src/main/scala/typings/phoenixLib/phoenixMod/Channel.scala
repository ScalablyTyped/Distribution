package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "Channel")
@js.native
class Channel protected () extends js.Object {
  def this(topic: java.lang.String) = this()
  def this(topic: java.lang.String, params: js.Function) = this()
  def this(topic: java.lang.String, params: js.Object) = this()
  def this(topic: java.lang.String, params: js.Function, socket: Socket) = this()
  def this(topic: java.lang.String, params: js.Object, socket: Socket) = this()
  def join(): Push = js.native
  def join(timeout: scala.Double): Push = js.native
  def leave(): Push = js.native
  def leave(timeout: scala.Double): Push = js.native
  def off(event: java.lang.String): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def onClose(callback: js.Function): scala.Unit = js.native
  def onError(callback: js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def onMessage(event: java.lang.String, payload: js.Any, ref: js.Any): js.Any = js.native
  def push(event: java.lang.String, payload: js.Object): Push = js.native
  def push(event: java.lang.String, payload: js.Object, timeout: scala.Double): Push = js.native
}

