package typings.pnpapi.pnpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopLevelPackageLocator extends PackageLocator {
  var name: Null
  var reference: Null
}

object TopLevelPackageLocator {
  @scala.inline
  def apply(name: Null, reference: Null): TopLevelPackageLocator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopLevelPackageLocator]
  }
}

