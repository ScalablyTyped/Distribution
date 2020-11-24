package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResponsePayload extends js.Object {
  
  /** States of the devices. Map of third-party device ID to struct of device states. */
  var devices: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: {[ P in string ]: any}}
    */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.QueryResponsePayload with TopLevel[js.Any]
  ] = js.native
}
object QueryResponsePayload {
  
  @scala.inline
  def apply(): QueryResponsePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponsePayload]
  }
  
  @scala.inline
  implicit class QueryResponsePayloadOps[Self <: QueryResponsePayload] (val x: Self) extends AnyVal {
    
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
    def setDevices(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: {[ P in string ]: any}}
      */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.QueryResponsePayload with TopLevel[js.Any]
    ): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
  }
}
