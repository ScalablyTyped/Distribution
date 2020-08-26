package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryFileConfig extends js.Object {
  /**
    * Optional type to cast the binary file to once loaded. For example, `Uint8Array`.
    */
  var dataType: js.UndefOr[js.Any] = js.native
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * The key of the file. Must be unique within both the Loader and the Binary Cache.
    */
  var key: String = js.native
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}

object BinaryFileConfig {
  @scala.inline
  def apply(key: String): BinaryFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryFileConfig]
  }
  @scala.inline
  implicit class BinaryFileConfigOps[Self <: BinaryFileConfig] (val x: Self) extends AnyVal {
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
    def setDataType(value: js.Any): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
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

