package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojrouterMod.urlParamAdapter
import typings.oracleOraclejet.ojrouterMod.urlPathAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseUrl extends js.Object {
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var rootInstanceName: js.UndefOr[String] = js.native
  
  var urlAdapter: js.UndefOr[urlPathAdapter | urlParamAdapter] = js.native
}
object BaseUrl {
  
  @scala.inline
  def apply(): BaseUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseUrl]
  }
  
  @scala.inline
  implicit class BaseUrlOps[Self <: BaseUrl] (val x: Self) extends AnyVal {
    
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setRootInstanceName(value: String): Self = this.set("rootInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootInstanceName: Self = this.set("rootInstanceName", js.undefined)
    
    @scala.inline
    def setUrlAdapter(value: urlPathAdapter | urlParamAdapter): Self = this.set("urlAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlAdapter: Self = this.set("urlAdapter", js.undefined)
  }
}
