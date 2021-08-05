package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidTest extends StObject {
  
  /** Information about the application under test. */
  var androidAppInfo: js.UndefOr[AndroidAppInfo] = js.undefined
  
  /** An Android instrumentation test. */
  var androidInstrumentationTest: js.UndefOr[AndroidInstrumentationTest] = js.undefined
  
  /** An Android robo test. */
  var androidRoboTest: js.UndefOr[AndroidRoboTest] = js.undefined
  
  /** An Android test loop. */
  var androidTestLoop: js.UndefOr[js.Any] = js.undefined
  
  /** Max time a test is allowed to run before it is automatically cancelled. */
  var testTimeout: js.UndefOr[Duration] = js.undefined
}
object AndroidTest {
  
  inline def apply(): AndroidTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidTest]
  }
  
  extension [Self <: AndroidTest](x: Self) {
    
    inline def setAndroidAppInfo(value: AndroidAppInfo): Self = StObject.set(x, "androidAppInfo", value.asInstanceOf[js.Any])
    
    inline def setAndroidAppInfoUndefined: Self = StObject.set(x, "androidAppInfo", js.undefined)
    
    inline def setAndroidInstrumentationTest(value: AndroidInstrumentationTest): Self = StObject.set(x, "androidInstrumentationTest", value.asInstanceOf[js.Any])
    
    inline def setAndroidInstrumentationTestUndefined: Self = StObject.set(x, "androidInstrumentationTest", js.undefined)
    
    inline def setAndroidRoboTest(value: AndroidRoboTest): Self = StObject.set(x, "androidRoboTest", value.asInstanceOf[js.Any])
    
    inline def setAndroidRoboTestUndefined: Self = StObject.set(x, "androidRoboTest", js.undefined)
    
    inline def setAndroidTestLoop(value: js.Any): Self = StObject.set(x, "androidTestLoop", value.asInstanceOf[js.Any])
    
    inline def setAndroidTestLoopUndefined: Self = StObject.set(x, "androidTestLoop", js.undefined)
    
    inline def setTestTimeout(value: Duration): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
  }
}
