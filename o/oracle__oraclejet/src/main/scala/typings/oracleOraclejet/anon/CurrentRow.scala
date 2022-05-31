package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentRow[K]
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var currentRow: typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
  
  var previousCurrentRow: typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
}
object CurrentRow {
  
  inline def apply[K](
    currentRow: typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K],
    previousCurrentRow: typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
  ): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], previousCurrentRow = previousCurrentRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
  
  extension [Self <: CurrentRow[?], K](x: Self & CurrentRow[K]) {
    
    inline def setCurrentRow(value: typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]): Self = StObject.set(x, "currentRow", value.asInstanceOf[js.Any])
    
    inline def setPreviousCurrentRow(value: typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]): Self = StObject.set(x, "previousCurrentRow", value.asInstanceOf[js.Any])
  }
}
