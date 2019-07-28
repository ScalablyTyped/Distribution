package typings.atPollyjsCore.atPollyjsCoreMod

import typings.atPollyjsCore.TypeofClassAdapter
import typings.atPollyjsCore.TypeofClassPersister
import typings.atPollyjsPersister.atPollyjsPersisterMod.default
import typings.atPollyjsUtils.atPollyjsUtilsMod.MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/core", "Polly")
@js.native
class Polly protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, options: PollyConfig) = this()
  var mode: MODES = js.native
  var persister: default = js.native
  val recordingName: String | Null = js.native
  var server: PollyServer = js.native
  def configure(config: PollyConfig): Unit = js.native
  def connectTo(name: String): Unit = js.native
  def connectTo(name: TypeofClassAdapter): Unit = js.native
  def disconnect(): Unit = js.native
  def disconnectFrom(name: String): Unit = js.native
  def disconnectFrom(name: TypeofClassAdapter): Unit = js.native
  def flush(): js.Promise[Unit] = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def record(): Unit = js.native
  def replay(): Unit = js.native
  def stop(): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("@pollyjs/core", "Polly")
@js.native
object Polly extends js.Object {
  def off(event: PollyEvent, listener: PollyEventListener): Unit = js.native
  def on(event: PollyEvent, listener: PollyEventListener): Unit = js.native
  def once(event: PollyEvent, listener: PollyEventListener): Unit = js.native
  def register(Factory: TypeofClassAdapter): Unit = js.native
  def register(Factory: TypeofClassPersister): Unit = js.native
}

