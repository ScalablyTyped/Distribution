package typings
package phaserLib.PhaserNs.LoaderNs.FileTypesNs

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
class HTML5AudioFile protected ()
  extends phaserLib.PhaserNs.LoaderNs.File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param urlConfig The absolute or relative URL to load this file from.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.AudioFileConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, urlConfig: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.AudioFileConfig, urlConfig: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, urlConfig: java.lang.String, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.AudioFileConfig, urlConfig: java.lang.String, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  /**
    * Called if the file errors while loading.
    */
  def onError(): scala.Unit = js.native
  /**
    * Called when the file finishes loading.
    */
  def onLoad(): scala.Unit = js.native
  /**
    * Called during the file load progress. Is sent a DOM ProgressEvent.
    */
  def onProgress(): scala.Unit = js.native
}

