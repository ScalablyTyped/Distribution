package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnparseObject[T] extends StObject {
  
  var data: js.Array[T]
  
  var fields: js.Array[String]
}
object UnparseObject {
  
  inline def apply[T](data: js.Array[T], fields: js.Array[String]): UnparseObject[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnparseObject[T]]
  }
  
  extension [Self <: UnparseObject[?], T](x: Self & UnparseObject[T]) {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
