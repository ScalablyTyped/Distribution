package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionNumber extends js.Object {
  var direction: AnonEnum
  var number: AnonAlias
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var pull_number: AnonRequired
  var repo: AnonRequired
  var since: AnonType
  var sort: AnonEnum
}

object AnonDirectionNumber {
  @scala.inline
  def apply(
    direction: AnonEnum,
    number: AnonAlias,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    pull_number: AnonRequired,
    repo: AnonRequired,
    since: AnonType,
    sort: AnonEnum
  ): AnonDirectionNumber = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectionNumber]
  }
}

