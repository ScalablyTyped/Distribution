package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationDetails extends StObject {
  
  /**
    * The location's display name.
    */
  var displayName: String
  
  /**
    * The email address associated with the location.
    */
  var emailAddress: String
  
  /**
    * The `LocationIdentifier` of the location.
    */
  var locationIdentifier: LocationIdentifier
}
object LocationDetails {
  
  inline def apply(displayName: String, emailAddress: String, locationIdentifier: LocationIdentifier): LocationDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], locationIdentifier = locationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationDetails] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setLocationIdentifier(value: LocationIdentifier): Self = StObject.set(x, "locationIdentifier", value.asInstanceOf[js.Any])
  }
}
