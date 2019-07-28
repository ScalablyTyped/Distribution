package typings.parentDashPackageDashJson.parentDashPackageDashJsonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentPackage extends js.Object {
  var path: String
  def parse(): StringDictionary[js.Any]
  def read(): String
}

object ParentPackage {
  @scala.inline
  def apply(parse: () => StringDictionary[js.Any], path: String, read: () => String): ParentPackage = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse), path = path, read = js.Any.fromFunction0(read))
  
    __obj.asInstanceOf[ParentPackage]
  }
}

