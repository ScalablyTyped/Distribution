package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellContext[K, D]
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]
}
object CellContext {
  
  inline def apply[K, D](cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]): CellContext[K, D] = {
    val __obj = js.Dynamic.literal(cellContext = cellContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellContext[K, D]]
  }
  
  extension [Self <: CellContext[?, ?], K, D](x: Self & (CellContext[K, D])) {
    
    inline def setCellContext(value: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]): Self = StObject.set(x, "cellContext", value.asInstanceOf[js.Any])
  }
}
