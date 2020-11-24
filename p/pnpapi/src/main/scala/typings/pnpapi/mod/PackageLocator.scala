package typings.pnpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pnpapi.mod.PhysicalPackageLocator
  - typings.pnpapi.mod.TopLevelPackageLocator
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
