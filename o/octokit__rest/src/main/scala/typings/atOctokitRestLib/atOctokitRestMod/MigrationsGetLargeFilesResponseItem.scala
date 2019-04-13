package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetLargeFilesResponseItem extends js.Object {
  var oid: java.lang.String
  var path: java.lang.String
  var ref_name: java.lang.String
  var size: scala.Double
}

object MigrationsGetLargeFilesResponseItem {
  @scala.inline
  def apply(oid: java.lang.String, path: java.lang.String, ref_name: java.lang.String, size: scala.Double): MigrationsGetLargeFilesResponseItem = {
    val __obj = js.Dynamic.literal(oid = oid, path = path, ref_name = ref_name, size = size)
  
    __obj.asInstanceOf[MigrationsGetLargeFilesResponseItem]
  }
}

