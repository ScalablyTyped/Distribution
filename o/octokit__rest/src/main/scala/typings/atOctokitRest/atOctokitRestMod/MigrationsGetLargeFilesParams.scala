package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetLargeFilesParams extends js.Object {
  var owner: String
  var repo: String
}

object MigrationsGetLargeFilesParams {
  @scala.inline
  def apply(owner: String, repo: String): MigrationsGetLargeFilesParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[MigrationsGetLargeFilesParams]
  }
}

