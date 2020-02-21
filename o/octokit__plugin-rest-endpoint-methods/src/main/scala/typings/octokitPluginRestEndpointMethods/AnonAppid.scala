package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppid extends js.Object {
  var app_id: AnonType
  var check_name: AnonType
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var ref: AnonRequired
  var repo: AnonRequired
}

object AnonAppid {
  @scala.inline
  def apply(
    app_id: AnonType,
    check_name: AnonType,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    ref: AnonRequired,
    repo: AnonRequired
  ): AnonAppid = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], check_name = check_name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAppid]
  }
}

