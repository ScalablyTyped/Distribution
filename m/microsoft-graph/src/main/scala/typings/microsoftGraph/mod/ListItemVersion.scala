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
  
  @scala.inline
  def apply(): ListItemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemVersion]
  }
  
  @scala.inline
  implicit class ListItemVersionMutableBuilder[Self <: ListItemVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: NullableOption[FieldValueSet]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
