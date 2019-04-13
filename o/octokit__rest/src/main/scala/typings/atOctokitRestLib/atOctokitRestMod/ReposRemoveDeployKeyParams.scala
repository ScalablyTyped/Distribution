package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveDeployKeyParams extends js.Object {
  var key_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposRemoveDeployKeyParams {
  @scala.inline
  def apply(key_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposRemoveDeployKeyParams = {
    val __obj = js.Dynamic.literal(key_id = key_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposRemoveDeployKeyParams]
  }
}

