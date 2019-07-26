package typings
package parseDashPackageDashNameLib.parseDashPackageDashNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageInfo extends js.Object {
  var name: java.lang.String
  var path: java.lang.String
  var version: java.lang.String
}

object PackageInfo {
  @scala.inline
  def apply(name: java.lang.String, path: java.lang.String, version: java.lang.String): PackageInfo = {
    val __obj = js.Dynamic.literal(name = name, path = path, version = version)
  
    __obj.asInstanceOf[PackageInfo]
  }
}

