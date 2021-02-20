package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicensesGetEndpoint extends StObject {
  
  var license: String = js.native
}
object LicensesGetEndpoint {
  
  @scala.inline
  def apply(license: String): LicensesGetEndpoint = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensesGetEndpoint]
  }
  
  @scala.inline
  implicit class LicensesGetEndpointMutableBuilder[Self <: LicensesGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
  }
}
