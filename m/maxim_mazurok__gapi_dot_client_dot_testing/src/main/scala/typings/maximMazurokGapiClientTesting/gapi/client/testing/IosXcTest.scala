package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosXcTest extends js.Object {
  
  /** Output only. The bundle id for the application under test. */
  var appBundleId: js.UndefOr[String] = js.native
  
  /**
    * The option to test special app entitlements. Setting this would re-sign the app having special entitlements with an explicit application-identifier. Currently supports testing
    * aps-environment entitlement.
    */
  var testSpecialEntitlements: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The .zip containing the .xctestrun file and the contents of the DerivedData/Build/Products directory. The .xctestrun file in this zip is ignored if the xctestrun field is
    * specified.
    */
  var testsZip: js.UndefOr[FileReference] = js.native
  
  /**
    * The Xcode version that should be used for the test. Use the TestEnvironmentDiscoveryService to get supported options. Defaults to the latest Xcode version Firebase Test Lab
    * supports.
    */
  var xcodeVersion: js.UndefOr[String] = js.native
  
  /**
    * An .xctestrun file that will override the .xctestrun file in the tests zip. Because the .xctestrun file contains environment variables along with test methods to run and/or ignore,
    * this can be useful for sharding tests. Default is taken from the tests zip.
    */
  var xctestrun: js.UndefOr[FileReference] = js.native
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
    def setAppBundleId(value: String): Self = this.set("appBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppBundleId: Self = this.set("appBundleId", js.undefined)
    
    @scala.inline
    def setTestSpecialEntitlements(value: Boolean): Self = this.set("testSpecialEntitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSpecialEntitlements: Self = this.set("testSpecialEntitlements", js.undefined)
    
    @scala.inline
    def setTestsZip(value: FileReference): Self = this.set("testsZip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestsZip: Self = this.set("testsZip", js.undefined)
    
    @scala.inline
    def setXcodeVersion(value: String): Self = this.set("xcodeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXcodeVersion: Self = this.set("xcodeVersion", js.undefined)
    
    @scala.inline
    def setXctestrun(value: FileReference): Self = this.set("xctestrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXctestrun: Self = this.set("xctestrun", js.undefined)
  }
}
