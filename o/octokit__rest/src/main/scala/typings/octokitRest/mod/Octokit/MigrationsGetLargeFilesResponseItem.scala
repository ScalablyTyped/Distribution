package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetLargeFilesResponseItem extends js.Object {
  var oid: String
  var path: String
  var ref_name: String
  var size: Double
}

object MigrationsGetLargeFilesResponseItem {
  @scala.inline
  def apply(oid: String, path: String, ref_name: String, size: Double): MigrationsGetLargeFilesResponseItem = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ref_name = ref_name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsGetLargeFilesResponseItem]
  }
}

