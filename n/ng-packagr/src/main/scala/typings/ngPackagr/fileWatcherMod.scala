package typings.ngPackagr

import typings.ngPackagr.anon.OnFileChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileWatcherMod {
  
  @JSImport("ng-packagr/lib/file-system/file-watcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFileWatch(basePaths: String): OnFileChange = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileWatch")(basePaths.asInstanceOf[js.Any]).asInstanceOf[OnFileChange]
  inline def createFileWatch(basePaths: String, ignoredPaths: js.Array[js.RegExp | String]): OnFileChange = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileWatch")(basePaths.asInstanceOf[js.Any], ignoredPaths.asInstanceOf[js.Any])).asInstanceOf[OnFileChange]
  inline def createFileWatch(basePaths: js.Array[String]): OnFileChange = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileWatch")(basePaths.asInstanceOf[js.Any]).asInstanceOf[OnFileChange]
  inline def createFileWatch(basePaths: js.Array[String], ignoredPaths: js.Array[js.RegExp | String]): OnFileChange = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileWatch")(basePaths.asInstanceOf[js.Any], ignoredPaths.asInstanceOf[js.Any])).asInstanceOf[OnFileChange]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ngPackagr.ngPackagrStrings.change
    - typings.ngPackagr.ngPackagrStrings.unlink
    - typings.ngPackagr.ngPackagrStrings.add
    - typings.ngPackagr.ngPackagrStrings.unlinkDir
    - typings.ngPackagr.ngPackagrStrings.addDir
  */
  trait AllFileWatchEvents extends StObject
  object AllFileWatchEvents {
    
    inline def add: typings.ngPackagr.ngPackagrStrings.add = "add".asInstanceOf[typings.ngPackagr.ngPackagrStrings.add]
    
    inline def addDir: typings.ngPackagr.ngPackagrStrings.addDir = "addDir".asInstanceOf[typings.ngPackagr.ngPackagrStrings.addDir]
    
    inline def change: typings.ngPackagr.ngPackagrStrings.change = "change".asInstanceOf[typings.ngPackagr.ngPackagrStrings.change]
    
    inline def unlink: typings.ngPackagr.ngPackagrStrings.unlink = "unlink".asInstanceOf[typings.ngPackagr.ngPackagrStrings.unlink]
    
    inline def unlinkDir: typings.ngPackagr.ngPackagrStrings.unlinkDir = "unlinkDir".asInstanceOf[typings.ngPackagr.ngPackagrStrings.unlinkDir]
  }
  
  trait FileChangedEvent extends StObject {
    
    var event: FileWatchEvent
    
    var filePath: String
  }
  object FileChangedEvent {
    
    inline def apply(event: FileWatchEvent, filePath: String): FileChangedEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileChangedEvent]
    }
    
    extension [Self <: FileChangedEvent](x: Self) {
      
      inline def setEvent(value: FileWatchEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Exclude<ng-packagr.ng-packagr/lib/file-system/file-watcher.AllFileWatchEvents, 'unlinkDir' | 'addDir'> */
  /* Rewritten from type alias, can be one of: 
    - typings.ngPackagr.ngPackagrStrings.add
    - typings.ngPackagr.ngPackagrStrings.unlink
    - typings.ngPackagr.ngPackagrStrings.change
  */
  trait FileWatchEvent extends StObject
  object FileWatchEvent {
    
    inline def add: typings.ngPackagr.ngPackagrStrings.add = "add".asInstanceOf[typings.ngPackagr.ngPackagrStrings.add]
    
    inline def change: typings.ngPackagr.ngPackagrStrings.change = "change".asInstanceOf[typings.ngPackagr.ngPackagrStrings.change]
    
    inline def unlink: typings.ngPackagr.ngPackagrStrings.unlink = "unlink".asInstanceOf[typings.ngPackagr.ngPackagrStrings.unlink]
  }
}
