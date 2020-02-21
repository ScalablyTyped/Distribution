package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: AnonRequired
  var encoding: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonContent {
  @scala.inline
  def apply(content: AnonRequired, encoding: AnonType, owner: AnonRequired, repo: AnonRequired): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContent]
  }
}

