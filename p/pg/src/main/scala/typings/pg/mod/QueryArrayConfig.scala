package typings.pg.mod

import typings.pg.pgStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryArrayConfig[I /* <: js.Array[_] */] extends QueryConfig[I] {
  
  var rowMode: array = js.native
}
object QueryArrayConfig {
  
  @scala.inline
  def apply[I /* <: js.Array[_] */](rowMode: array, text: String): QueryArrayConfig[I] = {
    val __obj = js.Dynamic.literal(rowMode = rowMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArrayConfig[I]]
  }
  
  @scala.inline
  implicit class QueryArrayConfigMutableBuilder[Self <: QueryArrayConfig[_], I /* <: js.Array[_] */] (val x: Self with QueryArrayConfig[I]) extends AnyVal {
    
    @scala.inline
    def setRowMode(value: array): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
  }
}
