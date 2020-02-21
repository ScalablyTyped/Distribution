package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllBefore extends js.Object {
  var all: AnonType
  var before: AnonType
  var owner: AnonRequired
  var page: AnonType
  var participating: AnonType
  var per_page: AnonType
  var repo: AnonRequired
  var since: AnonType
}

object AnonAllBefore {
  @scala.inline
  def apply(
    all: AnonType,
    before: AnonType,
    owner: AnonRequired,
    page: AnonType,
    participating: AnonType,
    per_page: AnonType,
    repo: AnonRequired,
    since: AnonType
  ): AnonAllBefore = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], participating = participating.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllBefore]
  }
}

