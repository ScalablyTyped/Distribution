package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var column: single | multiple
  
  var row: single | multiple
}
object `21` {
  
  inline def apply(column: single | multiple, row: single | multiple): `21` = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setColumn(value: single | multiple): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setRow(value: single | multiple): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
