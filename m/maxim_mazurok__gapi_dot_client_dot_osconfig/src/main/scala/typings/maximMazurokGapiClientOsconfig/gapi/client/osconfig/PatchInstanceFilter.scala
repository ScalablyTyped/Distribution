package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchInstanceFilter extends StObject {
  
  /** Target all VM instances in the project. If true, no other criteria is permitted. */
  var all: js.UndefOr[Boolean] = js.undefined
  
  /** Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances. */
  var groupLabels: js.UndefOr[js.Array[PatchInstanceFilterGroupLabel]] = js.undefined
  
  /** Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group VMs when targeting configs, for example prefix="prod-". */
  var instanceNamePrefixes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Targets any of the VM instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`,
    * `projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`, or `https://www.googleapis.com/compute/v1/projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`
    */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone. */
  var zones: js.UndefOr[js.Array[String]] = js.undefined
}
object PatchInstanceFilter {
  
  inline def apply(): PatchInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchInstanceFilter]
  }
  
  extension [Self <: PatchInstanceFilter](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setGroupLabels(value: js.Array[PatchInstanceFilterGroupLabel]): Self = StObject.set(x, "groupLabels", value.asInstanceOf[js.Any])
    
    inline def setGroupLabelsUndefined: Self = StObject.set(x, "groupLabels", js.undefined)
    
    inline def setGroupLabelsVarargs(value: PatchInstanceFilterGroupLabel*): Self = StObject.set(x, "groupLabels", js.Array(value*))
    
    inline def setInstanceNamePrefixes(value: js.Array[String]): Self = StObject.set(x, "instanceNamePrefixes", value.asInstanceOf[js.Any])
    
    inline def setInstanceNamePrefixesUndefined: Self = StObject.set(x, "instanceNamePrefixes", js.undefined)
    
    inline def setInstanceNamePrefixesVarargs(value: String*): Self = StObject.set(x, "instanceNamePrefixes", js.Array(value*))
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value*))
  }
}
