package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetByNameParams extends js.Object {
  var org: java.lang.String
  var team_slug: java.lang.String
}

object TeamsGetByNameParams {
  @scala.inline
  def apply(org: java.lang.String, team_slug: java.lang.String): TeamsGetByNameParams = {
    val __obj = js.Dynamic.literal(org = org, team_slug = team_slug)
  
    __obj.asInstanceOf[TeamsGetByNameParams]
  }
}

