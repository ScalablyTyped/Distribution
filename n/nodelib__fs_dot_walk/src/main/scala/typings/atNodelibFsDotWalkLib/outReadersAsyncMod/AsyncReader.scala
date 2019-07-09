package typings
package atNodelibFsDotWalkLib.outReadersAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncReader
  extends atNodelibFsDotWalkLib.outReadersReaderMod.default {
  var _emitEntry: js.Any = js.native
  val _emitter: nodeLib.eventsMod.EventEmitter = js.native
  var _handleEntry: js.Any = js.native
  var _handleError: js.Any = js.native
  var _isDestroyed: js.Any = js.native
  var _isFatalError: js.Any = js.native
  var _pushToQueue: js.Any = js.native
  val _queue: js.Any = js.native
  @JSName("_scandir")
  val _scandir_Original: atNodelibFsDotWalkLib.Anon_Callback = js.native
  var _worker: js.Any = js.native
  /* protected */ def _scandir(path: java.lang.String, callback: atNodelibFsDotScandirLib.atNodelibFsDotScandirMod.AsyncCallback): scala.Unit = js.native
  /* protected */ def _scandir(
    path: java.lang.String,
    optionsOrSettings: atNodelibFsDotScandirLib.outSettingsMod.Options,
    callback: atNodelibFsDotScandirLib.atNodelibFsDotScandirMod.AsyncCallback
  ): scala.Unit = js.native
  /* protected */ def _scandir(
    path: java.lang.String,
    optionsOrSettings: atNodelibFsDotScandirLib.outSettingsMod.default,
    callback: atNodelibFsDotScandirLib.atNodelibFsDotScandirMod.AsyncCallback
  ): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def onEnd(callback: EndEventCallback): scala.Unit = js.native
  def onEntry(callback: EntryEventCallback): scala.Unit = js.native
  def onError(callback: ErrorEventCallback): scala.Unit = js.native
  def read(): nodeLib.eventsMod.EventEmitter = js.native
}

