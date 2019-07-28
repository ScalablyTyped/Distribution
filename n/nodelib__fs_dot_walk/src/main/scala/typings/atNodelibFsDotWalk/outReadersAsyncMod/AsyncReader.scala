package typings.atNodelibFsDotWalk.outReadersAsyncMod

import typings.atNodelibFsDotScandir.atNodelibFsDotScandirMod.AsyncCallback
import typings.atNodelibFsDotScandir.outSettingsMod.Options
import typings.atNodelibFsDotWalk.Anon_Callback
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncReader
  extends typings.atNodelibFsDotWalk.outReadersReaderMod.default {
  var _emitEntry: js.Any = js.native
  val _emitter: EventEmitter = js.native
  var _handleEntry: js.Any = js.native
  var _handleError: js.Any = js.native
  var _isDestroyed: js.Any = js.native
  var _isFatalError: js.Any = js.native
  var _pushToQueue: js.Any = js.native
  val _queue: js.Any = js.native
  @JSName("_scandir")
  val _scandir_Original: Anon_Callback = js.native
  var _worker: js.Any = js.native
  /* protected */ def _scandir(path: String, callback: AsyncCallback): Unit = js.native
  /* protected */ def _scandir(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  /* protected */ def _scandir(
    path: String,
    optionsOrSettings: typings.atNodelibFsDotScandir.outSettingsMod.default,
    callback: AsyncCallback
  ): Unit = js.native
  def destroy(): Unit = js.native
  def onEnd(callback: EndEventCallback): Unit = js.native
  def onEntry(callback: EntryEventCallback): Unit = js.native
  def onError(callback: ErrorEventCallback): Unit = js.native
  def read(): EventEmitter = js.native
}

