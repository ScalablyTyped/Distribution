package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsListAppInstallationsResponseData extends StObject {
  
  var installations: js.Array[Permissions] = js.native
  
  var total_count: Double = js.native
}
object OrgsListAppInstallationsResponseData {
  
  @scala.inline
  def apply(installations: js.Array[Permissions], total_count: Double): OrgsListAppInstallationsResponseData = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListAppInstallationsResponseData]
  }
  
  @scala.inline
  implicit class OrgsListAppInstallationsResponseDataMutableBuilder[Self <: OrgsListAppInstallationsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallations(value: js.Array[Permissions]): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationsVarargs(value: Permissions*): Self = StObject.set(x, "installations", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
