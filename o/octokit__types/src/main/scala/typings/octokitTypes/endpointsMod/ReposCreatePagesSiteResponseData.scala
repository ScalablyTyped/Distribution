package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Branch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreatePagesSiteResponseData extends StObject {
  
  var cname: String = js.native
  
  var custom_404: Boolean = js.native
  
  var html_url: String = js.native
  
  var source: Branch = js.native
  
  var status: String = js.native
  
  var url: String = js.native
}
object ReposCreatePagesSiteResponseData {
  
  @scala.inline
  def apply(cname: String, custom_404: Boolean, html_url: String, source: Branch, status: String, url: String): ReposCreatePagesSiteResponseData = {
    val __obj = js.Dynamic.literal(cname = cname.asInstanceOf[js.Any], custom_404 = custom_404.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreatePagesSiteResponseData]
  }
  
  @scala.inline
  implicit class ReposCreatePagesSiteResponseDataMutableBuilder[Self <: ReposCreatePagesSiteResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_404(value: Boolean): Self = StObject.set(x, "custom_404", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Branch): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
