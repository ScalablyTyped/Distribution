package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceConfig extends StObject {
  
  /** Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used. */
  var persistenceMode: js.UndefOr[String] = js.undefined
  
  /** Output only. The next time that a snapshot attempt is scheduled to occur. */
  var rdbNextSnapshotTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Period between RDB snapshots. Snapshots will be attempted every period starting from the provided snapshot start time. For example, a start time of 01/01/2033 06:45 and
    * SIX_HOURS snapshot period will do nothing until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45, 18:45, and 00:45 the next day, and so on. If not provided,
    * TWENTY_FOUR_HOURS will be used as default.
    */
  var rdbSnapshotPeriod: js.UndefOr[String] = js.undefined
  
  /** Optional. Date and time that the first snapshot was/will be attempted, and to which future snapshots will be aligned. If not provided, the current time will be used. */
  var rdbSnapshotStartTime: js.UndefOr[String] = js.undefined
}
object PersistenceConfig {
  
  inline def apply(): PersistenceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceConfig]
  }
  
  extension [Self <: PersistenceConfig](x: Self) {
    
    inline def setPersistenceMode(value: String): Self = StObject.set(x, "persistenceMode", value.asInstanceOf[js.Any])
    
    inline def setPersistenceModeUndefined: Self = StObject.set(x, "persistenceMode", js.undefined)
    
    inline def setRdbNextSnapshotTime(value: String): Self = StObject.set(x, "rdbNextSnapshotTime", value.asInstanceOf[js.Any])
    
    inline def setRdbNextSnapshotTimeUndefined: Self = StObject.set(x, "rdbNextSnapshotTime", js.undefined)
    
    inline def setRdbSnapshotPeriod(value: String): Self = StObject.set(x, "rdbSnapshotPeriod", value.asInstanceOf[js.Any])
    
    inline def setRdbSnapshotPeriodUndefined: Self = StObject.set(x, "rdbSnapshotPeriod", js.undefined)
    
    inline def setRdbSnapshotStartTime(value: String): Self = StObject.set(x, "rdbSnapshotStartTime", value.asInstanceOf[js.Any])
    
    inline def setRdbSnapshotStartTimeUndefined: Self = StObject.set(x, "rdbSnapshotStartTime", js.undefined)
  }
}
