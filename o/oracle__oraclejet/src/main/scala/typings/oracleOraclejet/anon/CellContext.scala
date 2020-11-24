package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellContext[K, D]
  extends /* key */ StringDictionary[js.Any] {
  
  var cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D] = js.native
}
object CellContext {
  
  @scala.inline
  def apply[K, D](cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]): CellContext[K, D] = {
    val __obj = js.Dynamic.literal(cellContext = cellContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellContext[K, D]]
  }
  
  @scala.inline
  implicit class CellContextOps[Self <: CellContext[_, _], K, D] (val x: Self with (CellContext[K, D])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellContext(value: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]): Self = this.set("cellContext", value.asInstanceOf[js.Any])
  }
}
