package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojtableMod.ojTable.ContextStatus
import typings.oracleOraclejet.oracleOraclejetStrings.edit
import typings.oracleOraclejet.oracleOraclejetStrings.navigation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datasource[K, D] extends StObject {
  
  var datasource: (DataProvider[K, D]) | Null = js.native
  
  var mode: edit | navigation = js.native
  
  var status: ContextStatus[K] = js.native
}
object Datasource {
  
  @scala.inline
  def apply[K, D](mode: edit | navigation, status: ContextStatus[K]): Datasource[K, D] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datasource[K, D]]
  }
  
  @scala.inline
  implicit class DatasourceMutableBuilder[Self <: Datasource[_, _], K, D] (val x: Self with (Datasource[K, D])) extends AnyVal {
    
    @scala.inline
    def setDatasource(value: DataProvider[K, D]): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasourceNull: Self = StObject.set(x, "datasource", null)
    
    @scala.inline
    def setMode(value: edit | navigation): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ContextStatus[K]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
