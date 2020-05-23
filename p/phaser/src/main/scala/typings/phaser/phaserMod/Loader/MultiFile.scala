package typings.phaser.phaserMod.Loader

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
@JSImport("phaser", "Loader.MultiFile")
@js.native
class MultiFile protected ()
  extends typings.phaser.Phaser.Loader.MultiFile {
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
    * A reference to the Loaders baseURL at the time this MultiFile was created.
    * Used to populate child-files.
    */
  /* CompleteClass */
  override var baseURL: String = js.native
  /**
    * The completion status of this MultiFile.
    */
  /* CompleteClass */
  override var complete: Boolean = js.native
  /**
    * A storage container for transient data that the loading files need.
    */
  /* CompleteClass */
  override var config: js.Any = js.native
  /**
    * The number of files that failed to load.
    */
  /* CompleteClass */
  override var failed: integer = js.native
  /**
    * Array of files that make up this MultiFile.
    */
  /* CompleteClass */
  override var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
  /**
    * Unique cache key (unique within its file type)
    */
  /* CompleteClass */
  override var key: String = js.native
  /**
    * A reference to the Loader that is going to load this file.
    */
  /* CompleteClass */
  override var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
  /**
    * A reference to the Loaders path at the time this MultiFile was created.
    * Used to populate child-files.
    */
  /* CompleteClass */
  override var path: String = js.native
  /**
    * The number of files to load.
    */
  /* CompleteClass */
  override var pending: integer = js.native
  /**
    * A reference to the Loaders prefix at the time this MultiFile was created.
    * Used to populate child-files.
    */
  /* CompleteClass */
  override var prefix: String = js.native
  /**
    * The file type string for sorting within the Loader.
    */
  /* CompleteClass */
  override var `type`: String = js.native
  /**
    * Adds another child to this MultiFile, increases the pending count and resets the completion status.
    * @param files The File to add to this MultiFile.
    */
  /* CompleteClass */
  override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
  /**
    * Checks if this MultiFile is ready to process its children or not.
    */
  /* CompleteClass */
  override def isReadyToProcess(): Boolean = js.native
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
}

