package typings.octokitCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.octokitCore.anon.Debug
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OctokitOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var auth: js.UndefOr[js.Any] = js.native
  
  var authStrategy: js.UndefOr[js.Any] = js.native
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[Debug] = js.native
  
  var previews: js.UndefOr[js.Array[String]] = js.native
  
  var request: js.UndefOr[RequestRequestOptions] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
  
  var userAgent: js.UndefOr[String] = js.native
}
object OctokitOptions {
  
  @scala.inline
  def apply(): OctokitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OctokitOptions]
  }
  
  @scala.inline
  implicit class OctokitOptionsOps[Self <: OctokitOptions] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: js.Any): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setAuthStrategy(value: js.Any): Self = this.set("authStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthStrategy: Self = this.set("authStrategy", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setLog(value: Debug): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setPreviewsVarargs(value: String*): Self = this.set("previews", js.Array(value :_*))
    
    @scala.inline
    def setPreviews(value: js.Array[String]): Self = this.set("previews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviews: Self = this.set("previews", js.undefined)
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
