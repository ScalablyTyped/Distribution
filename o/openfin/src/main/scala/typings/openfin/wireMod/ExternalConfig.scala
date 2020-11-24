package typings.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalConfig
  extends BaseConfig
     with _ConnectConfig {
  
  @JSName("manifestUrl")
  var manifestUrl_ExternalConfig: String = js.native
}
object ExternalConfig {
  
  @scala.inline
  def apply(manifestUrl: String): ExternalConfig = {
    val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalConfig]
  }
  
  @scala.inline
  implicit class ExternalConfigOps[Self <: ExternalConfig] (val x: Self) extends AnyVal {
    
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
    def setManifestUrl(value: String): Self = this.set("manifestUrl", value.asInstanceOf[js.Any])
  }
}
