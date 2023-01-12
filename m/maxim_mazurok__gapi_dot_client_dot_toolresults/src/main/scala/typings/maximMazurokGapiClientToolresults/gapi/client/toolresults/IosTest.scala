package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosTest extends StObject {
  
  /** Information about the application under test. */
  var iosAppInfo: js.UndefOr[IosAppInfo] = js.undefined
  
  /** An iOS Robo test. */
  var iosRoboTest: js.UndefOr[scala.Any] = js.undefined
  
  /** An iOS test loop. */
  var iosTestLoop: js.UndefOr[IosTestLoop] = js.undefined
  
  /** An iOS XCTest. */
  var iosXcTest: js.UndefOr[IosXcTest] = js.undefined
  
  /** Max time a test is allowed to run before it is automatically cancelled. */
  var testTimeout: js.UndefOr[Duration] = js.undefined
}
object IosTest {
  
  inline def apply(): IosTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosTest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosTest] (val x: Self) extends AnyVal {
    
    inline def setIosAppInfo(value: IosAppInfo): Self = StObject.set(x, "iosAppInfo", value.asInstanceOf[js.Any])
    
    inline def setIosAppInfoUndefined: Self = StObject.set(x, "iosAppInfo", js.undefined)
    
    inline def setIosRoboTest(value: scala.Any): Self = StObject.set(x, "iosRoboTest", value.asInstanceOf[js.Any])
    
    inline def setIosRoboTestUndefined: Self = StObject.set(x, "iosRoboTest", js.undefined)
    
    inline def setIosTestLoop(value: IosTestLoop): Self = StObject.set(x, "iosTestLoop", value.asInstanceOf[js.Any])
    
    inline def setIosTestLoopUndefined: Self = StObject.set(x, "iosTestLoop", js.undefined)
    
    inline def setIosXcTest(value: IosXcTest): Self = StObject.set(x, "iosXcTest", value.asInstanceOf[js.Any])
    
    inline def setIosXcTestUndefined: Self = StObject.set(x, "iosXcTest", js.undefined)
    
    inline def setTestTimeout(value: Duration): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
  }
}
