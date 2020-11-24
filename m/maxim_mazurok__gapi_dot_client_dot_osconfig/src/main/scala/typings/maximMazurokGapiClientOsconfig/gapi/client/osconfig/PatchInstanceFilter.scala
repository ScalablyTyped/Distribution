package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchInstanceFilter extends js.Object {
  
  /** Target all VM instances in the project. If true, no other criteria is permitted. */
  var all: js.UndefOr[Boolean] = js.native
  
  /** Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances. */
  var groupLabels: js.UndefOr[js.Array[PatchInstanceFilterGroupLabel]] = js.native
  
  /** Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group VMs when targeting configs, for example prefix="prod-". */
  var instanceNamePrefixes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Targets any of the VM instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`,
    * `projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`, or `https://www.googleapis.com/compute/v1/projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
  
  /** Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone. */
  var zones: js.UndefOr[js.Array[String]] = js.native
}
object PatchInstanceFilter {
  
  @scala.inline
  def apply(): PatchInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchInstanceFilter]
  }
  
  @scala.inline
  implicit class PatchInstanceFilterOps[Self <: PatchInstanceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setGroupLabelsVarargs(value: PatchInstanceFilterGroupLabel*): Self = this.set("groupLabels", js.Array(value :_*))
    
    @scala.inline
    def setGroupLabels(value: js.Array[PatchInstanceFilterGroupLabel]): Self = this.set("groupLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupLabels: Self = this.set("groupLabels", js.undefined)
    
    @scala.inline
    def setInstanceNamePrefixesVarargs(value: String*): Self = this.set("instanceNamePrefixes", js.Array(value :_*))
    
    @scala.inline
    def setInstanceNamePrefixes(value: js.Array[String]): Self = this.set("instanceNamePrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceNamePrefixes: Self = this.set("instanceNamePrefixes", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = this.set("instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: String*): Self = this.set("zones", js.Array(value :_*))
    
    @scala.inline
    def setZones(value: js.Array[String]): Self = this.set("zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
}
