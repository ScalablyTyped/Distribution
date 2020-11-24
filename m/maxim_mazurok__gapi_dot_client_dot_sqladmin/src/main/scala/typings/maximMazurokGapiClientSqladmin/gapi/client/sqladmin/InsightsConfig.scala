package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsConfig extends js.Object {
  
  /** Whether Query Insights feature is enabled. */
  var queryInsightsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query length more than this field value will be truncated to this value. When unset, query
    * length will be the default value.
    */
  var queryStringLength: js.UndefOr[Double] = js.native
  
  /** Whether Query Insights will record application tags from query when enabled. */
  var recordApplicationTags: js.UndefOr[Boolean] = js.native
  
  /** Whether Query Insights will record client address when enabled. */
  var recordClientAddress: js.UndefOr[Boolean] = js.native
}
object InsightsConfig {
  
  @scala.inline
  def apply(): InsightsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightsConfig]
  }
  
  @scala.inline
  implicit class InsightsConfigOps[Self <: InsightsConfig] (val x: Self) extends AnyVal {
    
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
    def setQueryInsightsEnabled(value: Boolean): Self = this.set("queryInsightsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryInsightsEnabled: Self = this.set("queryInsightsEnabled", js.undefined)
    
    @scala.inline
    def setQueryStringLength(value: Double): Self = this.set("queryStringLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryStringLength: Self = this.set("queryStringLength", js.undefined)
    
    @scala.inline
    def setRecordApplicationTags(value: Boolean): Self = this.set("recordApplicationTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordApplicationTags: Self = this.set("recordApplicationTags", js.undefined)
    
    @scala.inline
    def setRecordClientAddress(value: Boolean): Self = this.set("recordClientAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordClientAddress: Self = this.set("recordClientAddress", js.undefined)
  }
}
