package typings.atOnfleetNodeDashOnfleet.resourcesHubsMod

import typings.atOnfleetNodeDashOnfleet.Anon_Apartment
import typings.atOnfleetNodeDashOnfleet.resourcesDestinationsMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetHub extends js.Object {
  var address: Anon_Apartment
  var id: String
  var location: Location
  var name: String
  var teams: js.Array[String]
}

object OnfleetHub {
  @scala.inline
  def apply(address: Anon_Apartment, id: String, location: Location, name: String, teams: js.Array[String]): OnfleetHub = {
    val __obj = js.Dynamic.literal(address = address, id = id, location = location, name = name, teams = teams)
  
    __obj.asInstanceOf[OnfleetHub]
  }
}

