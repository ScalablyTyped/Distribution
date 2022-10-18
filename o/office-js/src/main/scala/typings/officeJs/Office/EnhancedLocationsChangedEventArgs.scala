package typings.officeJs.Office

import typings.officeJs.officeJsStrings.olkEnhancedLocationsChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhancedLocationsChangedEventArgs extends StObject {
  
  /**
    * Gets the set of enhanced locations.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    */
  var enhancedLocations: js.Array[LocationDetails]
  
  /**
    * Gets the type of the event. For details, refer to {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType}.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    */
  var `type`: olkEnhancedLocationsChanged
}
object EnhancedLocationsChangedEventArgs {
  
  inline def apply(enhancedLocations: js.Array[LocationDetails]): EnhancedLocationsChangedEventArgs = {
    val __obj = js.Dynamic.literal(enhancedLocations = enhancedLocations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("olkEnhancedLocationsChanged")
    __obj.asInstanceOf[EnhancedLocationsChangedEventArgs]
  }
  
  extension [Self <: EnhancedLocationsChangedEventArgs](x: Self) {
    
    inline def setEnhancedLocations(value: js.Array[LocationDetails]): Self = StObject.set(x, "enhancedLocations", value.asInstanceOf[js.Any])
    
    inline def setEnhancedLocationsVarargs(value: LocationDetails*): Self = StObject.set(x, "enhancedLocations", js.Array(value*))
    
    inline def setType(value: olkEnhancedLocationsChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
