package typings.nodelibFsWalk

import typings.node.eventsMod.EventEmitter
import typings.nodelibFsWalk.anon.Typeofscandir
import typings.nodelibFsWalk.typesMod.Entry
import typings.nodelibFsWalk.typesMod.Errno
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readersAsyncMod {
  
  @JSImport("@nodelib/fs.walk/out/readers/async", JSImport.Default)
  @js.native
  open class default protected () extends AsyncReader {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
  }
  
  @js.native
  trait AsyncReader
    extends typings.nodelibFsWalk.readerMod.default {
    
    /* private */ var _emitEntry: Any = js.native
    
    /* protected */ val _emitter: EventEmitter = js.native
    
    /* private */ var _handleEntry: Any = js.native
    
    /* private */ var _handleError: Any = js.native
    
    /* private */ var _isDestroyed: Any = js.native
    
    /* private */ var _isFatalError: Any = js.native
    
    /* private */ var _pushToQueue: Any = js.native
    
    /* private */ val _queue: Any = js.native
    
    /* protected */ val _scandir: Typeofscandir = js.native
    
    /* private */ var _worker: Any = js.native
    
    def destroy(): Unit = js.native
    
    def isDestroyed: Boolean = js.native
    
    def onEnd(callback: EndEventCallback): Unit = js.native
    
    def onEntry(callback: EntryEventCallback): Unit = js.native
    
    def onError(callback: ErrorEventCallback): Unit = js.native
    
    def read(): EventEmitter = js.native
  }
  
  type EndEventCallback = js.Function0[Unit]
  
  type EntryEventCallback = js.Function1[/* entry */ Entry, Unit]
  
  type ErrorEventCallback = js.Function1[/* error */ Errno, Unit]
}
