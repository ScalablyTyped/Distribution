package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojtableMod.ojTable.ContextStatus
import typings.oracleOraclejet.oracleOraclejetStrings.edit
import typings.oracleOraclejet.oracleOraclejetStrings.navigation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datasource[K, D] extends StObject {
  
  var datasource: (DataProvider[K, D]) | Null
  
  var mode: edit | navigation
  
  var status: ContextStatus[K]
}
object Datasource {
  
  inline def apply[K, D](mode: edit | navigation, status: ContextStatus[K]): Datasource[K, D] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], datasource = null)
    __obj.asInstanceOf[Datasource[K, D]]
  }
  
  extension [Self <: Datasource[?, ?], K, D](x: Self & (Datasource[K, D])) {
    
    inline def setDatasource(value: DataProvider[K, D]): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
    
    inline def setDatasourceNull: Self = StObject.set(x, "datasource", null)
    
    inline def setMode(value: edit | navigation): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ContextStatus[K]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
