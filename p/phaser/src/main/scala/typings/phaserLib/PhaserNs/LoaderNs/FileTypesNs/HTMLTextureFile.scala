package typings
package phaserLib.PhaserNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single HTML File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#htmlTexture method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#htmlTexture.
  */
@JSGlobal("Phaser.Loader.FileTypes.HTMLTextureFile")
@js.native
class HTMLTextureFile protected ()
  extends phaserLib.PhaserNs.LoaderNs.File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param width The width of the texture the HTML will be rendered to.
    * @param height The height of the texture the HTML will be rendered to.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.HTMLTextureFileConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.HTMLTextureFileConfig, url: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String, width: phaserLib.integer) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.HTMLTextureFileConfig, url: java.lang.String, width: phaserLib.integer) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String, width: phaserLib.integer, height: phaserLib.integer) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.HTMLTextureFileConfig, url: java.lang.String, width: phaserLib.integer, height: phaserLib.integer) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String, width: phaserLib.integer, height: phaserLib.integer, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.HTMLTextureFileConfig, url: java.lang.String, width: phaserLib.integer, height: phaserLib.integer, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
}

