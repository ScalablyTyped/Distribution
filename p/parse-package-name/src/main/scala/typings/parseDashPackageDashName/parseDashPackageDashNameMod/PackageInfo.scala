package typings.parseDashPackageDashName.parseDashPackageDashNameMod

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
    val __obj = js.Dynamic.literal(name = name, path = path, version = version)
  
    __obj.asInstanceOf[PackageInfo]
  }
}

