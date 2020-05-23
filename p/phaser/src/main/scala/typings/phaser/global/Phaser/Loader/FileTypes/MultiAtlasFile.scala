package typings.phaser.global.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import typings.phaser.Phaser.Types.Loader.FileTypes.MultiAtlasFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Multi Texture Atlas File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#multiatlas method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#multiatlas.
  */
@JSGlobal("Phaser.Loader.FileTypes.MultiAtlasFile")
@js.native
class MultiAtlasFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.MultiAtlasFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key of the file. Must be unique within both the Loader and the Texture Manager. Or a config object.
    * @param atlasURL The absolute or relative URL to load the multi atlas json file from.
    * @param path Optional path to use when loading the textures defined in the atlas data.
    * @param baseURL Optional Base URL to use when loading the textures defined in the atlas data.
    * @param atlasXhrSettings Extra XHR Settings specifically for the atlas json file.
    * @param textureXhrSettings Extra XHR Settings specifically for the texture files.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: MultiAtlasFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, atlasURL: String) = this()
  def this(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String) = this()
  def this(loader: LoaderPlugin, key: String, atlasURL: String, path: String) = this()
  def this(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String, path: String) = this()
  def this(loader: LoaderPlugin, key: String, atlasURL: String, path: String, baseURL: String) = this()
  def this(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String, path: String, baseURL: String) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    atlasURL: String,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: MultiAtlasFileConfig,
    atlasURL: String,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    atlasURL: String,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: MultiAtlasFileConfig,
    atlasURL: String,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject,
    textureXhrSettings: XHRSettingsObject
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

