package typings.atNodelibFsDotWalk

import typings.atNodelibFsDotScandir.outSettingsMod.Options
import typings.atNodelibFsDotScandir.outTypesMod.Entry
import typings.atNodelibFsDotWalk.outReadersSyncMod.SyncReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk/out/readers/sync", JSImport.Namespace)
@js.native
object outReadersSyncMod extends js.Object {
  @js.native
  trait SyncReader
    extends typings.atNodelibFsDotWalk.outReadersReaderMod.default {
    var _handleDirectory: js.Any = js.native
    var _handleEntry: js.Any = js.native
    var _handleError: js.Any = js.native
    var _handleQueue: js.Any = js.native
    var _pushToQueue: js.Any = js.native
    var _pushToStorage: js.Any = js.native
    val _queue: js.Any = js.native
    val _storage: js.Any = js.native
    /* protected */ def _scandir(path: String): js.Array[Entry] = js.native
    /* protected */ def _scandir(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
    /* protected */ def _scandir(path: String, optionsOrSettings: typings.atNodelibFsDotScandir.outSettingsMod.default): js.Array[Entry] = js.native
    def read(): js.Array[typings.atNodelibFsDotWalk.outTypesMod.Entry] = js.native
  }
  
  @js.native
  class default () extends SyncReader
  
}

