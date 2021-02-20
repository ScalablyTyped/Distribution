package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnK[K] extends StObject {
  
  var column: K = js.native
  
  var row: K = js.native
}
object ColumnK {
  
  @scala.inline
  def apply[K](column: K, row: K): ColumnK[K] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnK[K]]
  }
  
  @scala.inline
  implicit class ColumnKMutableBuilder[Self <: ColumnK[_], K] (val x: Self with ColumnK[K]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: K): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: K): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
