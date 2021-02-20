package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityResource extends StObject {
  
  // Name of the resource that is related to current alert. Required.
  var resource: js.UndefOr[NullableOption[String]] = js.native
  
  // Represents type of security resources related to an alert. Possible values are: attacked, related.
  var resourceType: js.UndefOr[NullableOption[SecurityResourceType]] = js.native
}
object SecurityResource {
  
  @scala.inline
  def apply(): SecurityResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityResource]
  }
  
  @scala.inline
  implicit class SecurityResourceMutableBuilder[Self <: SecurityResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: NullableOption[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNull: Self = StObject.set(x, "resource", null)
    
    @scala.inline
    def setResourceType(value: NullableOption[SecurityResourceType]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
