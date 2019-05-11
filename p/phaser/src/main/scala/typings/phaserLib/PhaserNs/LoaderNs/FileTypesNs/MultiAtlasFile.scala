package typings
package phaserLib.PhaserNs.LoaderNs.FileTypesNs

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
  extends phaserLib.PhaserNs.LoaderNs.MultiFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key of the file. Must be unique within both the Loader and the Texture Manager.
    * @param atlasURL The absolute or relative URL to load the multi atlas json file from.
    * @param path Optional path to use when loading the textures defined in the atlas data.
    * @param baseURL Optional Base URL to use when loading the textures defined in the atlas data.
    * @param atlasXhrSettings Extra XHR Settings specifically for the atlas json file.
    * @param textureXhrSettings Extra XHR Settings specifically for the texture files.
    */
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, atlasURL: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, atlasURL: java.lang.String, path: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, atlasURL: java.lang.String, path: java.lang.String, baseURL: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, atlasURL: java.lang.String, path: java.lang.String, baseURL: java.lang.String, atlasXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, atlasURL: java.lang.String, path: java.lang.String, baseURL: java.lang.String, atlasXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject, textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  /**
    * Adds this file to its target cache upon successful loading and processing.
    */
  def addToCache(): scala.Unit = js.native
}

