package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortInfo extends StObject {
  
  /** Causes that the analysis is aborted. */
  var cause: js.UndefOr[String] = js.native
  
  /** URI of the resource that caused the abort. */
  var resourceUri: js.UndefOr[String] = js.native
}
object AbortInfo {
  
  @scala.inline
  def apply(): AbortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortInfo]
  }
  
  @scala.inline
  implicit class AbortInfoMutableBuilder[Self <: AbortInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
