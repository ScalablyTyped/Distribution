package typings.nodelibFsWalk

import typings.nodelibFsScandir.outSettingsMod.Options
import typings.nodelibFsScandir.outTypesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outReadersSyncMod {
  
  @JSImport("@nodelib/fs.walk/out/readers/sync", JSImport.Default)
  @js.native
  open class default () extends SyncReader
  
  @js.native
  trait SyncReader
    extends typings.nodelibFsWalk.outReadersReaderMod.default {
    
    /* private */ var _handleDirectory: Any = js.native
    
    /* private */ var _handleEntry: Any = js.native
    
    /* private */ var _handleError: Any = js.native
    
    /* private */ var _handleQueue: Any = js.native
    
    /* private */ var _pushToQueue: Any = js.native
    
    /* private */ var _pushToStorage: Any = js.native
    
    /* private */ val _queue: Any = js.native
    
    /* protected */ def _scandir(path: String): js.Array[Entry] = js.native
    /* protected */ def _scandir(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
    /* protected */ def _scandir(path: String, optionsOrSettings: typings.nodelibFsScandir.outSettingsMod.default): js.Array[Entry] = js.native
    
    /* private */ val _storage: Any = js.native
    
    def read(): js.Array[typings.nodelibFsWalk.outTypesMod.Entry] = js.native
  }
}
