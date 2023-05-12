package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistryKeyEvidence
  extends StObject
     with AlertEvidence {
  
  // Registry hive of the key that the recorded action was applied to.
  var registryHive: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Registry key that the recorded action was applied to.
  var registryKey: js.UndefOr[NullableOption[String]] = js.undefined
}
object RegistryKeyEvidence {
  
  inline def apply(): RegistryKeyEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryKeyEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegistryKeyEvidence] (val x: Self) extends AnyVal {
    
    inline def setRegistryHive(value: NullableOption[String]): Self = StObject.set(x, "registryHive", value.asInstanceOf[js.Any])
    
    inline def setRegistryHiveNull: Self = StObject.set(x, "registryHive", null)
    
    inline def setRegistryHiveUndefined: Self = StObject.set(x, "registryHive", js.undefined)
    
    inline def setRegistryKey(value: NullableOption[String]): Self = StObject.set(x, "registryKey", value.asInstanceOf[js.Any])
    
    inline def setRegistryKeyNull: Self = StObject.set(x, "registryKey", null)
    
    inline def setRegistryKeyUndefined: Self = StObject.set(x, "registryKey", js.undefined)
  }
}
