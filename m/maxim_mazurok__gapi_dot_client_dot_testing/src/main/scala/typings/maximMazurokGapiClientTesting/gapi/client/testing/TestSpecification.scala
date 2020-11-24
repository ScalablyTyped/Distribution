package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestSpecification extends js.Object {
  
  /** An Android instrumentation test. */
  var androidInstrumentationTest: js.UndefOr[AndroidInstrumentationTest] = js.native
  
  /** An Android robo test. */
  var androidRoboTest: js.UndefOr[AndroidRoboTest] = js.native
  
  /** An Android Application with a Test Loop. */
  var androidTestLoop: js.UndefOr[AndroidTestLoop] = js.native
  
  /** Disables performance metrics recording. May reduce test latency. */
  var disablePerformanceMetrics: js.UndefOr[Boolean] = js.native
  
  /** Disables video recording. May reduce test latency. */
  var disableVideoRecording: js.UndefOr[Boolean] = js.native
  
  /** An iOS application with a test loop. */
  var iosTestLoop: js.UndefOr[IosTestLoop] = js.native
  
  /** Test setup requirements for iOS. */
  var iosTestSetup: js.UndefOr[IosTestSetup] = js.native
  
  /** An iOS XCTest, via an .xctestrun file. */
  var iosXcTest: js.UndefOr[IosXcTest] = js.native
  
  /** Test setup requirements for Android e.g. files to install, bootstrap scripts. */
  var testSetup: js.UndefOr[TestSetup] = js.native
  
  /** Max time a test execution is allowed to run before it is automatically cancelled. The default value is 5 min. */
  var testTimeout: js.UndefOr[String] = js.native
}
object TestSpecification {
  
  @scala.inline
  def apply(): TestSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSpecification]
  }
  
  @scala.inline
  implicit class TestSpecificationOps[Self <: TestSpecification] (val x: Self) extends AnyVal {
    
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
    def setAndroidInstrumentationTest(value: AndroidInstrumentationTest): Self = this.set("androidInstrumentationTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidInstrumentationTest: Self = this.set("androidInstrumentationTest", js.undefined)
    
    @scala.inline
    def setAndroidRoboTest(value: AndroidRoboTest): Self = this.set("androidRoboTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidRoboTest: Self = this.set("androidRoboTest", js.undefined)
    
    @scala.inline
    def setAndroidTestLoop(value: AndroidTestLoop): Self = this.set("androidTestLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidTestLoop: Self = this.set("androidTestLoop", js.undefined)
    
    @scala.inline
    def setDisablePerformanceMetrics(value: Boolean): Self = this.set("disablePerformanceMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePerformanceMetrics: Self = this.set("disablePerformanceMetrics", js.undefined)
    
    @scala.inline
    def setDisableVideoRecording(value: Boolean): Self = this.set("disableVideoRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableVideoRecording: Self = this.set("disableVideoRecording", js.undefined)
    
    @scala.inline
    def setIosTestLoop(value: IosTestLoop): Self = this.set("iosTestLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosTestLoop: Self = this.set("iosTestLoop", js.undefined)
    
    @scala.inline
    def setIosTestSetup(value: IosTestSetup): Self = this.set("iosTestSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosTestSetup: Self = this.set("iosTestSetup", js.undefined)
    
    @scala.inline
    def setIosXcTest(value: IosXcTest): Self = this.set("iosXcTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosXcTest: Self = this.set("iosXcTest", js.undefined)
    
    @scala.inline
    def setTestSetup(value: TestSetup): Self = this.set("testSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSetup: Self = this.set("testSetup", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: String): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTimeout: Self = this.set("testTimeout", js.undefined)
  }
}
