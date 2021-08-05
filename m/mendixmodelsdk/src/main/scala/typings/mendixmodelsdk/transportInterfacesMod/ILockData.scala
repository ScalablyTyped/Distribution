package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILockData extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var lockId: js.UndefOr[String] = js.undefined
  
  var lockType: LockType
  
  var requestedBy: String
  
  var timestamp: Double
}
object ILockData {
  
  inline def apply(lockType: LockType, requestedBy: String, timestamp: Double): ILockData = {
    val __obj = js.Dynamic.literal(lockType = lockType.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockData]
  }
  
  extension [Self <: ILockData](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setLockId(value: String): Self = StObject.set(x, "lockId", value.asInstanceOf[js.Any])
    
    inline def setLockIdUndefined: Self = StObject.set(x, "lockId", js.undefined)
    
    inline def setLockType(value: LockType): Self = StObject.set(x, "lockType", value.asInstanceOf[js.Any])
    
    inline def setRequestedBy(value: String): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
