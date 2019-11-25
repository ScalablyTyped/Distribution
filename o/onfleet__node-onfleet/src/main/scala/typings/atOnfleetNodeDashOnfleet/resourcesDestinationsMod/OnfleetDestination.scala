package typings.atOnfleetNodeDashOnfleet.resourcesDestinationsMod

import typings.atOnfleetNodeDashOnfleet.Anon_Apartment
import typings.atOnfleetNodeDashOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetDestination extends js.Object {
  var address: Anon_Apartment
  var id: String
  var location: Location
  var metadata: js.Array[OnfleetMetadata]
  var notes: String
  var timeCreated: Double
  var timeLastModified: Double
}

object OnfleetDestination {
  @scala.inline
  def apply(
    address: Anon_Apartment,
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
}

