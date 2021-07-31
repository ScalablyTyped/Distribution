package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropInfo extends StObject {
  
  /** Cause that the packet is dropped. */
  var cause: js.UndefOr[String] = js.undefined
  
  /** URI of the resource that caused the drop. */
  var resourceUri: js.UndefOr[String] = js.undefined
}
object DropInfo {
  
  @scala.inline
  def apply(): DropInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropInfo]
  }
  
  @scala.inline
  implicit class DropInfoMutableBuilder[Self <: DropInfo] (val x: Self) extends AnyVal {
    
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
