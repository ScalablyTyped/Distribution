package typings.pg.mod

import typings.pg.pgStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryArrayConfig[I /* <: js.Array[Any] */]
  extends StObject
     with QueryConfig[I] {
  
  var rowMode: array
}
object QueryArrayConfig {
  
  inline def apply[I /* <: js.Array[Any] */](text: String): QueryArrayConfig[I] = {
    val __obj = js.Dynamic.literal(rowMode = "array", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArrayConfig[I]]
  }
  
  extension [Self <: QueryArrayConfig[?], I /* <: js.Array[Any] */](x: Self & QueryArrayConfig[I]) {
    
    inline def setRowMode(value: array): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
  }
}
