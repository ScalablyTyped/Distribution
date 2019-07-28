package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsSetLfsPreferenceEndpoint extends js.Object {
  var owner: String
  var repo: String
  var use_lfs: String
}

object MigrationsSetLfsPreferenceEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, use_lfs: String): MigrationsSetLfsPreferenceEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, use_lfs = use_lfs)
  
    __obj.asInstanceOf[MigrationsSetLfsPreferenceEndpoint]
  }
}

