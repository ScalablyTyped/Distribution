package typings
package parentDashPackageDashJsonLib.parentDashPackageDashJsonMod.ParentPackageJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentPackage extends js.Object {
  var path: java.lang.String
  def parse(): org.scalablytyped.runtime.StringDictionary[js.Any]
  def read(): java.lang.String
}

object ParentPackage {
  @scala.inline
  def apply(
    parse: js.Function0[org.scalablytyped.runtime.StringDictionary[js.Any]],
    path: java.lang.String,
    read: js.Function0[java.lang.String]
  ): ParentPackage = {
    val __obj = js.Dynamic.literal(parse = parse, path = path, read = read)
  
    __obj.asInstanceOf[ParentPackage]
  }
}

