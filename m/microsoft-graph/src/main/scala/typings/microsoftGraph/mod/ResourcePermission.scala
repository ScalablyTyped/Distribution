package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePermission extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object ResourcePermission {
  
  @scala.inline
  def apply(): ResourcePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePermission]
  }
  
  @scala.inline
  implicit class ResourcePermissionMutableBuilder[Self <: ResourcePermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
