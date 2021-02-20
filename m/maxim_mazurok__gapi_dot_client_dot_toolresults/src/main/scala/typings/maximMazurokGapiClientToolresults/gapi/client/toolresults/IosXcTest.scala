package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosXcTest extends StObject {
  
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
  implicit class IosXcTestMutableBuilder[Self <: IosXcTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setXcodeVersion(value: String): Self = StObject.set(x, "xcodeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXcodeVersionUndefined: Self = StObject.set(x, "xcodeVersion", js.undefined)
  }
}
