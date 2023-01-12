package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemVersion
  extends StObject
     with BaseItemVersion {
  
  // A collection of the fields and values for this version of the list item.
  var fields: js.UndefOr[NullableOption[FieldValueSet]] = js.undefined
}
object ListItemVersion {
  
  inline def apply(): ListItemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListItemVersion] (val x: Self) extends AnyVal {
    
    inline def setFields(value: NullableOption[FieldValueSet]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
