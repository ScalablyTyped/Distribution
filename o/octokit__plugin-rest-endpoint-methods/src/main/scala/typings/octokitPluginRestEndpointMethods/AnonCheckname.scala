package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckname extends js.Object {
  var check_name: AnonType
  var filter: AnonEnum
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var ref: AnonRequired
  var repo: AnonRequired
  var status: AnonEnum
}

object AnonCheckname {
  @scala.inline
  def apply(
    check_name: AnonType,
    filter: AnonEnum,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    ref: AnonRequired,
    repo: AnonRequired,
    status: AnonEnum
  ): AnonCheckname = {
    val __obj = js.Dynamic.literal(check_name = check_name.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckname]
  }
}

