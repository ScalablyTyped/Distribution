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
trait MultiFile extends js.Object {
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
  var config: js.Any
  /**
    * The number of files that failed to load.
    */
  var failed: integer
  /**
    * Array of files that make up this MultiFile.
    */
  var files: js.Array[File]
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String
  /**
    * A reference to the Loader that is going to load this file.
    */
  var loader: LoaderPlugin
  /**
    * A reference to the Loaders path at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var path: String
  /**
    * The number of files to load.
    */
  var pending: integer
  /**
    * A reference to the Loaders prefix at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var prefix: String
  /**
    * The file type string for sorting within the Loader.
    */
  var `type`: String
  /**
    * Adds another child to this MultiFile, increases the pending count and resets the completion status.
    * @param files The File to add to this MultiFile.
    */
  def addToMultiFile(files: File): MultiFile
  /**
    * Checks if this MultiFile is ready to process its children or not.
    */
  def isReadyToProcess(): Boolean
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
}

object MultiFile {
  @scala.inline
  def apply(
    addToMultiFile: File => MultiFile,
    baseURL: String,
    complete: Boolean,
    config: js.Any,
    failed: integer,
    files: js.Array[File],
    isReadyToProcess: () => Boolean,
    key: String,
    loader: LoaderPlugin,
    onFileComplete: File => Unit,
    onFileFailed: File => Unit,
    path: String,
    pending: integer,
    prefix: String,
    `type`: String
  ): MultiFile = {
    val __obj = js.Dynamic.literal(addToMultiFile = js.Any.fromFunction1(addToMultiFile), baseURL = baseURL.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], isReadyToProcess = js.Any.fromFunction0(isReadyToProcess), key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], onFileComplete = js.Any.fromFunction1(onFileComplete), onFileFailed = js.Any.fromFunction1(onFileFailed), path = path.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFile]
  }
}

