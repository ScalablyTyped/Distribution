package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvidedSoftwareCatalog extends js.Object {
  
  /** A string representing the current version of Android Test Orchestrator that is provided by TestExecutionService. Example: "1.0.2 beta". */
  var orchestratorVersion: js.UndefOr[String] = js.native
}
object ProvidedSoftwareCatalog {
  
  @scala.inline
  def apply(): ProvidedSoftwareCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvidedSoftwareCatalog]
  }
  
  @scala.inline
  implicit class ProvidedSoftwareCatalogOps[Self <: ProvidedSoftwareCatalog] (val x: Self) extends AnyVal {
    
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
    def setOrchestratorVersion(value: String): Self = this.set("orchestratorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrchestratorVersion: Self = this.set("orchestratorVersion", js.undefined)
  }
}
