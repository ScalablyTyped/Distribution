package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitlockerRecoveryKey
  extends StObject
     with Entity {
  
  // The date and time when the key was originally backed up to Azure Active Directory. Not nullable.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Identifier of the device the BitLocker key is originally backed up from. Supports $filter (eq).
  var deviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The BitLocker recovery key. Returned only on $select. Not nullable.
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the type of volume the BitLocker key is associated with. The possible values are: 1 (for
    * operatingSystemVolume), 2 (for fixedDataVolume), 3 (for removableDataVolume), and 4 (for unknownFutureValue).
    */
  var volumeType: js.UndefOr[NullableOption[VolumeType]] = js.undefined
}
object BitlockerRecoveryKey {
  
  inline def apply(): BitlockerRecoveryKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitlockerRecoveryKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitlockerRecoveryKey] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setVolumeType(value: NullableOption[VolumeType]): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeNull: Self = StObject.set(x, "volumeType", null)
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
