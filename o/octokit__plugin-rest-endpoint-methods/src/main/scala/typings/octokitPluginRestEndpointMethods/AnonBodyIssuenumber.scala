package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyIssuenumber extends js.Object {
  var body: AnonRequired
  var issue_number: AnonRequired
  var number: AnonAlias
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonBodyIssuenumber {
  @scala.inline
  def apply(
    body: AnonRequired,
    issue_number: AnonRequired,
    number: AnonAlias,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonBodyIssuenumber = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyIssuenumber]
  }
}

