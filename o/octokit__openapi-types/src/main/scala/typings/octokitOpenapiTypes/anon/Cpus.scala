package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cpus extends StObject {
  
  /**
    * @description How many cores are available to the codespace.
    * @example 4
    */
  var cpus: Double
  
  /**
    * @description The display name of the machine includes cores, memory, and storage.
    * @example 4 cores, 8 GB RAM, 64 GB storage
    */
  var display_name: String
  
  /**
    * @description How much memory is available to the codespace.
    * @example 8589934592
    */
  var memory_in_bytes: Double
  
  /**
    * @description The name of the machine.
    * @example standardLinux
    */
  var name: String
  
  /**
    * @description The operating system of the machine.
    * @example linux
    */
  var operating_system: String
  
  /**
    * @description Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was not specified as a ref, the default branch will be assumed. Value will be "null" if prebuilds are not supported or prebuild availability could not be determined. Value will be "none" if no prebuild is available. Latest values "ready" and "in_progress" indicate the prebuild availability status.
    * @example ready
    * @enum {string|null}
    */
  var prebuild_availability: none_ | ready | in_progress | Null
  
  /**
    * @description How much storage is available to the codespace.
    * @example 68719476736
    */
  var storage_in_bytes: Double
}
object Cpus {
  
  inline def apply(
    cpus: Double,
    display_name: String,
    memory_in_bytes: Double,
    name: String,
    operating_system: String,
    storage_in_bytes: Double
  ): Cpus = {
    val __obj = js.Dynamic.literal(cpus = cpus.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], memory_in_bytes = memory_in_bytes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operating_system = operating_system.asInstanceOf[js.Any], storage_in_bytes = storage_in_bytes.asInstanceOf[js.Any], prebuild_availability = null)
    __obj.asInstanceOf[Cpus]
  }
  
  extension [Self <: Cpus](x: Self) {
    
    inline def setCpus(value: Double): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setMemory_in_bytes(value: Double): Self = StObject.set(x, "memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperating_system(value: String): Self = StObject.set(x, "operating_system", value.asInstanceOf[js.Any])
    
    inline def setPrebuild_availability(value: none_ | ready | in_progress): Self = StObject.set(x, "prebuild_availability", value.asInstanceOf[js.Any])
    
    inline def setPrebuild_availabilityNull: Self = StObject.set(x, "prebuild_availability", null)
    
    inline def setStorage_in_bytes(value: Double): Self = StObject.set(x, "storage_in_bytes", value.asInstanceOf[js.Any])
  }
}
