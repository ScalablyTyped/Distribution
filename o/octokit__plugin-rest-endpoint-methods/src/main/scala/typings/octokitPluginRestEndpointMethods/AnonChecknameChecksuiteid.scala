package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecknameChecksuiteid extends js.Object {
  var check_name: AnonType
  var check_suite_id: AnonRequired
  var filter: AnonEnum
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
  var status: AnonEnum
}

object AnonChecknameChecksuiteid {
  @scala.inline
  def apply(
    check_name: AnonType,
    check_suite_id: AnonRequired,
    filter: AnonEnum,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    repo: AnonRequired,
    status: AnonEnum
  ): AnonChecknameChecksuiteid = {
    val __obj = js.Dynamic.literal(check_name = check_name.asInstanceOf[js.Any], check_suite_id = check_suite_id.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChecknameChecksuiteid]
  }
}

