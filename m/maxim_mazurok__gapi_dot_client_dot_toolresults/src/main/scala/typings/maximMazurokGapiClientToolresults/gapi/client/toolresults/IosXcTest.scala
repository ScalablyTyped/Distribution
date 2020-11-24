package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosXcTest extends js.Object {
  
  /** Bundle ID of the app. */
  var bundleId: js.UndefOr[String] = js.native
  
  /** Xcode version that the test was run with. */
  var xcodeVersion: js.UndefOr[String] = js.native
}
object IosXcTest {
  
  @scala.inline
  def apply(): IosXcTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosXcTest]
  }
  
  @scala.inline
  implicit class IosXcTestOps[Self <: IosXcTest] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setXcodeVersion(value: String): Self = this.set("xcodeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXcodeVersion: Self = this.set("xcodeVersion", js.undefined)
  }
}
