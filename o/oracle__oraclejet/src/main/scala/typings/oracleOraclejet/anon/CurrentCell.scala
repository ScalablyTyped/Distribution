package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentCell[K]
  extends /* key */ StringDictionary[js.Any] {
  
  var currentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K] = js.native
  
  var previousCurrentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K] = js.native
}
object CurrentCell {
  
  @scala.inline
  def apply[K](
    currentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K],
    previousCurrentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]
  ): CurrentCell[K] = {
    val __obj = js.Dynamic.literal(currentCell = currentCell.asInstanceOf[js.Any], previousCurrentCell = previousCurrentCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentCell[K]]
  }
  
  @scala.inline
  implicit class CurrentCellMutableBuilder[Self <: CurrentCell[_], K] (val x: Self with CurrentCell[K]) extends AnyVal {
    
    @scala.inline
    def setCurrentCell(value: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousCurrentCell(value: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]): Self = StObject.set(x, "previousCurrentCell", value.asInstanceOf[js.Any])
  }
}
