package typings.pnpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicalPackageLocator extends PackageLocator {
  var name: String
  var reference: String
}

object PhysicalPackageLocator {
  @scala.inline
  def apply(name: String, reference: String): PhysicalPackageLocator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhysicalPackageLocator]
  }
}

