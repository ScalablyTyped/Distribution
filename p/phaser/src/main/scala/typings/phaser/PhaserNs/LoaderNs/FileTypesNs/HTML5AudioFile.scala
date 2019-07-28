package typings.phaser.PhaserNs.LoaderNs.FileTypesNs

import typings.phaser.PhaserNs.LoaderNs.File
import typings.phaser.PhaserNs.LoaderNs.LoaderPlugin
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.AudioFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Audio File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#audio method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audio.
  */
@JSGlobal("Phaser.Loader.FileTypes.HTML5AudioFile")
@js.native
class HTML5AudioFile protected () extends File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param urlConfig The absolute or relative URL to load this file from.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: AudioFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, urlConfig: String) = this()
  def this(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: String) = this()
  def this(loader: LoaderPlugin, key: String, urlConfig: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: String, xhrSettings: XHRSettingsObject) = this()
  /**
    * Called if the file errors while loading.
    */
  def onError(): Unit = js.native
  /**
    * Called when the file finishes loading.
    */
  def onLoad(): Unit = js.native
  /**
    * Called during the file load progress. Is sent a DOM ProgressEvent.
    */
  def onProgress(): Unit = js.native
}

