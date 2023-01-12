package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosXcTest extends StObject {
  
  /** Bundle ID of the app. */
  var bundleId: js.UndefOr[String] = js.undefined
  
  /** Xcode version that the test was run with. */
  var xcodeVersion: js.UndefOr[String] = js.undefined
}
object IosXcTest {
  
  inline def apply(): IosXcTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosXcTest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosXcTest] (val x: Self) extends AnyVal {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setXcodeVersion(value: String): Self = StObject.set(x, "xcodeVersion", value.asInstanceOf[js.Any])
    
    inline def setXcodeVersionUndefined: Self = StObject.set(x, "xcodeVersion", js.undefined)
  }
}
