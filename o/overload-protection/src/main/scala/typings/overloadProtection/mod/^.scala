package typings.overloadProtection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("overload-protection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(framework: HttpFrameworkSelection): HttpProtectionInstance = js.native
  def apply(framework: HttpFrameworkSelection, config: ProtectionConfig): HttpProtectionInstance = js.native
  def apply(framework: KoaFrameworkSelection): KoaProtectionInstance = js.native
  def apply(framework: KoaFrameworkSelection, config: ProtectionConfig): KoaProtectionInstance = js.native
}
