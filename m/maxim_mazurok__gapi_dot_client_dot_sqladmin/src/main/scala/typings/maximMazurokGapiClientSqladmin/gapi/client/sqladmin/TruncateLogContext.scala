package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TruncateLogContext extends StObject {
  
  /** This is always `sql#truncateLogContext`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The type of log to truncate. Valid values are `MYSQL_GENERAL_TABLE` and `MYSQL_SLOW_TABLE`. */
  var logType: js.UndefOr[String] = js.undefined
}
object TruncateLogContext {
  
  inline def apply(): TruncateLogContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateLogContext]
  }
  
  extension [Self <: TruncateLogContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
  }
}
