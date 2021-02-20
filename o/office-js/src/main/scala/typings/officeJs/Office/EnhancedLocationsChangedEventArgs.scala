package typings.officeJs.Office

import typings.officeJs.officeJsStrings.olkEnhancedLocationsChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedLocationsChangedEventArgs extends StObject {
  
  /**
    * Gets the set of enhanced locations.
    * 
    * [Api set: Mailbox 1.8]
    */
  var enhancedLocations: js.Array[LocationDetails] = js.native
  
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    * 
    * [Api set: Mailbox 1.8]
    */
  var `type`: olkEnhancedLocationsChanged = js.native
}
object EnhancedLocationsChangedEventArgs {
  
  @scala.inline
  def apply(enhancedLocations: js.Array[LocationDetails], `type`: olkEnhancedLocationsChanged): EnhancedLocationsChangedEventArgs = {
    val __obj = js.Dynamic.literal(enhancedLocations = enhancedLocations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedLocationsChangedEventArgs]
  }
  
  @scala.inline
  implicit class EnhancedLocationsChangedEventArgsMutableBuilder[Self <: EnhancedLocationsChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnhancedLocations(value: js.Array[LocationDetails]): Self = StObject.set(x, "enhancedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedLocationsVarargs(value: LocationDetails*): Self = StObject.set(x, "enhancedLocations", js.Array(value :_*))
    
    @scala.inline
    def setType(value: olkEnhancedLocationsChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
