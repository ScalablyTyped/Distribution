package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetParams extends js.Object {
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsGetParams {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String): PullsGetParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsGetParams]
  }
}

