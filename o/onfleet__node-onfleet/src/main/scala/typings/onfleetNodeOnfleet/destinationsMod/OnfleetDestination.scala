package typings.onfleetNodeOnfleet.destinationsMod

import typings.onfleetNodeOnfleet.anon.Apartment
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnfleetDestination extends js.Object {
  
  var address: Apartment = js.native
  
  var id: String = js.native
  
  var location: Location = js.native
  
  var metadata: js.Array[OnfleetMetadata] = js.native
  
  var notes: String = js.native
  
  var timeCreated: Double = js.native
  
  var timeLastModified: Double = js.native
}
object OnfleetDestination {
  
  @scala.inline
  def apply(
    address: Apartment,
    id: String,
    location: Location,
    metadata: js.Array[OnfleetMetadata],
    notes: String,
    timeCreated: Double,
    timeLastModified: Double
  ): OnfleetDestination = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetDestination]
  }
  
  @scala.inline
  implicit class OnfleetDestinationOps[Self <: OnfleetDestination] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: Apartment): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataVarargs(value: OnfleetMetadata*): Self = this.set("metadata", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: js.Array[OnfleetMetadata]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreated(value: Double): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLastModified(value: Double): Self = this.set("timeLastModified", value.asInstanceOf[js.Any])
  }
}
