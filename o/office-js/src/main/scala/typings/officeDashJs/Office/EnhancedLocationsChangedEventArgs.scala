package typings.officeDashJs.Office

import typings.officeDashJs.officeDashJsStrings.olkEnhancedLocationsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedLocationsChangedEventArgs extends js.Object {
  /**
    * Gets the set of enhanced locations.
    * 
    * [Api set: Mailbox 1.8]
    */
  var enhancedLocations: js.Array[LocationDetails]
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    * 
    * [Api set: Mailbox 1.8]
    */
  var `type`: olkEnhancedLocationsChanged
}

object EnhancedLocationsChangedEventArgs {
  @scala.inline
  def apply(enhancedLocations: js.Array[LocationDetails], `type`: olkEnhancedLocationsChanged): EnhancedLocationsChangedEventArgs = {
    val __obj = js.Dynamic.literal(enhancedLocations = enhancedLocations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedLocationsChangedEventArgs]
  }
}

