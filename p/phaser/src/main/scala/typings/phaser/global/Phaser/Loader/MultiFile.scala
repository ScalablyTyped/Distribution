package typings.phaser.global.Phaser.Loader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A MultiFile is a special kind of parent that contains two, or more, Files as children and looks after
  * the loading and processing of them all. It is commonly extended and used as a base class for file types such as AtlasJSON or BitmapFont.
  * 
  * You shouldn't create an instance of a MultiFile directly, but should extend it with your own class, setting a custom type and processing methods.
  */
@JSGlobal("Phaser.Loader.MultiFile")
@js.native
open class MultiFile protected ()
  extends StObject
     with typings.phaser.Phaser.Loader.MultiFile {
  /**
    * 
    * @param loader The Loader that is going to load this File.
    * @param type The file type string for sorting within the Loader.
    * @param key The key of the file within the loader.
    * @param files An array of Files that make-up this MultiFile.
    */
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    `type`: String,
    key: String,
    files: js.Array[typings.phaser.Phaser.Loader.File]
  ) = this()
  
  /**
    * Adds another child to this MultiFile, increases the pending count and resets the completion status.
    * @param files The File to add to this MultiFile.
    */
  /* CompleteClass */
  override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
  
  /**
    * A reference to the Loaders baseURL at the time this MultiFile was created.
    * Used to populate child-files.
    */
  /* CompleteClass */
  var baseURL: String = js.native
  
  /**
    * The completion status of this MultiFile.
    */
  /* CompleteClass */
  var complete: Boolean = js.native
  
  /**
    * A storage container for transient data that the loading files need.
    */
  /* CompleteClass */
  var config: Any = js.native
  
  /**
    * Destroy this Multi File and any references it holds.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The number of files that failed to load.
    */
  /* CompleteClass */
  var failed: Double = js.native
  
  /**
    * Array of files that make up this MultiFile.
    */
  /* CompleteClass */
  var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
  
  /**
    * Checks if this MultiFile is ready to process its children or not.
    */
  /* CompleteClass */
  override def isReadyToProcess(): Boolean = js.native
  
  /**
    * Unique cache key (unique within its file type)
    */
  /* CompleteClass */
  var key: String = js.native
  
  /**
    * A reference to the Loader that is going to load this file.
    */
  /* CompleteClass */
  var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
  
  /**
    * Called by each File when it finishes loading.
    * @param file The File that has completed processing.
    */
  /* CompleteClass */
  override def onFileComplete(file: typings.phaser.Phaser.Loader.File): Unit = js.native
  
  /**
    * Called by each File that fails to load.
    * @param file The File that has failed to load.
    */
  /* CompleteClass */
  override def onFileFailed(file: typings.phaser.Phaser.Loader.File): Unit = js.native
  
  /**
    * A reference to the Loaders path at the time this MultiFile was created.
    * Used to populate child-files.
    */
  /* CompleteClass */
  var path: String = js.native
  
  /**
    * The number of files to load.
    */
  /* CompleteClass */
  var pending: Double = js.native
  
  /**
    * Called once all children of this multi file have been added to their caches and is now
    * ready for deletion from the Loader.
    * 
    * It will emit a `filecomplete` event from the LoaderPlugin.
    */
  /* CompleteClass */
  override def pendingDestroy(): Unit = js.native
  
  /**
    * A reference to the Loaders prefix at the time this MultiFile was created.
    * Used to populate child-files.
    */
  /* CompleteClass */
  var prefix: String = js.native
  
  /**
    * The current state of the file. One of the FILE_CONST values.
    */
  /* CompleteClass */
  var state: Double = js.native
  
  /**
    * The file type string for sorting within the Loader.
    */
  /* CompleteClass */
  var `type`: String = js.native
}
