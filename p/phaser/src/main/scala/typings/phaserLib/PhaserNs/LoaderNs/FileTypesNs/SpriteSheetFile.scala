package typings
package phaserLib.PhaserNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Sprite Sheet Image File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#spritesheet method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#spritesheet.
  */
@JSGlobal("Phaser.Loader.FileTypes.SpriteSheetFile")
@js.native
class SpriteSheetFile protected ()
  extends phaserLib.PhaserNs.LoaderNs.File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param frameConfig The frame configuration object.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SpriteSheetFileConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: js.Array[java.lang.String]) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SpriteSheetFileConfig, url: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SpriteSheetFileConfig, url: js.Array[java.lang.String]) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String, frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: js.Array[java.lang.String], frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SpriteSheetFileConfig, url: java.lang.String, frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SpriteSheetFileConfig, url: js.Array[java.lang.String], frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String, frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: js.Array[java.lang.String], frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SpriteSheetFileConfig, url: java.lang.String, frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SpriteSheetFileConfig, url: js.Array[java.lang.String], frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
}

