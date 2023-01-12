package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var destGroups: DestGroupsResource
}
object LocationsResource {
  
  inline def apply(destGroups: DestGroupsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(destGroups = destGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    inline def setDestGroups(value: DestGroupsResource): Self = StObject.set(x, "destGroups", value.asInstanceOf[js.Any])
  }
}
