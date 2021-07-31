package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSpecification extends StObject {
  
  /** An Android instrumentation test. */
  var androidInstrumentationTest: js.UndefOr[AndroidInstrumentationTest] = js.undefined
  
  /** An Android robo test. */
  var androidRoboTest: js.UndefOr[AndroidRoboTest] = js.undefined
  
  /** An Android Application with a Test Loop. */
  var androidTestLoop: js.UndefOr[AndroidTestLoop] = js.undefined
  
  /** Disables performance metrics recording. May reduce test latency. */
  var disablePerformanceMetrics: js.UndefOr[Boolean] = js.undefined
  
  /** Disables video recording. May reduce test latency. */
  var disableVideoRecording: js.UndefOr[Boolean] = js.undefined
  
  /** An iOS application with a test loop. */
  var iosTestLoop: js.UndefOr[IosTestLoop] = js.undefined
  
  /** Test setup requirements for iOS. */
  var iosTestSetup: js.UndefOr[IosTestSetup] = js.undefined
  
  /** An iOS XCTest, via an .xctestrun file. */
  var iosXcTest: js.UndefOr[IosXcTest] = js.undefined
  
  /** Test setup requirements for Android e.g. files to install, bootstrap scripts. */
  var testSetup: js.UndefOr[TestSetup] = js.undefined
  
  /** Max time a test execution is allowed to run before it is automatically cancelled. The default value is 5 min. */
  var testTimeout: js.UndefOr[String] = js.undefined
}
object TestSpecification {
  
  @scala.inline
  def apply(): TestSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSpecification]
  }
  
  @scala.inline
  implicit class TestSpecificationMutableBuilder[Self <: TestSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidInstrumentationTest(value: AndroidInstrumentationTest): Self = StObject.set(x, "androidInstrumentationTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidInstrumentationTestUndefined: Self = StObject.set(x, "androidInstrumentationTest", js.undefined)
    
    @scala.inline
    def setAndroidRoboTest(value: AndroidRoboTest): Self = StObject.set(x, "androidRoboTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidRoboTestUndefined: Self = StObject.set(x, "androidRoboTest", js.undefined)
    
    @scala.inline
    def setAndroidTestLoop(value: AndroidTestLoop): Self = StObject.set(x, "androidTestLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidTestLoopUndefined: Self = StObject.set(x, "androidTestLoop", js.undefined)
    
    @scala.inline
    def setDisablePerformanceMetrics(value: Boolean): Self = StObject.set(x, "disablePerformanceMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePerformanceMetricsUndefined: Self = StObject.set(x, "disablePerformanceMetrics", js.undefined)
    
    @scala.inline
    def setDisableVideoRecording(value: Boolean): Self = StObject.set(x, "disableVideoRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableVideoRecordingUndefined: Self = StObject.set(x, "disableVideoRecording", js.undefined)
    
    @scala.inline
    def setIosTestLoop(value: IosTestLoop): Self = StObject.set(x, "iosTestLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosTestLoopUndefined: Self = StObject.set(x, "iosTestLoop", js.undefined)
    
    @scala.inline
    def setIosTestSetup(value: IosTestSetup): Self = StObject.set(x, "iosTestSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosTestSetupUndefined: Self = StObject.set(x, "iosTestSetup", js.undefined)
    
    @scala.inline
    def setIosXcTest(value: IosXcTest): Self = StObject.set(x, "iosXcTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosXcTestUndefined: Self = StObject.set(x, "iosXcTest", js.undefined)
    
    @scala.inline
    def setTestSetup(value: TestSetup): Self = StObject.set(x, "testSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSetupUndefined: Self = StObject.set(x, "testSetup", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: String): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
  }
}
