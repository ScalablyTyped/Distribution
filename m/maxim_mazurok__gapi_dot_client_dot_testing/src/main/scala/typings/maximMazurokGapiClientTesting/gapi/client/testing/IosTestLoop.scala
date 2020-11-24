package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosTestLoop extends js.Object {
  
  /** Output only. The bundle id for the application under test. */
  var appBundleId: js.UndefOr[String] = js.native
  
  /** Required. The .ipa of the application to test. */
  var appIpa: js.UndefOr[FileReference] = js.native
  
  /** The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified. */
  var scenarios: js.UndefOr[js.Array[Double]] = js.native
}
object IosTestLoop {
  
  @scala.inline
  def apply(): IosTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosTestLoop]
  }
  
  @scala.inline
  implicit class IosTestLoopOps[Self <: IosTestLoop] (val x: Self) extends AnyVal {
    
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
    def setAppBundleId(value: String): Self = this.set("appBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppBundleId: Self = this.set("appBundleId", js.undefined)
    
    @scala.inline
    def setAppIpa(value: FileReference): Self = this.set("appIpa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppIpa: Self = this.set("appIpa", js.undefined)
    
    @scala.inline
    def setScenariosVarargs(value: Double*): Self = this.set("scenarios", js.Array(value :_*))
    
    @scala.inline
    def setScenarios(value: js.Array[Double]): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScenarios: Self = this.set("scenarios", js.undefined)
  }
}
