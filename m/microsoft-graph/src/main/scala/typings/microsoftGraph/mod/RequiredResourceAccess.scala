package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredResourceAccess extends StObject {
  
  // The list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
  var resourceAccess: js.UndefOr[js.Array[ResourceAccess]] = js.native
  
  /**
    * The unique identifier for the resource that the application requires access to. This should be equal to the appId
    * declared on the target resource application.
    */
  var resourceAppId: js.UndefOr[String] = js.native
}
object RequiredResourceAccess {
  
  @scala.inline
  def apply(): RequiredResourceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredResourceAccess]
  }
  
  @scala.inline
  implicit class RequiredResourceAccessMutableBuilder[Self <: RequiredResourceAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceAccess(value: js.Array[ResourceAccess]): Self = StObject.set(x, "resourceAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAccessUndefined: Self = StObject.set(x, "resourceAccess", js.undefined)
    
    @scala.inline
    def setResourceAccessVarargs(value: ResourceAccess*): Self = StObject.set(x, "resourceAccess", js.Array(value :_*))
    
    @scala.inline
    def setResourceAppId(value: String): Self = StObject.set(x, "resourceAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAppIdUndefined: Self = StObject.set(x, "resourceAppId", js.undefined)
  }
}
