package typings
package phaserLib.PhaserNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single text file based Unity Texture Atlas File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#unityAtlas method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#unityAtlas.
  */
@JSGlobal("Phaser.Loader.FileTypes.UnityAtlasFile")
@js.native
class UnityAtlasFile protected ()
  extends phaserLib.PhaserNs.LoaderNs.MultiFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param atlasURL The absolute or relative URL to load the texture atlas data file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
    * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas data file. Used in replacement of the Loaders default XHR Settings.
    */
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.UnityAtlasFileConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, textureURL: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, textureURL: js.Array[java.lang.String]) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.UnityAtlasFileConfig, textureURL: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.UnityAtlasFileConfig, textureURL: js.Array[java.lang.String]) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, textureURL: java.lang.String, atlasURL: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, textureURL: js.Array[java.lang.String], atlasURL: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.UnityAtlasFileConfig, textureURL: java.lang.String, atlasURL: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.UnityAtlasFileConfig, textureURL: js.Array[java.lang.String], atlasURL: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, textureURL: java.lang.String, atlasURL: java.lang.String, textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, textureURL: js.Array[java.lang.String], atlasURL: java.lang.String, textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.UnityAtlasFileConfig, textureURL: java.lang.String, atlasURL: java.lang.String, textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.UnityAtlasFileConfig, textureURL: js.Array[java.lang.String], atlasURL: java.lang.String, textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, textureURL: java.lang.String, atlasURL: java.lang.String, textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject, atlasXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, textureURL: js.Array[java.lang.String], atlasURL: java.lang.String, textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject, atlasXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.UnityAtlasFileConfig, textureURL: java.lang.String, atlasURL: java.lang.String, textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject, atlasXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.UnityAtlasFileConfig, textureURL: js.Array[java.lang.String], atlasURL: java.lang.String, textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject, atlasXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  /**
    * Adds this file to its target cache upon successful loading and processing.
    */
  def addToCache(): scala.Unit = js.native
}

