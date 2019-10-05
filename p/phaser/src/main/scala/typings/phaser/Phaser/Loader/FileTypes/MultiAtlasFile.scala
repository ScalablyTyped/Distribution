package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
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
class MultiAtlasFile protected () extends MultiFile {
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
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: String, atlasURL: String) = this()
  def this(loader: LoaderPlugin, key: String, atlasURL: String, path: String) = this()
  def this(loader: LoaderPlugin, key: String, atlasURL: String, path: String, baseURL: String) = this()
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
    key: String,
    atlasURL: String,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  /**
    * Adds this file to its target cache upon successful loading and processing.
    */
  def addToCache(): Unit = js.native
}

