package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistryValueEvidence
  extends StObject
     with AlertEvidence {
  
  var mdeDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Registry hive of the key that the recorded action was applied to.
  var registryHive: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Registry key that the recorded action was applied to.
  var registryKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Data of the registry value that the recorded action was applied to.
  var registryValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the registry value that the recorded action was applied to.
  var registryValueName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Data type, such as binary or string, of the registry value that the recorded action was applied to.
  var registryValueType: js.UndefOr[NullableOption[String]] = js.undefined
}
object RegistryValueEvidence {
  
  inline def apply(): RegistryValueEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryValueEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegistryValueEvidence] (val x: Self) extends AnyVal {
    
    inline def setMdeDeviceId(value: NullableOption[String]): Self = StObject.set(x, "mdeDeviceId", value.asInstanceOf[js.Any])
    
    inline def setMdeDeviceIdNull: Self = StObject.set(x, "mdeDeviceId", null)
    
    inline def setMdeDeviceIdUndefined: Self = StObject.set(x, "mdeDeviceId", js.undefined)
    
    inline def setRegistryHive(value: NullableOption[String]): Self = StObject.set(x, "registryHive", value.asInstanceOf[js.Any])
    
    inline def setRegistryHiveNull: Self = StObject.set(x, "registryHive", null)
    
    inline def setRegistryHiveUndefined: Self = StObject.set(x, "registryHive", js.undefined)
    
    inline def setRegistryKey(value: NullableOption[String]): Self = StObject.set(x, "registryKey", value.asInstanceOf[js.Any])
    
    inline def setRegistryKeyNull: Self = StObject.set(x, "registryKey", null)
    
    inline def setRegistryKeyUndefined: Self = StObject.set(x, "registryKey", js.undefined)
    
    inline def setRegistryValue(value: NullableOption[String]): Self = StObject.set(x, "registryValue", value.asInstanceOf[js.Any])
    
    inline def setRegistryValueName(value: NullableOption[String]): Self = StObject.set(x, "registryValueName", value.asInstanceOf[js.Any])
    
    inline def setRegistryValueNameNull: Self = StObject.set(x, "registryValueName", null)
    
    inline def setRegistryValueNameUndefined: Self = StObject.set(x, "registryValueName", js.undefined)
    
    inline def setRegistryValueNull: Self = StObject.set(x, "registryValue", null)
    
    inline def setRegistryValueType(value: NullableOption[String]): Self = StObject.set(x, "registryValueType", value.asInstanceOf[js.Any])
    
    inline def setRegistryValueTypeNull: Self = StObject.set(x, "registryValueType", null)
    
    inline def setRegistryValueTypeUndefined: Self = StObject.set(x, "registryValueType", js.undefined)
    
    inline def setRegistryValueUndefined: Self = StObject.set(x, "registryValue", js.undefined)
  }
}
