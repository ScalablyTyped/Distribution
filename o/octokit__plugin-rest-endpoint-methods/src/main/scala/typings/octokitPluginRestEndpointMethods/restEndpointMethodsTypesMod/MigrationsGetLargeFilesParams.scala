package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsGetLargeFilesParams]
  }
}

