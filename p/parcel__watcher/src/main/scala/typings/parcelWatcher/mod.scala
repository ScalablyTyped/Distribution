package typings.parcelWatcher

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@parcel/watcher", "ParcelWatcherSubscription")
  @js.native
  class ParcelWatcherSubscription () extends StObject {
    
    def unsubscribe(): js.Promise[Unit] = js.native
  }
  
  @JSImport("@parcel/watcher", "getEventsSince")
  @js.native
  def getEventsSince(dirPath: String, snapshotPath: String): js.Promise[js.Array[ParcelWatcherEvent]] = js.native
  @JSImport("@parcel/watcher", "getEventsSince")
  @js.native
  def getEventsSince(dirPath: String, snapshotPath: String, options: ParcelWatcherOptions): js.Promise[js.Array[ParcelWatcherEvent]] = js.native
  
  @JSImport("@parcel/watcher", "subscribe")
  @js.native
  def subscribe(dirPath: String, callback: ParcelWatcherCallback): js.Promise[ParcelWatcherSubscription] = js.native
  @JSImport("@parcel/watcher", "subscribe")
  @js.native
  def subscribe(dirPath: String, callback: ParcelWatcherCallback, options: ParcelWatcherOptions): js.Promise[ParcelWatcherSubscription] = js.native
  
  @JSImport("@parcel/watcher", "unsubscribe")
  @js.native
  def unsubscribe(dirPath: String, callback: ParcelWatcherCallback): js.Promise[Unit] = js.native
  @JSImport("@parcel/watcher", "unsubscribe")
  @js.native
  def unsubscribe(dirPath: String, callback: ParcelWatcherCallback, options: ParcelWatcherOptions): js.Promise[Unit] = js.native
  
  @JSImport("@parcel/watcher", "writeSnapshot")
  @js.native
  def writeSnapshot(dirPath: String, snapshotPath: String): js.Promise[Unit] = js.native
  @JSImport("@parcel/watcher", "writeSnapshot")
  @js.native
  def writeSnapshot(dirPath: String, snapshotPath: String, options: ParcelWatcherOptions): js.Promise[Unit] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.parcelWatcher.parcelWatcherStrings.`fs-events`
    - typings.parcelWatcher.parcelWatcherStrings.watchman
    - typings.parcelWatcher.parcelWatcherStrings.inotify
    - typings.parcelWatcher.parcelWatcherStrings.windows
    - typings.parcelWatcher.parcelWatcherStrings.`brute-force`
  */
  trait ParcelWatcherBackend extends StObject
  object ParcelWatcherBackend {
    
    @scala.inline
    def `brute-force`: typings.parcelWatcher.parcelWatcherStrings.`brute-force` = "brute-force".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.`brute-force`]
    
    @scala.inline
    def `fs-events`: typings.parcelWatcher.parcelWatcherStrings.`fs-events` = "fs-events".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.`fs-events`]
    
    @scala.inline
    def inotify: typings.parcelWatcher.parcelWatcherStrings.inotify = "inotify".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.inotify]
    
    @scala.inline
    def watchman: typings.parcelWatcher.parcelWatcherStrings.watchman = "watchman".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.watchman]
    
    @scala.inline
    def windows: typings.parcelWatcher.parcelWatcherStrings.windows = "windows".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.windows]
  }
  
  type ParcelWatcherCallback = js.Function2[
    /* error */ js.UndefOr[Error], 
    /* events */ js.UndefOr[js.Array[ParcelWatcherEvent]], 
    js.Any
  ]
  
  @js.native
  trait ParcelWatcherEvent extends StObject {
    
    var path: String = js.native
    
    var `type`: ParcelWatcherEventType = js.native
  }
  object ParcelWatcherEvent {
    
    @scala.inline
    def apply(path: String, `type`: ParcelWatcherEventType): ParcelWatcherEvent = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParcelWatcherEvent]
    }
    
    @scala.inline
    implicit class ParcelWatcherEventMutableBuilder[Self <: ParcelWatcherEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ParcelWatcherEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parcelWatcher.parcelWatcherStrings.create
    - typings.parcelWatcher.parcelWatcherStrings.update
    - typings.parcelWatcher.parcelWatcherStrings.delete
  */
  trait ParcelWatcherEventType extends StObject
  object ParcelWatcherEventType {
    
    @scala.inline
    def create: typings.parcelWatcher.parcelWatcherStrings.create = "create".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.create]
    
    @scala.inline
    def delete: typings.parcelWatcher.parcelWatcherStrings.delete = "delete".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.delete]
    
    @scala.inline
    def update: typings.parcelWatcher.parcelWatcherStrings.update = "update".asInstanceOf[typings.parcelWatcher.parcelWatcherStrings.update]
  }
  
  @js.native
  trait ParcelWatcherOptions extends StObject {
    
    var backend: js.UndefOr[ParcelWatcherBackend] = js.native
    
    var ignore: js.UndefOr[js.Array[String]] = js.native
  }
  object ParcelWatcherOptions {
    
    @scala.inline
    def apply(): ParcelWatcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParcelWatcherOptions]
    }
    
    @scala.inline
    implicit class ParcelWatcherOptionsMutableBuilder[Self <: ParcelWatcherOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackend(value: ParcelWatcherBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    }
  }
}
