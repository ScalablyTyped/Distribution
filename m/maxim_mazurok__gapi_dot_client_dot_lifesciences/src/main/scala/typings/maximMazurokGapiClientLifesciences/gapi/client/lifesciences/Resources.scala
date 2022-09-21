package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resources extends StObject {
  
  /** The list of regions allowed for VM allocation. If set, the `zones` field must not be set. */
  var regions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The virtual machine specification. */
  var virtualMachine: js.UndefOr[VirtualMachine] = js.undefined
  
  /** The list of zones allowed for VM allocation. If set, the `regions` field must not be set. */
  var zones: js.UndefOr[js.Array[String]] = js.undefined
}
object Resources {
  
  inline def apply(): Resources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resources]
  }
  
  extension [Self <: Resources](x: Self) {
    
    inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setVirtualMachine(value: VirtualMachine): Self = StObject.set(x, "virtualMachine", value.asInstanceOf[js.Any])
    
    inline def setVirtualMachineUndefined: Self = StObject.set(x, "virtualMachine", js.undefined)
    
    inline def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value*))
  }
}
