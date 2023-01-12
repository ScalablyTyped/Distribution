package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnK[K] extends StObject {
  
  var column: K
  
  var row: K
}
object ColumnK {
  
  inline def apply[K](column: K, row: K): ColumnK[K] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnK[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnK[?], K] (val x: Self & ColumnK[K]) extends AnyVal {
    
    inline def setColumn(value: K): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setRow(value: K): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
