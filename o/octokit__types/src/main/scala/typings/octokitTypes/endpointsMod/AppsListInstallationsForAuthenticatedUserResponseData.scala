package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsListInstallationsForAuthenticatedUserResponseData extends StObject {
  
  var installations: js.Array[Account] = js.native
  
  var total_count: Double = js.native
}
object AppsListInstallationsForAuthenticatedUserResponseData {
  
  @scala.inline
  def apply(installations: js.Array[Account], total_count: Double): AppsListInstallationsForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponseData]
  }
  
  @scala.inline
  implicit class AppsListInstallationsForAuthenticatedUserResponseDataMutableBuilder[Self <: AppsListInstallationsForAuthenticatedUserResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallations(value: js.Array[Account]): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationsVarargs(value: Account*): Self = StObject.set(x, "installations", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
