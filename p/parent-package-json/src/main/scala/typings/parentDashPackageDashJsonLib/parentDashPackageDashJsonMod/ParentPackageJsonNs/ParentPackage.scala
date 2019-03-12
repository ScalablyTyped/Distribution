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
    parse: () => org.scalablytyped.runtime.StringDictionary[js.Any],
    path: java.lang.String,
    read: () => java.lang.String
  ): ParentPackage = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse), path = path, read = js.Any.fromFunction0(read))
  
    __obj.asInstanceOf[ParentPackage]
  }
}

