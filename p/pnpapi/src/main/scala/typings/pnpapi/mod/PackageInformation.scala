package typings.pnpapi.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageInformation extends js.Object {
  var packageDependencies: Map[String, String | (js.Tuple2[String, String])]
  var packageLocation: String
}

object PackageInformation {
  @scala.inline
  def apply(packageDependencies: Map[String, String | (js.Tuple2[String, String])], packageLocation: String): PackageInformation = {
    val __obj = js.Dynamic.literal(packageDependencies = packageDependencies.asInstanceOf[js.Any], packageLocation = packageLocation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackageInformation]
  }
}

