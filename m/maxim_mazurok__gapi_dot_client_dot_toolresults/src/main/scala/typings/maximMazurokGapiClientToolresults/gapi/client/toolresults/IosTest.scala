package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosTest extends js.Object {
  
  /** Information about the application under test. */
  var iosAppInfo: js.UndefOr[IosAppInfo] = js.native
  
  /** An iOS Robo test. */
  var iosRoboTest: js.UndefOr[js.Any] = js.native
  
  /** An iOS test loop. */
  var iosTestLoop: js.UndefOr[IosTestLoop] = js.native
  
  /** An iOS XCTest. */
  var iosXcTest: js.UndefOr[IosXcTest] = js.native
  
  /** Max time a test is allowed to run before it is automatically cancelled. */
  var testTimeout: js.UndefOr[Duration] = js.native
}
object IosTest {
  
  @scala.inline
  def apply(): IosTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosTest]
  }
  
  @scala.inline
  implicit class IosTestOps[Self <: IosTest] (val x: Self) extends AnyVal {
    
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
    def setIosAppInfo(value: IosAppInfo): Self = this.set("iosAppInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosAppInfo: Self = this.set("iosAppInfo", js.undefined)
    
    @scala.inline
    def setIosRoboTest(value: js.Any): Self = this.set("iosRoboTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosRoboTest: Self = this.set("iosRoboTest", js.undefined)
    
    @scala.inline
    def setIosTestLoop(value: IosTestLoop): Self = this.set("iosTestLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosTestLoop: Self = this.set("iosTestLoop", js.undefined)
    
    @scala.inline
    def setIosXcTest(value: IosXcTest): Self = this.set("iosXcTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosXcTest: Self = this.set("iosXcTest", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: Duration): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTimeout: Self = this.set("testTimeout", js.undefined)
  }
}
