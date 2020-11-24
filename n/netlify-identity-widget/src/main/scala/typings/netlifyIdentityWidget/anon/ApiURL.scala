package typings.netlifyIdentityWidget.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiURL extends js.Object {
  
  var _sameOrigin: js.UndefOr[Boolean] = js.native
  
  var apiURL: String = js.native
  
  var defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]] = js.native
}
object ApiURL {
  
  @scala.inline
  def apply(apiURL: String, defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]]): ApiURL = {
    val __obj = js.Dynamic.literal(apiURL = apiURL.asInstanceOf[js.Any], defaultHeaders = defaultHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiURL]
  }
  
  @scala.inline
  implicit class ApiURLOps[Self <: ApiURL] (val x: Self) extends AnyVal {
    
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
    def setApiURL(value: String): Self = this.set("apiURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = this.set("defaultHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sameOrigin(value: Boolean): Self = this.set("_sameOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sameOrigin: Self = this.set("_sameOrigin", js.undefined)
  }
}
