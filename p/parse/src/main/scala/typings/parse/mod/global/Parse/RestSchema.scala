package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StringDictionary
import typings.parse.anon.DefaultValue
import typings.parse.mod.global.Parse.Schema.CLP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The raw schema response returned from the `GET /parse/schemas` endpoint.
  * This is defined here: https://docs.parseplatform.org/js/guide/#schema.
  * Unfortunately, `Schema.all()` and `Schema.prototype.get()` return this rather
  * than a `Schema`. It is also the only object which provides introspection on
  * the schema - such as `className` and `fields`.
  */
trait RestSchema extends StObject {
  
  var classLevelPermissions: CLP
  
  var className: String
  
  var fields: StringDictionary[DefaultValue]
  
  var indexes: js.UndefOr[StringDictionary[StringDictionary[Any]]] = js.undefined
}
object RestSchema {
  
  inline def apply(classLevelPermissions: CLP, className: String, fields: StringDictionary[DefaultValue]): RestSchema = {
    val __obj = js.Dynamic.literal(classLevelPermissions = classLevelPermissions.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestSchema] (val x: Self) extends AnyVal {
    
    inline def setClassLevelPermissions(value: CLP): Self = StObject.set(x, "classLevelPermissions", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setFields(value: StringDictionary[DefaultValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setIndexes(value: StringDictionary[StringDictionary[Any]]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
  }
}
