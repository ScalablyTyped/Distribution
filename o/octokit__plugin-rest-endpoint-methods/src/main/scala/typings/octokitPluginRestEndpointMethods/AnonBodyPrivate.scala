package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyPrivate extends js.Object {
  var body: AnonRequired
  var `private`: AnonType
  var team_id: AnonRequired
  var title: AnonRequired
}

object AnonBodyPrivate {
  @scala.inline
  def apply(body: AnonRequired, `private`: AnonType, team_id: AnonRequired, title: AnonRequired): AnonBodyPrivate = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyPrivate]
  }
}

