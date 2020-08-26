package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackFileConfig extends js.Object {
  /**
    * If specified instead of the whole JSON file being parsed, only the section corresponding to this property key will be added. If the property you want to extract is nested, use periods to divide it.
    */
  var dataKey: js.UndefOr[String] = js.native
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * The key of the file. Must be unique within both the Loader and the JSON Cache.
    */
  var key: String = js.native
  /**
    * The absolute or relative URL to load the file from. Or can be a ready formed JSON object, in which case it will be directly processed.
    */
  var url: js.UndefOr[String | js.Any] = js.native
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}

object PackFileConfig {
  @scala.inline
  def apply(key: String): PackFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackFileConfig]
  }
  @scala.inline
  implicit class PackFileConfigOps[Self <: PackFileConfig] (val x: Self) extends AnyVal {
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
    def setDataKey(value: String): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataKey: Self = this.set("dataKey", js.undefined)
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setUrl(value: String | js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = this.set("xhrSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhrSettings: Self = this.set("xhrSettings", js.undefined)
  }
  
}

