package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardInfo extends StObject {
  
  /** URI of the resource that the packet is forwarded to. */
  var resourceUri: js.UndefOr[String] = js.native
  
  /** Target type where this packet is forwarded to. */
  var target: js.UndefOr[String] = js.native
}
object ForwardInfo {
  
  @scala.inline
  def apply(): ForwardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardInfo]
  }
  
  @scala.inline
  implicit class ForwardInfoMutableBuilder[Self <: ForwardInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
