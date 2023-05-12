package typings.phaser.Phaser.Loader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A MultiFile is a special kind of parent that contains two, or more, Files as children and looks after
  * the loading and processing of them all. It is commonly extended and used as a base class for file types such as AtlasJSON or BitmapFont.
  * 
  * You shouldn't create an instance of a MultiFile directly, but should extend it with your own class, setting a custom type and processing methods.
  */
trait MultiFile extends StObject {
  
  /**
    * Adds another child to this MultiFile, increases the pending count and resets the completion status.
    * @param files The File to add to this MultiFile.
    */
  def addToMultiFile(files: File): MultiFile
  
  /**
    * A reference to the Loaders baseURL at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var baseURL: String
  
  /**
    * The completion status of this MultiFile.
    */
  var complete: Boolean
  
  /**
    * A storage container for transient data that the loading files need.
    */
  var config: Any
  
  /**
    * Destroy this Multi File and any references it holds.
    */
  def destroy(): Unit
  
  /**
    * The number of files that failed to load.
    */
  var failed: Double
  
  /**
    * Array of files that make up this MultiFile.
    */
  var files: js.Array[File]
  
  /**
    * Checks if this MultiFile is ready to process its children or not.
    */
  def isReadyToProcess(): Boolean
  
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String
  
  /**
    * A reference to the Loader that is going to load this file.
    */
  var loader: LoaderPlugin
  
  /**
    * Called by each File when it finishes loading.
    * @param file The File that has completed processing.
    */
  def onFileComplete(file: File): Unit
  
  /**
    * Called by each File that fails to load.
    * @param file The File that has failed to load.
    */
  def onFileFailed(file: File): Unit
  
  /**
    * A reference to the Loaders path at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var path: String
  
  /**
    * The number of files to load.
    */
  var pending: Double
  
  /**
    * Called once all children of this multi file have been added to their caches and is now
    * ready for deletion from the Loader.
    * 
    * It will emit a `filecomplete` event from the LoaderPlugin.
    */
  def pendingDestroy(): Unit
  
  /**
    * A reference to the Loaders prefix at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var prefix: String
  
  /**
    * The current state of the file. One of the FILE_CONST values.
    */
  var state: Double
  
  /**
    * The file type string for sorting within the Loader.
    */
  var `type`: String
}
object MultiFile {
  
  inline def apply(
    addToMultiFile: File => MultiFile,
    baseURL: String,
    complete: Boolean,
    config: Any,
    destroy: () => Unit,
    failed: Double,
    files: js.Array[File],
    isReadyToProcess: () => Boolean,
    key: String,
    loader: LoaderPlugin,
    onFileComplete: File => Unit,
    onFileFailed: File => Unit,
    path: String,
    pending: Double,
    pendingDestroy: () => Unit,
    prefix: String,
    state: Double,
    `type`: String
  ): MultiFile = {
    val __obj = js.Dynamic.literal(addToMultiFile = js.Any.fromFunction1(addToMultiFile), baseURL = baseURL.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), failed = failed.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], isReadyToProcess = js.Any.fromFunction0(isReadyToProcess), key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], onFileComplete = js.Any.fromFunction1(onFileComplete), onFileFailed = js.Any.fromFunction1(onFileFailed), path = path.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pendingDestroy = js.Any.fromFunction0(pendingDestroy), prefix = prefix.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiFile] (val x: Self) extends AnyVal {
    
    inline def setAddToMultiFile(value: File => MultiFile): Self = StObject.set(x, "addToMultiFile", js.Any.fromFunction1(value))
    
    inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setIsReadyToProcess(value: () => Boolean): Self = StObject.set(x, "isReadyToProcess", js.Any.fromFunction0(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: LoaderPlugin): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setOnFileComplete(value: File => Unit): Self = StObject.set(x, "onFileComplete", js.Any.fromFunction1(value))
    
    inline def setOnFileFailed(value: File => Unit): Self = StObject.set(x, "onFileFailed", js.Any.fromFunction1(value))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingDestroy(value: () => Unit): Self = StObject.set(x, "pendingDestroy", js.Any.fromFunction0(value))
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
