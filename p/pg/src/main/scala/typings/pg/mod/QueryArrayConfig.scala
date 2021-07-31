package typings.pg.mod

import typings.pg.pgStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryArrayConfig[I /* <: js.Array[js.Any] */]
  extends StObject
     with QueryConfig[I] {
  
  var rowMode: array
}
object QueryArrayConfig {
  
  @scala.inline
  def apply[I /* <: js.Array[js.Any] */](text: String): QueryArrayConfig[I] = {
    val __obj = js.Dynamic.literal(rowMode = "array", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArrayConfig[I]]
  }
  
  @scala.inline
  implicit class QueryArrayConfigMutableBuilder[Self <: QueryArrayConfig[?], I /* <: js.Array[js.Any] */] (val x: Self & QueryArrayConfig[I]) extends AnyVal {
    
    @scala.inline
    def setRowMode(value: array): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
  }
}
