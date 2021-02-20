package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rows[K, D] extends StObject {
  
  var rows: DataTypesDrag[K, D] = js.native
}
object Rows {
  
  @scala.inline
  def apply[K, D](rows: DataTypesDrag[K, D]): Rows[K, D] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows[K, D]]
  }
  
  @scala.inline
  implicit class RowsMutableBuilder[Self <: Rows[_, _], K, D] (val x: Self with (Rows[K, D])) extends AnyVal {
    
    @scala.inline
    def setRows(value: DataTypesDrag[K, D]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
