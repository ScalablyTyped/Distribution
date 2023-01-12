package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFilesyncFileSynchronizerMod {
  
  inline def apply(localPath: String, remotePath: String, db: typings.nginstackEngine.libConnectionConnectionMod.^): Unit = (^.asInstanceOf[js.Dynamic].apply(localPath.asInstanceOf[js.Any], remotePath.asInstanceOf[js.Any], db.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(localPath: String, remotePath: String, db: typings.nginstackEngine.libDatabaseDatabaseMod.^): Unit = (^.asInstanceOf[js.Dynamic].apply(localPath.asInstanceOf[js.Any], remotePath.asInstanceOf[js.Any], db.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/filesync/FileSynchronizer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FileSynchronizer {
    def this(localPath: String, remotePath: String, db: typings.nginstackEngine.libConnectionConnectionMod.^) = this()
    def this(localPath: String, remotePath: String, db: typings.nginstackEngine.libDatabaseDatabaseMod.^) = this()
    
    /* CompleteClass */
    var deletedFileCount: Double = js.native
    
    /* CompleteClass */
    var excludeFilters: String = js.native
    
    /* CompleteClass */
    var includeFilters: String = js.native
    
    /* CompleteClass */
    var preserveDeletedFiles: Boolean = js.native
    
    /* CompleteClass */
    var receivedFileCount: Double = js.native
    
    /* CompleteClass */
    var sentFileCount: Double = js.native
    
    /* CompleteClass */
    override def syncLocal(): Unit = js.native
    
    /* CompleteClass */
    override def syncRemote(): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/filesync/FileSynchronizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FileSynchronizer extends StObject {
    
    var deletedFileCount: Double
    
    var excludeFilters: String
    
    var includeFilters: String
    
    var preserveDeletedFiles: Boolean
    
    var receivedFileCount: Double
    
    var sentFileCount: Double
    
    def syncLocal(): Unit
    
    def syncRemote(): Unit
  }
  object FileSynchronizer {
    
    inline def apply(
      deletedFileCount: Double,
      excludeFilters: String,
      includeFilters: String,
      preserveDeletedFiles: Boolean,
      receivedFileCount: Double,
      sentFileCount: Double,
      syncLocal: () => Unit,
      syncRemote: () => Unit
    ): FileSynchronizer = {
      val __obj = js.Dynamic.literal(deletedFileCount = deletedFileCount.asInstanceOf[js.Any], excludeFilters = excludeFilters.asInstanceOf[js.Any], includeFilters = includeFilters.asInstanceOf[js.Any], preserveDeletedFiles = preserveDeletedFiles.asInstanceOf[js.Any], receivedFileCount = receivedFileCount.asInstanceOf[js.Any], sentFileCount = sentFileCount.asInstanceOf[js.Any], syncLocal = js.Any.fromFunction0(syncLocal), syncRemote = js.Any.fromFunction0(syncRemote))
      __obj.asInstanceOf[FileSynchronizer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileSynchronizer] (val x: Self) extends AnyVal {
      
      inline def setDeletedFileCount(value: Double): Self = StObject.set(x, "deletedFileCount", value.asInstanceOf[js.Any])
      
      inline def setExcludeFilters(value: String): Self = StObject.set(x, "excludeFilters", value.asInstanceOf[js.Any])
      
      inline def setIncludeFilters(value: String): Self = StObject.set(x, "includeFilters", value.asInstanceOf[js.Any])
      
      inline def setPreserveDeletedFiles(value: Boolean): Self = StObject.set(x, "preserveDeletedFiles", value.asInstanceOf[js.Any])
      
      inline def setReceivedFileCount(value: Double): Self = StObject.set(x, "receivedFileCount", value.asInstanceOf[js.Any])
      
      inline def setSentFileCount(value: Double): Self = StObject.set(x, "sentFileCount", value.asInstanceOf[js.Any])
      
      inline def setSyncLocal(value: () => Unit): Self = StObject.set(x, "syncLocal", js.Any.fromFunction0(value))
      
      inline def setSyncRemote(value: () => Unit): Self = StObject.set(x, "syncRemote", js.Any.fromFunction0(value))
    }
  }
}
