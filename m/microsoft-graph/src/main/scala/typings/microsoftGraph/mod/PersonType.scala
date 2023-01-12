package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonType extends StObject {
  
  // The type of data source, such as Person.
  var `class`: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The secondary type of data source, such as OrganizationUser.
  var subclass: js.UndefOr[NullableOption[String]] = js.undefined
}
object PersonType {
  
  inline def apply(): PersonType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersonType] (val x: Self) extends AnyVal {
    
    inline def setClass(value: NullableOption[String]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassNull: Self = StObject.set(x, "class", null)
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setSubclass(value: NullableOption[String]): Self = StObject.set(x, "subclass", value.asInstanceOf[js.Any])
    
    inline def setSubclassNull: Self = StObject.set(x, "subclass", null)
    
    inline def setSubclassUndefined: Self = StObject.set(x, "subclass", js.undefined)
  }
}
