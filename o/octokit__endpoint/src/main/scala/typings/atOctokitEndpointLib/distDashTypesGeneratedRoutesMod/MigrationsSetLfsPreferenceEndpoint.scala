package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsSetLfsPreferenceEndpoint extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var use_lfs: java.lang.String
}

object MigrationsSetLfsPreferenceEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, use_lfs: java.lang.String): MigrationsSetLfsPreferenceEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, use_lfs = use_lfs)
  
    __obj.asInstanceOf[MigrationsSetLfsPreferenceEndpoint]
  }
}

