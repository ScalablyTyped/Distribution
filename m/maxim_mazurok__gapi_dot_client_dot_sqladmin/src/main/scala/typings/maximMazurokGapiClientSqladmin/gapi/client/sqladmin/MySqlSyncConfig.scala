package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MySqlSyncConfig extends StObject {
  
  /** Flags to use for the initial dump. */
  var initialSyncFlags: js.UndefOr[js.Array[SyncFlags]] = js.undefined
}
object MySqlSyncConfig {
  
  inline def apply(): MySqlSyncConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MySqlSyncConfig]
  }
  
  extension [Self <: MySqlSyncConfig](x: Self) {
    
    inline def setInitialSyncFlags(value: js.Array[SyncFlags]): Self = StObject.set(x, "initialSyncFlags", value.asInstanceOf[js.Any])
    
    inline def setInitialSyncFlagsUndefined: Self = StObject.set(x, "initialSyncFlags", js.undefined)
    
    inline def setInitialSyncFlagsVarargs(value: SyncFlags*): Self = StObject.set(x, "initialSyncFlags", js.Array(value*))
  }
}
