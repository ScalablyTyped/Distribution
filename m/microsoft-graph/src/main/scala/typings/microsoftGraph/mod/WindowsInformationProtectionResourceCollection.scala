package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionResourceCollection extends StObject {
  
  // Display name
  var displayName: js.UndefOr[String] = js.undefined
  
  // Collection of resources
  var resources: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object WindowsInformationProtectionResourceCollection {
  
  @scala.inline
  def apply(): WindowsInformationProtectionResourceCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionResourceCollection]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionResourceCollectionMutableBuilder[Self <: WindowsInformationProtectionResourceCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setResources(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
