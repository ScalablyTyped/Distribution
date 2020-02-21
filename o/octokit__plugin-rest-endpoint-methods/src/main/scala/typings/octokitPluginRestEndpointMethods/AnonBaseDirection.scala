package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseDirection extends js.Object {
  var base: AnonType
  var direction: AnonEnum
  var head: AnonType
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
  var sort: AnonEnum
  var state: AnonEnum
}

object AnonBaseDirection {
  @scala.inline
  def apply(
    base: AnonType,
    direction: AnonEnum,
    head: AnonType,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    repo: AnonRequired,
    sort: AnonEnum,
    state: AnonEnum
  ): AnonBaseDirection = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBaseDirection]
  }
}

