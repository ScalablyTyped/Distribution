package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListLanguagesParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposListLanguagesParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposListLanguagesParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposListLanguagesParams]
  }
}

