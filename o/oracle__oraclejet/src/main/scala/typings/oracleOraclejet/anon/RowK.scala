package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowK[K] extends StObject {
  
  var column: js.UndefOr[K] = js.native
  
  var row: K = js.native
}
object RowK {
  
  @scala.inline
  def apply[K](row: K): RowK[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowK[K]]
  }
  
  @scala.inline
  implicit class RowKMutableBuilder[Self <: RowK[_], K] (val x: Self with RowK[K]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: K): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setRow(value: K): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
