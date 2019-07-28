package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(oid = oid, path = path, ref_name = ref_name, size = size)
  
    __obj.asInstanceOf[MigrationsGetLargeFilesResponseItem]
  }
}

