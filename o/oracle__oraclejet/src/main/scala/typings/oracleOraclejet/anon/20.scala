package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var columns: enabled | disabled
}
object `20` {
  
  inline def apply(columns: enabled | disabled): `20` = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  extension [Self <: `20`](x: Self) {
    
    inline def setColumns(value: enabled | disabled): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
  }
}
