package typings.nodeTelegramBotApi.mod

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetWebHookOptions extends js.Object {
  
  var allowed_updates: js.UndefOr[js.Array[String]] = js.native
  
  var certificate: js.UndefOr[String | Stream] = js.native
  
  var max_connections: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object SetWebHookOptions {
  
  @scala.inline
  def apply(): SetWebHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetWebHookOptions]
  }
  
  @scala.inline
  implicit class SetWebHookOptionsOps[Self <: SetWebHookOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowed_updatesVarargs(value: String*): Self = this.set("allowed_updates", js.Array(value :_*))
    
    @scala.inline
    def setAllowed_updates(value: js.Array[String]): Self = this.set("allowed_updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed_updates: Self = this.set("allowed_updates", js.undefined)
    
    @scala.inline
    def setCertificate(value: String | Stream): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setMax_connections(value: Double): Self = this.set("max_connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_connections: Self = this.set("max_connections", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
