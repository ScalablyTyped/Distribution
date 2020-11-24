package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigChange extends js.Object {
  
  /** Collection of advice provided for this change, useful for determining the possible impact of this change. */
  var advices: js.UndefOr[js.Array[Advice]] = js.native
  
  /** The type for this change, either ADDED, REMOVED, or MODIFIED. */
  var changeType: js.UndefOr[String] = js.native
  
  /**
    * Object hierarchy path to the change, with levels separated by a '.' character. For repeated fields, an applicable unique identifier field is used for the index (usually selector,
    * name, or id). For maps, the term 'key' is used. If the field has no unique identifier, the numeric index is used. Examples: -
    * visibility.rules[selector=="google.LibraryService.ListBooks"].restriction - quota.metric_rules[selector=="google"].metric_costs[key=="reads"].value -
    * logging.producer_destinations[0]
    */
  var element: js.UndefOr[String] = js.native
  
  /** Value of the changed object in the new Service configuration, in JSON format. This field will not be populated if ChangeType == REMOVED. */
  var newValue: js.UndefOr[String] = js.native
  
  /** Value of the changed object in the old Service configuration, in JSON format. This field will not be populated if ChangeType == ADDED. */
  var oldValue: js.UndefOr[String] = js.native
}
object ConfigChange {
  
  @scala.inline
  def apply(): ConfigChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigChange]
  }
  
  @scala.inline
  implicit class ConfigChangeOps[Self <: ConfigChange] (val x: Self) extends AnyVal {
    
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
    def setAdvicesVarargs(value: Advice*): Self = this.set("advices", js.Array(value :_*))
    
    @scala.inline
    def setAdvices(value: js.Array[Advice]): Self = this.set("advices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvices: Self = this.set("advices", js.undefined)
    
    @scala.inline
    def setChangeType(value: String): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setNewValue(value: String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
}
