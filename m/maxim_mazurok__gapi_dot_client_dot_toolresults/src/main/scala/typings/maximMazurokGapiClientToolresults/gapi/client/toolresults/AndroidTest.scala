package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidTest extends StObject {
  
  /** Information about the application under test. */
  var androidAppInfo: js.UndefOr[AndroidAppInfo] = js.native
  
  /** An Android instrumentation test. */
  var androidInstrumentationTest: js.UndefOr[AndroidInstrumentationTest] = js.native
  
  /** An Android robo test. */
  var androidRoboTest: js.UndefOr[AndroidRoboTest] = js.native
  
  /** An Android test loop. */
  var androidTestLoop: js.UndefOr[js.Any] = js.native
  
  /** Max time a test is allowed to run before it is automatically cancelled. */
  var testTimeout: js.UndefOr[Duration] = js.native
}
object AndroidTest {
  
  @scala.inline
  def apply(): AndroidTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidTest]
  }
  
  @scala.inline
  implicit class AndroidTestMutableBuilder[Self <: AndroidTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidAppInfo(value: AndroidAppInfo): Self = StObject.set(x, "androidAppInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidAppInfoUndefined: Self = StObject.set(x, "androidAppInfo", js.undefined)
    
    @scala.inline
    def setAndroidInstrumentationTest(value: AndroidInstrumentationTest): Self = StObject.set(x, "androidInstrumentationTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidInstrumentationTestUndefined: Self = StObject.set(x, "androidInstrumentationTest", js.undefined)
    
    @scala.inline
    def setAndroidRoboTest(value: AndroidRoboTest): Self = StObject.set(x, "androidRoboTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidRoboTestUndefined: Self = StObject.set(x, "androidRoboTest", js.undefined)
    
    @scala.inline
    def setAndroidTestLoop(value: js.Any): Self = StObject.set(x, "androidTestLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidTestLoopUndefined: Self = StObject.set(x, "androidTestLoop", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: Duration): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
  }
}
