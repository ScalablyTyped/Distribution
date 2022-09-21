package typings.pgTemplateTag

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-template-tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parts: TemplateStringsArray, values: Any*): SqlLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(parts.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SqlLiteral_]
  
  inline def join(array: js.Array[Any]): SqlLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(array.asInstanceOf[js.Any]).asInstanceOf[SqlLiteral_]
  inline def join(array: js.Array[Any], separator: String): SqlLiteral_ = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(array.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[SqlLiteral_]
  
  inline def sqlLiteral(value: String): SqlLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("sqlLiteral")(value.asInstanceOf[js.Any]).asInstanceOf[SqlLiteral_]
  
  trait SqlLiteral_ extends StObject {
    
    var text: String
    
    var values: js.Array[Any]
  }
  object SqlLiteral_ {
    
    inline def apply(text: String, values: js.Array[Any]): SqlLiteral_ = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[SqlLiteral_]
    }
    
    extension [Self <: SqlLiteral_](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
