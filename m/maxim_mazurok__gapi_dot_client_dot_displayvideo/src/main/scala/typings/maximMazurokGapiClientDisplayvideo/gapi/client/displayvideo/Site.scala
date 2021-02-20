package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Site extends StObject {
  
  /** Output only. The resource name of the site. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The URL or app ID of the site. Must be UTF-8 encoded with a maximum length of 240 bytes. */
  var urlOrAppId: js.UndefOr[String] = js.native
}
object Site {
  
  @scala.inline
  def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit class SiteMutableBuilder[Self <: Site] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrlOrAppId(value: String): Self = StObject.set(x, "urlOrAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlOrAppIdUndefined: Self = StObject.set(x, "urlOrAppId", js.undefined)
  }
}
