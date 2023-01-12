package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTypeInfo extends StObject {
  
  // The id of the content type.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the content type.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
}
object ContentTypeInfo {
  
  inline def apply(): ContentTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentTypeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentTypeInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
