package typings.phaser.global.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import typings.phaser.Phaser.Types.Loader.FileTypes.MultiScriptFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Multi Script File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#scripts method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#scripts.
  */
@JSGlobal("Phaser.Loader.FileTypes.MultiScriptFile")
@js.native
class MultiScriptFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.MultiScriptFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url An array of absolute or relative URLs to load the script files from. They are processed in the order given in the array.
    * @param xhrSettings An XHR Settings configuration object for the script files. Used in replacement of the Loaders default XHR Settings.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: MultiScriptFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: MultiScriptFileConfig, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String], xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: MultiScriptFileConfig,
    url: js.Array[String],
    xhrSettings: XHRSettingsObject
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
  override var files: js.Array[File] = js.native
  /**
    * Unique cache key (unique within its file type)
    */
  /* CompleteClass */
  override var key: String = js.native
  /**
    * A reference to the Loader that is going to load this file.
    */
  /* CompleteClass */
  override var loader: LoaderPlugin = js.native
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
    * Adds this file to its target cache upon successful loading and processing.
    */
  /* CompleteClass */
  override def addToCache(): Unit = js.native
  /**
    * Adds another child to this MultiFile, increases the pending count and resets the completion status.
    * @param files The File to add to this MultiFile.
    */
  /* CompleteClass */
  override def addToMultiFile(files: File): MultiFile = js.native
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
  override def onFileComplete(file: File): Unit = js.native
  /**
    * Called by each File that fails to load.
    * @param file The File that has failed to load.
    */
  /* CompleteClass */
  override def onFileFailed(file: File): Unit = js.native
}

