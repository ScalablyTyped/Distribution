package typings
package atPollyjsCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/core", "Polly")
@js.native
class Polly protected () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, options: PollyConfig) = this()
  var mode: atPollyjsUtilsLib.utilsMod.MODES = js.native
  var persister: atPollyjsPersisterLib.persisterMod.default = js.native
  val recordingName: java.lang.String | scala.Null = js.native
  var server: PollyServer = js.native
  def configure(config: PollyConfig): scala.Unit = js.native
  def connectTo(name: ScalablyTyped.runtime.Instantiable0[atPollyjsAdapterLib.adapterMod.default]): scala.Unit = js.native
  def connectTo(name: java.lang.String): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnectFrom(name: ScalablyTyped.runtime.Instantiable0[atPollyjsAdapterLib.adapterMod.default]): scala.Unit = js.native
  def disconnectFrom(name: java.lang.String): scala.Unit = js.native
  def flush(): js.Promise[scala.Unit] = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def record(): scala.Unit = js.native
  def replay(): scala.Unit = js.native
  def stop(): js.Promise[scala.Unit] = js.native
}

@JSImport("@pollyjs/core", "Polly")
@js.native
object Polly extends js.Object {
  def off(event: atPollyjsCoreLib.coreMod.PollyEvent, listener: atPollyjsCoreLib.coreMod.PollyEventListener): scala.Unit = js.native
  def on(event: atPollyjsCoreLib.coreMod.PollyEvent, listener: atPollyjsCoreLib.coreMod.PollyEventListener): scala.Unit = js.native
  def once(event: atPollyjsCoreLib.coreMod.PollyEvent, listener: atPollyjsCoreLib.coreMod.PollyEventListener): scala.Unit = js.native
  def register(
    Factory: ScalablyTyped.runtime.Instantiable0[
      atPollyjsAdapterLib.adapterMod.default | atPollyjsPersisterLib.persisterMod.default
    ]
  ): scala.Unit = js.native
}

