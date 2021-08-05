package typings.maximMazurokGapiClientSqladmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterData extends StObject {
  
  /**
    * Option to include SQL statement required to set up replication. If set to *1*, the dump file includes a CHANGE MASTER TO statement with the binary log coordinates, and
    * --set-gtid-purged is set to ON. If set to *2*, the CHANGE MASTER TO statement is written as a SQL comment and has no effect. If set to any value other than *1*,
    * --set-gtid-purged is set to OFF.
    */
  var masterData: js.UndefOr[Double] = js.undefined
}
object MasterData {
  
  inline def apply(): MasterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterData]
  }
  
  extension [Self <: MasterData](x: Self) {
    
    inline def setMasterData(value: Double): Self = StObject.set(x, "masterData", value.asInstanceOf[js.Any])
    
    inline def setMasterDataUndefined: Self = StObject.set(x, "masterData", js.undefined)
  }
}
