package typings.onfleetNodeOnfleet.hubsMod

import typings.onfleetNodeOnfleet.anon.Apartment
import typings.onfleetNodeOnfleet.destinationsMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnfleetHub extends js.Object {
  
  var address: Apartment = js.native
  
  var id: String = js.native
  
  var location: Location = js.native
  
  var name: String = js.native
  
  var teams: js.Array[String] = js.native
}
object OnfleetHub {
  
  @scala.inline
  def apply(address: Apartment, id: String, location: Location, name: String, teams: js.Array[String]): OnfleetHub = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetHub]
  }
  
  @scala.inline
  implicit class OnfleetHubOps[Self <: OnfleetHub] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: String*): Self = this.set("teams", js.Array(value :_*))
    
    @scala.inline
    def setTeams(value: js.Array[String]): Self = this.set("teams", value.asInstanceOf[js.Any])
  }
}
