package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.FileTypes.GLSLFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single GLSL File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#glsl method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#glsl.
  */
@JSImport("phaser", "Loader.FileTypes.GLSLFile")
@js.native
class GLSLFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.GLSLFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
    * @param shaderType The type of shader. Either `fragment` for a fragment shader, or `vertex` for a vertex shader. This is ignored if you load a shader bundle. Default 'fragment'.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: GLSLFileConfig) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: GLSLFileConfig, url: String) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, shaderType: String) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: GLSLFileConfig,
    url: String,
    shaderType: String
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: String,
    url: String,
    shaderType: String,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: GLSLFileConfig,
    url: String,
    shaderType: String,
    xhrSettings: XHRSettingsObject
  ) = this()
}

