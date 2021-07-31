package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyLinkStatus extends StObject {
  
  var linkStatus: js.UndefOr[String] = js.undefined
}
object ThirdPartyLinkStatus {
  
  @scala.inline
  def apply(): ThirdPartyLinkStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyLinkStatus]
  }
  
  @scala.inline
  implicit class ThirdPartyLinkStatusMutableBuilder[Self <: ThirdPartyLinkStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkStatus(value: String): Self = StObject.set(x, "linkStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkStatusUndefined: Self = StObject.set(x, "linkStatus", js.undefined)
  }
}
