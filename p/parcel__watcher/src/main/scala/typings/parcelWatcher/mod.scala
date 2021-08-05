package typings.parcelWatcher

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@parcel/watcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@parcel/watcher", "ParcelWatcherSubscription")
  @js.native
  class ParcelWatcherSubscription () extends StObject {
    
    def unsubscribe(): js.Promise[Unit] = js.native
  }
  
  inline def getEventsSince(dirPath: String, snapshotPath: String): js.Promise[js.Array[ParcelWatcherEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventsSince")(dirPath.asInstanceOf[js.Any], snapshotPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ParcelWatcherEvent]]]
  inline def getEventsSince(dirPath: String, snapshotPath: String, options: ParcelWatcherOptions): js.Promise[js.Array[ParcelWatcherEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventsSince")(dirPath.asInstanceOf[js.Any], snapshotPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ParcelWatcherEvent]]]
  
  inline def subscribe(dirPath: String, callback: ParcelWatcherCallback): js.Promise[ParcelWatcherSubscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(dirPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParcelWatcherSubscription]]
  inline def subscribe(dirPath: String, callback: ParcelWatcherCallback, options: ParcelWatcherOptions): js.Promise[ParcelWatcherSubscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(dirPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParcelWatcherSubscription]]
  
  inline def unsubscribe(dirPath: String, callback: ParcelWatcherCallback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(dirPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def unsubscribe(dirPath: String, callback: ParcelWatcherCallback, options: ParcelWatcherOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(dirPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeSnapshot(dirPath: String, snapshotPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSnapshot")(dirPath.asInstanceOf[js.Any], snapshotPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeSnapshot(dirPath: String, snapshotPath: String, options: ParcelWatcherOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSnapshot")(dirPath.asInstanceOf[js.Any], snapshotPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.parcelWatcher.parcelWatcherStrings.`fs-events`
    - typings.parcelWatcher.parcelWatcherStrings.watchman
    - typings.parcelWatcher.parcelWatcherStrings.inotify
    - typings.parcelWatcher.parcelWatcherStrings.windows
    - typings.parcelWatcher.parcelWatcherStrings.`brute-force`
  */
  trait ParcelWatcherBackend extends StObject
  object ParcelWatcherBackend {
    
    inline def `brute-force`: typings.parcelWatcher.parcelWatcherStrings.`brute-force` = "brute-force".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.`brute-force`]
    
    inline def `fs-events`: typings.parcelWatcher.parcelWatcherStrings.`fs-events` = "fs-events".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.`fs-events`]
    
    inline def inotify: typings.parcelWatcher.parcelWatcherStrings.inotify = "inotify".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.inotify]
    
    inline def watchman: typings.parcelWatcher.parcelWatcherStrings.watchman = "watchman".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.watchman]
    
    inline def windows: typings.parcelWatcher.parcelWatcherStrings.windows = "windows".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.windows]
  }
  
  type ParcelWatcherCallback = js.Function2[
    /* error */ js.UndefOr[Error], 
    /* events */ js.UndefOr[js.Array[ParcelWatcherEvent]], 
    js.Any
  ]
  
  trait ParcelWatcherEvent extends StObject {
    
    var path: String
    
    var `type`: ParcelWatcherEventType
  }
  object ParcelWatcherEvent {
    
    inline def apply(path: String, `type`: ParcelWatcherEventType): ParcelWatcherEvent = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParcelWatcherEvent]
    }
    
    extension [Self <: ParcelWatcherEvent](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: ParcelWatcherEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parcelWatcher.parcelWatcherStrings.create
    - typings.parcelWatcher.parcelWatcherStrings.update
    - typings.parcelWatcher.parcelWatcherStrings.delete
  */
  trait ParcelWatcherEventType extends StObject
  object ParcelWatcherEventType {
    
    inline def create: typings.parcelWatcher.parcelWatcherStrings.create = "create".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.create]
    
    inline def delete: typings.parcelWatcher.parcelWatcherStrings.delete = "delete".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.delete]
    
    inline def update: typings.parcelWatcher.parcelWatcherStrings.update = "update".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.update]
  }
  
  trait ParcelWatcherOptions extends StObject {
    
    var backend: js.UndefOr[ParcelWatcherBackend] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ParcelWatcherOptions {
    
    inline def apply(): ParcelWatcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParcelWatcherOptions]
    }
    
    extension [Self <: ParcelWatcherOptions](x: Self) {
      
      inline def setBackend(value: ParcelWatcherBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    }
  }
}
