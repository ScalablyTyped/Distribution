package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinLogCoordinates extends StObject {
  
  /** Name of the binary log file for a Cloud SQL instance. */
  var binLogFileName: js.UndefOr[String] = js.undefined
  
  /** Position (offset) within the binary log file. */
  var binLogPosition: js.UndefOr[String] = js.undefined
  
  /** This is always *sql#binLogCoordinates*. */
  var kind: js.UndefOr[String] = js.undefined
}
object BinLogCoordinates {
  
  inline def apply(): BinLogCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinLogCoordinates]
  }
  
  extension [Self <: BinLogCoordinates](x: Self) {
    
    inline def setBinLogFileName(value: String): Self = StObject.set(x, "binLogFileName", value.asInstanceOf[js.Any])
    
    inline def setBinLogFileNameUndefined: Self = StObject.set(x, "binLogFileName", js.undefined)
    
    inline def setBinLogPosition(value: String): Self = StObject.set(x, "binLogPosition", value.asInstanceOf[js.Any])
    
    inline def setBinLogPositionUndefined: Self = StObject.set(x, "binLogPosition", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
