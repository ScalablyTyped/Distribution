package typings.phaser.Phaser.Types.Loader

import typings.phaser.phaserBooleans.`false`
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConfig extends js.Object {
  /**
    * A config object that can be used by file types to store transitional data.
    */
  var config: js.UndefOr[js.Any] = js.native
  /**
    * The default extension this file uses.
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String = js.native
  /**
    * The path of the file, not including the baseURL.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The responseType to be used by the XHR request.
    */
  var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.native
  /**
    * The file type string (image, json, etc) for sorting within the Loader.
    */
  var `type`: String = js.native
  /**
    * The URL of the file, not including baseURL.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Custom XHR Settings specific to this file and merged with the Loader defaults.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject | `false`] = js.native
}

object FileConfig {
  @scala.inline
  def apply(key: String, `type`: String): FileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfig]
  }
  @scala.inline
  implicit class FileConfigOps[Self <: FileConfig] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setResponseType(value: XMLHttpRequestResponseType): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject | `false`): Self = this.set("xhrSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhrSettings: Self = this.set("xhrSettings", js.undefined)
  }
  
}

