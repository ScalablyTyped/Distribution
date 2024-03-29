package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema extends StObject {
  
  var schema: Any
}
object Schema {
  
  inline def apply(schema: Any): Schema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
    
    inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
