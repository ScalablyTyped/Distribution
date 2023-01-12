package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyBase
  extends StObject
     with DirectoryObject {
  
  // Description for this policy. Required.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name for this policy. Required.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object PolicyBase {
  
  inline def apply(): PolicyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyBase] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
