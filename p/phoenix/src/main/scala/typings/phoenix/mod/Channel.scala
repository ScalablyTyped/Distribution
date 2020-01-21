package typings.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "Channel")
@js.native
class Channel protected () extends js.Object {
  def this(topic: String) = this()
  def this(topic: String, params: js.Function0[js.Object]) = this()
  def this(topic: String, params: js.Object) = this()
  def this(topic: String, params: js.Function0[js.Object], socket: Socket) = this()
  def this(topic: String, params: js.Object, socket: Socket) = this()
  def join(): Push = js.native
  def join(timeout: Double): Push = js.native
  def leave(): Push = js.native
  def leave(timeout: Double): Push = js.native
  def off(event: String): Unit = js.native
  def off(event: String, ref: Double): Unit = js.native
  def on(event: String, callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]): Double = js.native
  def onClose(callback: js.Function3[/* payload */ js.Any, /* ref */ js.Any, /* joinRef */ js.Any, Unit]): Unit = js.native
  def onError(callback: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def onMessage(event: String, payload: js.Any, ref: js.Any): js.Any = js.native
  def push(event: String, payload: js.Object): Push = js.native
  def push(event: String, payload: js.Object, timeout: Double): Push = js.native
}

