package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoredResourceMetadata extends js.Object {
  
  /**
    * Output only. Values for predefined system metadata labels. System labels are a kind of metadata extracted by Google, including "machine_image", "vpc", "subnet_id", "security_group",
    * "name", etc. System label values can be only strings, Boolean values, or a list of strings. For example: { "name": "my-test-instance", "security_group": ["a", "b", "c"],
    * "spot_instance": false }
    */
  var systemLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.MonitoredResourceMetadata with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. A map of user-defined metadata labels. */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.MonitoredResourceMetadata with TopLevel[js.Any]
  ] = js.native
}
object MonitoredResourceMetadata {
  
  @scala.inline
  def apply(): MonitoredResourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoredResourceMetadata]
  }
  
  @scala.inline
  implicit class MonitoredResourceMetadataOps[Self <: MonitoredResourceMetadata] (val x: Self) extends AnyVal {
    
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
    def setSystemLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.MonitoredResourceMetadata with TopLevel[js.Any]
    ): Self = this.set("systemLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemLabels: Self = this.set("systemLabels", js.undefined)
    
    @scala.inline
    def setUserLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.MonitoredResourceMetadata with TopLevel[js.Any]
    ): Self = this.set("userLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLabels: Self = this.set("userLabels", js.undefined)
  }
}
