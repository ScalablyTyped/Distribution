package typings.pnpapi.pnpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pnpapi.pnpapiMod.PhysicalPackageLocator
  - typings.pnpapi.pnpapiMod.TopLevelPackageLocator
*/
trait PackageLocator extends js.Object

object PackageLocator {
  @scala.inline
  def PhysicalPackageLocator(name: String, reference: String): PackageLocator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackageLocator]
  }
  @scala.inline
  def TopLevelPackageLocator(name: Null, reference: Null): PackageLocator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackageLocator]
  }
}

