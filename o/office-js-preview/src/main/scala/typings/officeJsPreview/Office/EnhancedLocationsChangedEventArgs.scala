package typings.officeJsPreview.Office

import typings.officeJsPreview.officeJsPreviewStrings.olkEnhancedLocationsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedLocationsChangedEventArgs extends js.Object {
  
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
  implicit class EnhancedLocationsChangedEventArgsOps[Self <: EnhancedLocationsChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnhancedLocationsVarargs(value: LocationDetails*): Self = this.set("enhancedLocations", js.Array(value :_*))
    
    @scala.inline
    def setEnhancedLocations(value: js.Array[LocationDetails]): Self = this.set("enhancedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: olkEnhancedLocationsChanged): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
