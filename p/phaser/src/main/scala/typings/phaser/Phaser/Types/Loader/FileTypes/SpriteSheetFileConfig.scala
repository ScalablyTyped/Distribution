package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpriteSheetFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * The frame configuration object.
    */
  var frameConfig: js.UndefOr[ImageFrameConfig] = js.native
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String = js.native
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the image.
    */
  var normalMap: js.UndefOr[String] = js.native
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}

object SpriteSheetFileConfig {
  @scala.inline
  def apply(key: String): SpriteSheetFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheetFileConfig]
  }
  @scala.inline
  implicit class SpriteSheetFileConfigOps[Self <: SpriteSheetFileConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setFrameConfig(value: ImageFrameConfig): Self = this.set("frameConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameConfig: Self = this.set("frameConfig", js.undefined)
    @scala.inline
    def setNormalMap(value: String): Self = this.set("normalMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalMap: Self = this.set("normalMap", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = this.set("xhrSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhrSettings: Self = this.set("xhrSettings", js.undefined)
  }
  
}

