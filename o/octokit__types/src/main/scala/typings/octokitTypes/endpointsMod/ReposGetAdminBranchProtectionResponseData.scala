package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetAdminBranchProtectionResponseData extends StObject {
  
  var enabled: Boolean
  
  var url: String
}
object ReposGetAdminBranchProtectionResponseData {
  
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposGetAdminBranchProtectionResponseData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAdminBranchProtectionResponseData]
  }
  
  @scala.inline
  implicit class ReposGetAdminBranchProtectionResponseDataMutableBuilder[Self <: ReposGetAdminBranchProtectionResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
