package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetByNameParams extends js.Object {
  var org: String
  var team_slug: String
}

object TeamsGetByNameParams {
  @scala.inline
  def apply(org: String, team_slug: String): TeamsGetByNameParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetByNameParams]
  }
}

