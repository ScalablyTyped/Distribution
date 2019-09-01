package typings.officeDashJsDashPreview.OfficeNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.olkEnhancedLocationsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedLocationsChangedEventArgs extends js.Object {
  /**
    * Gets the set of enhanced locations.
    * 
    * [Api set: Mailbox Preview]
    */
  var enhancedLocations: js.Array[LocationDetails]
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    * 
    * [Api set: Mailbox Preview]
    */
  var `type`: olkEnhancedLocationsChanged
}

object EnhancedLocationsChangedEventArgs {
  @scala.inline
  def apply(enhancedLocations: js.Array[LocationDetails], `type`: olkEnhancedLocationsChanged): EnhancedLocationsChangedEventArgs = {
    val __obj = js.Dynamic.literal(enhancedLocations = enhancedLocations)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EnhancedLocationsChangedEventArgs]
  }
}

