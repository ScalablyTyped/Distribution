package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumberOwnerPagePerpage extends js.Object {
  var number: AnonAlias
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var pull_number: AnonRequired
  var repo: AnonRequired
}

object AnonNumberOwnerPagePerpage {
  @scala.inline
  def apply(
    number: AnonAlias,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    pull_number: AnonRequired,
    repo: AnonRequired
  ): AnonNumberOwnerPagePerpage = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNumberOwnerPagePerpage]
  }
}

