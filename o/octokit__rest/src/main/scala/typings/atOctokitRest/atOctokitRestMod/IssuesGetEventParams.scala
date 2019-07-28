package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetEventParams extends js.Object {
  var event_id: Double
  var owner: String
  var repo: String
}

object IssuesGetEventParams {
  @scala.inline
  def apply(event_id: Double, owner: String, repo: String): IssuesGetEventParams = {
    val __obj = js.Dynamic.literal(event_id = event_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesGetEventParams]
  }
}

