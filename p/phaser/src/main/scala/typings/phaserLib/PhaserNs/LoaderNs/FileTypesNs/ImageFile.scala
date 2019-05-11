package typings
package phaserLib.PhaserNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Image File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#image method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#image.
  */
@JSGlobal("Phaser.Loader.FileTypes.ImageFile")
@js.native
class ImageFile protected ()
  extends phaserLib.PhaserNs.LoaderNs.File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    * @param frameConfig The frame configuration object. Only provided for, and used by, Sprite Sheets.
    */
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFileConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: js.Array[java.lang.String]) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFileConfig, url: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFileConfig, url: js.Array[java.lang.String]) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: js.Array[java.lang.String], xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFileConfig, url: java.lang.String, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFileConfig, url: js.Array[java.lang.String], xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject, frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: js.Array[java.lang.String], xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject, frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFileConfig, url: java.lang.String, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject, frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFileConfig, url: js.Array[java.lang.String], xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject, frameConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig) = this()
}

