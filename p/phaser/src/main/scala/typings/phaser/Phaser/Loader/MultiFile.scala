package typings.phaser.Phaser.Loader

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A MultiFile is a special kind of parent that contains two, or more, Files as children and looks after
  * the loading and processing of them all. It is commonly extended and used as a base class for file types such as AtlasJSON or BitmapFont.
  * 
  * You shouldn't create an instance of a MultiFile directly, but should extend it with your own class, setting a custom type and processing methods.
  */
@JSGlobal("Phaser.Loader.MultiFile")
@js.native
class MultiFile protected () extends js.Object {
  /**
    * 
    * @param loader The Loader that is going to load this File.
    * @param type The file type string for sorting within the Loader.
    * @param key The key of the file within the loader.
    * @param files An array of Files that make-up this MultiFile.
    */
  def this(loader: LoaderPlugin, `type`: String, key: String, files: js.Array[File]) = this()
  /**
    * The completion status of this MultiFile.
    */
  var complete: Boolean = js.native
  /**
    * A storage container for transient data that the loading files need.
    */
  var config: js.Any = js.native
  /**
    * The number of files that failed to load.
    */
  var failed: integer = js.native
  /**
    * Array of files that make up this MultiFile.
    */
  var files: js.Array[File] = js.native
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String = js.native
  /**
    * A reference to the Loader that is going to load this file.
    */
  var loader: LoaderPlugin = js.native
  /**
    * The number of files to load.
    */
  var pending: integer = js.native
  /**
    * The file type string for sorting within the Loader.
    */
  var `type`: String = js.native
  /**
    * Adds another child to this MultiFile, increases the pending count and resets the completion status.
    * @param files The File to add to this MultiFile.
    */
  def addToMultiFile(files: File): MultiFile = js.native
  /**
    * Checks if this MultiFile is ready to process its children or not.
    */
  def isReadyToProcess(): Boolean = js.native
  /**
    * Called by each File when it finishes loading.
    * @param file The File that has completed processing.
    */
  def onFileComplete(file: File): Unit = js.native
  /**
    * Called by each File that fails to load.
    * @param file The File that has failed to load.
    */
  def onFileFailed(file: File): Unit = js.native
}

