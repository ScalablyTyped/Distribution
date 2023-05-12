package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinglePropertySchema extends StObject {
  
  // The name of the property.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of the property.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object SinglePropertySchema {
  
  inline def apply(): SinglePropertySchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SinglePropertySchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SinglePropertySchema] (val x: Self) extends AnyVal {
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
