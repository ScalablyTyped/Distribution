package typings.pnpapi.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageInformation extends js.Object {
  var packageDependencies: Map[String, String | (js.Tuple2[String, String])] = js.native
  var packageLocation: String = js.native
}

object PackageInformation {
  @scala.inline
  def apply(packageDependencies: Map[String, String | (js.Tuple2[String, String])], packageLocation: String): PackageInformation = {
    val __obj = js.Dynamic.literal(packageDependencies = packageDependencies.asInstanceOf[js.Any], packageLocation = packageLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInformation]
  }
  @scala.inline
  implicit class PackageInformationOps[Self <: PackageInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPackageDependencies(value: Map[String, String | (js.Tuple2[String, String])]): Self = this.set("packageDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageLocation(value: String): Self = this.set("packageLocation", value.asInstanceOf[js.Any])
  }
  
}

