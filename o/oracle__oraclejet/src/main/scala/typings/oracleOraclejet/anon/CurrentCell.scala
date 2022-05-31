package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentCell[K]
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var currentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]
  
  var previousCurrentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]
}
object CurrentCell {
  
  inline def apply[K](
    currentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K],
    previousCurrentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]
  ): CurrentCell[K] = {
    val __obj = js.Dynamic.literal(currentCell = currentCell.asInstanceOf[js.Any], previousCurrentCell = previousCurrentCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentCell[K]]
  }
  
  extension [Self <: CurrentCell[?], K](x: Self & CurrentCell[K]) {
    
    inline def setCurrentCell(value: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
    
    inline def setPreviousCurrentCell(value: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]): Self = StObject.set(x, "previousCurrentCell", value.asInstanceOf[js.Any])
  }
}
