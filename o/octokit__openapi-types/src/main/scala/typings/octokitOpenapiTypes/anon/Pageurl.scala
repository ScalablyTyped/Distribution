package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pageurl extends StObject {
  
  /**
    * Format: uri
    * @description The URI to the deployed GitHub Pages.
    * @example hello-world.github.io
    */
  var page_url: String
  
  /**
    * Format: uri
    * @description The URI to the deployed GitHub Pages preview.
    * @example monalisa-1231a2312sa32-23sda74.drafts.github.io
    */
  var preview_url: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @description The URI to monitor GitHub Pages deployment status.
    * @example https://api.github.com/repos/github/hello-world/pages/deployments/4fd754f7e594640989b406850d0bc8f06a121251/status
    */
  var status_url: String
}
object Pageurl {
  
  inline def apply(page_url: String, status_url: String): Pageurl = {
    val __obj = js.Dynamic.literal(page_url = page_url.asInstanceOf[js.Any], status_url = status_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pageurl]
  }
  
  extension [Self <: Pageurl](x: Self) {
    
    inline def setPage_url(value: String): Self = StObject.set(x, "page_url", value.asInstanceOf[js.Any])
    
    inline def setPreview_url(value: String): Self = StObject.set(x, "preview_url", value.asInstanceOf[js.Any])
    
    inline def setPreview_urlUndefined: Self = StObject.set(x, "preview_url", js.undefined)
    
    inline def setStatus_url(value: String): Self = StObject.set(x, "status_url", value.asInstanceOf[js.Any])
  }
}
