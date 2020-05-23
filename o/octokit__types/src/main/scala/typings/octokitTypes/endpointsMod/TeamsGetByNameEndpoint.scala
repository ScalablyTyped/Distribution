package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetByNameEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var team_slug: String
}

object TeamsGetByNameEndpoint {
  @scala.inline
  def apply(org_ : String, team_slug: String): TeamsGetByNameEndpoint = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetByNameEndpoint]
  }
}

