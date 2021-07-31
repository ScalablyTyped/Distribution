package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosXcTest extends StObject {
  
  /** Output only. The bundle id for the application under test. */
  var appBundleId: js.UndefOr[String] = js.undefined
  
  /**
    * The option to test special app entitlements. Setting this would re-sign the app having special entitlements with an explicit application-identifier. Currently supports testing
    * aps-environment entitlement.
    */
  var testSpecialEntitlements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The .zip containing the .xctestrun file and the contents of the DerivedData/Build/Products directory. The .xctestrun file in this zip is ignored if the xctestrun field is
    * specified.
    */
  var testsZip: js.UndefOr[FileReference] = js.undefined
  
  /**
    * The Xcode version that should be used for the test. Use the TestEnvironmentDiscoveryService to get supported options. Defaults to the latest Xcode version Firebase Test Lab
    * supports.
    */
  var xcodeVersion: js.UndefOr[String] = js.undefined
  
  /**
    * An .xctestrun file that will override the .xctestrun file in the tests zip. Because the .xctestrun file contains environment variables along with test methods to run and/or ignore,
    * this can be useful for sharding tests. Default is taken from the tests zip.
    */
  var xctestrun: js.UndefOr[FileReference] = js.undefined
}
object IosXcTest {
  
  @scala.inline
  def apply(): IosXcTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosXcTest]
  }
  
  @scala.inline
  implicit class IosXcTestMutableBuilder[Self <: IosXcTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppBundleId(value: String): Self = StObject.set(x, "appBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppBundleIdUndefined: Self = StObject.set(x, "appBundleId", js.undefined)
    
    @scala.inline
    def setTestSpecialEntitlements(value: Boolean): Self = StObject.set(x, "testSpecialEntitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSpecialEntitlementsUndefined: Self = StObject.set(x, "testSpecialEntitlements", js.undefined)
    
    @scala.inline
    def setTestsZip(value: FileReference): Self = StObject.set(x, "testsZip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsZipUndefined: Self = StObject.set(x, "testsZip", js.undefined)
    
    @scala.inline
    def setXcodeVersion(value: String): Self = StObject.set(x, "xcodeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXcodeVersionUndefined: Self = StObject.set(x, "xcodeVersion", js.undefined)
    
    @scala.inline
    def setXctestrun(value: FileReference): Self = StObject.set(x, "xctestrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXctestrunUndefined: Self = StObject.set(x, "xctestrun", js.undefined)
  }
}
