package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MendelDebugInput extends js.Object {
  
  /**
    * When a request spans multiple servers, a MendelDebugInput may travel with the request and take effect in all the servers. This field is a map of namespaces to
    * NamespacedMendelDebugInput protos. In a single server, up to two NamespacedMendelDebugInput protos are applied: 1. NamespacedMendelDebugInput with the global namespace (key == "").
    * 2. NamespacedMendelDebugInput with the server's namespace. When both NamespacedMendelDebugInput protos are present, they are merged. See go/mendel-debug-forcing for more details.
    */
  var namespacedDebugInput: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.jobs.gapi.client.jobs.NamespacedDebugInput}
    */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.MendelDebugInput with TopLevel[js.Any]
  ] = js.native
}
object MendelDebugInput {
  
  @scala.inline
  def apply(): MendelDebugInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MendelDebugInput]
  }
  
  @scala.inline
  implicit class MendelDebugInputOps[Self <: MendelDebugInput] (val x: Self) extends AnyVal {
    
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
    def setNamespacedDebugInput(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.jobs.gapi.client.jobs.NamespacedDebugInput}
      */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.MendelDebugInput with TopLevel[js.Any]
    ): Self = this.set("namespacedDebugInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespacedDebugInput: Self = this.set("namespacedDebugInput", js.undefined)
  }
}
