package typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import typings.phaser.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLSLFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Text Cache.
    */
  var key: String
  /**
    * The type of shader. Either `fragment` for a fragment shader, or `vertex` for a vertex shader. This is ignored if you load a shader bundle.
    */
  var shaderType: js.UndefOr[String] = js.undefined
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object GLSLFileConfig {
  @scala.inline
  def apply(
    key: String,
    extension: String = null,
    shaderType: String = null,
    url: String = null,
    xhrSettings: XHRSettingsObject = null
  ): GLSLFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (shaderType != null) __obj.updateDynamic("shaderType")(shaderType)
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[GLSLFileConfig]
  }
}

