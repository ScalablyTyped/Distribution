package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RerouteLineRequest extends StObject {
  
  /**
    * The object ID of the line to reroute. Only a line with a category indicating it is a "connector" can be rerouted. The start and end connections of the line must be on different page
    * elements.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object RerouteLineRequest {
  
  @scala.inline
  def apply(): RerouteLineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RerouteLineRequest]
  }
  
  @scala.inline
  implicit class RerouteLineRequestMutableBuilder[Self <: RerouteLineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
