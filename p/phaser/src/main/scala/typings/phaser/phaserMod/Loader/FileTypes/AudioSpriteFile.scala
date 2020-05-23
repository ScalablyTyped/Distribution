package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import typings.phaser.Phaser.Types.Loader.FileTypes.AudioSpriteFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Audio Sprite File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#audioSprite method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audioSprite.
  */
@JSImport("phaser", "Loader.FileTypes.AudioSpriteFile")
@js.native
class AudioSpriteFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.AudioSpriteFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param jsonURL The absolute or relative URL to load the json file from. Or a well formed JSON object to use instead.
    * @param audioURL The absolute or relative URL to load the audio file from. If empty it will be obtained by parsing the JSON file.
    * @param audioConfig The audio configuration options.
    * @param audioXhrSettings An XHR Settings configuration object for the audio file. Used in replacement of the Loaders default XHR Settings.
    * @param jsonXhrSettings An XHR Settings configuration object for the json file. Used in replacement of the Loaders default XHR Settings.
    */
  def this(loader: LoaderPlugin, key: String, jsonURL: String) = this()
  def this(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String) = this()
  def this(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: js.Object) = this()
  def this(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String, audioURL: js.Object) = this()
  def this(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: js.Object, audioConfig: js.Any) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioSpriteFileConfig,
    jsonURL: String,
    audioURL: js.Object,
    audioConfig: js.Any
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    jsonURL: String,
    audioURL: js.Object,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioSpriteFileConfig,
    jsonURL: String,
    audioURL: js.Object,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    jsonURL: String,
    audioURL: js.Object,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject,
    jsonXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioSpriteFileConfig,
    jsonURL: String,
    audioURL: js.Object,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject,
    jsonXhrSettings: XHRSettingsObject
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

