package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnon extends js.Object {
  var anon: AnonType
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
}

object AnonAnon {
  @scala.inline
  def apply(anon: AnonType, owner: AnonRequired, page: AnonType, per_page: AnonType, repo: AnonRequired): AnonAnon = {
    val __obj = js.Dynamic.literal(anon = anon.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnon]
  }
}

