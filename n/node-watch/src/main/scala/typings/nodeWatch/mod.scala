package typings.nodeWatch

import typings.node.fsMod.FSWatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-watch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Watch for changes on `filename`, where filename is either a file or a directory.
    *  The second argument is optional.
    *
    *  If `options` is provided as a string, it specifies the encoding.
    *  Otherwise `options` should be passed as an object.
    *
    *  The listener callback gets two arguments, `(eventType, filePath)`,
    *  which is the same with `fs.watch`.
    *  `eventType` is either `update` or `remove`,
    *  `filePath` is the name of the file which triggered the event.
    *
    * @param {Filename} filename File or directory to watch.
    * @param {Options|string} options
    * @param {Function} callback
    */
  inline def default(pathName: PathName): Watcher = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathName.asInstanceOf[js.Any]).asInstanceOf[Watcher]
  inline def default(pathName: PathName, callback: Callback): Watcher = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Watcher]
  inline def default(pathName: PathName, options: Options): Watcher = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Watcher]
  inline def default(pathName: PathName, options: Options, callback: Callback): Watcher = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Watcher]
  
  type Callback = js.Function2[/* eventType */ EventType, /* filePath */ String, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeWatch.nodeWatchStrings.update
    - typings.nodeWatch.nodeWatchStrings.remove
  */
  trait EventType extends StObject
  object EventType {
    
    inline def remove: typings.nodeWatch.nodeWatchStrings.remove = "remove".asInstanceOf[typings.nodeWatch.nodeWatchStrings.remove]
    
    inline def update: typings.nodeWatch.nodeWatchStrings.update = "update".asInstanceOf[typings.nodeWatch.nodeWatchStrings.update]
  }
  
  type FilterReturn = Boolean | js.Symbol
  
  trait Options extends StObject {
    
    /**
      * Delay time of the callback function.
      * @default 200
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the character encoding to be used for the filename
      * passed to the listener.
      * @default 'utf8'
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * Only files which pass this filter (when it returns `true`)
      * will be sent to the listener.
      */
    var filter: js.UndefOr[
        js.RegExp | (js.Function2[/* file */ String, /* skip */ js.Symbol, FilterReturn])
      ] = js.undefined
    
    /**
      * Indicates whether the process should continue to run
      * as long as files are being watched.
      * @default true
      */
    var persistent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether all subdirectories should be watched.
      * @default false
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFilter(value: js.RegExp | (js.Function2[/* file */ String, /* skip */ js.Symbol, FilterReturn])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction2(value: (/* file */ String, /* skip */ js.Symbol) => FilterReturn): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  type PathName = String | js.Array[String]
  
  @js.native
  trait Watcher
    extends StObject
       with FSWatcher {
    
    /**
      * Returns all watched paths.
      */
    def getWatchedPaths(): js.Array[String] = js.native
    
    /**
      * Returns `true` if the watcher has been closed.
      */
    def isClosed(): Boolean = js.native
  }
}
