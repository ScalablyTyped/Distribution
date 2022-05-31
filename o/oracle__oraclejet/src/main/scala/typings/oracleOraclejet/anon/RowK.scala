package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowK[K] extends StObject {
  
  var column: js.UndefOr[K] = js.undefined
  
  var row: K
}
object RowK {
  
  inline def apply[K](row: K): RowK[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowK[K]]
  }
  
  extension [Self <: RowK[?], K](x: Self & RowK[K]) {
    
    inline def setColumn(value: K): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setRow(value: K): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
