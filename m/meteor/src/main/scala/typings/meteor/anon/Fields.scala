package typings.meteor.anon

import typings.meteor.Mongo.FieldSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields extends StObject {
  
  var fields: js.UndefOr[FieldSpecifier] = js.undefined
}
object Fields {
  
  inline def apply(): Fields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
    
    inline def setFields(value: FieldSpecifier): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
