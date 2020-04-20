package typings.parsePackageName.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageInfo extends js.Object {
  var name: String
  var path: String
  var version: String
}

object PackageInfo {
  @scala.inline
  def apply(name: String, path: String, version: String): PackageInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInfo]
  }
}

