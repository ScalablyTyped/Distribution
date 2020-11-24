package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidTest extends js.Object {
  
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
  implicit class AndroidTestOps[Self <: AndroidTest] (val x: Self) extends AnyVal {
    
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
    def setAndroidAppInfo(value: AndroidAppInfo): Self = this.set("androidAppInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidAppInfo: Self = this.set("androidAppInfo", js.undefined)
    
    @scala.inline
    def setAndroidInstrumentationTest(value: AndroidInstrumentationTest): Self = this.set("androidInstrumentationTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidInstrumentationTest: Self = this.set("androidInstrumentationTest", js.undefined)
    
    @scala.inline
    def setAndroidRoboTest(value: AndroidRoboTest): Self = this.set("androidRoboTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidRoboTest: Self = this.set("androidRoboTest", js.undefined)
    
    @scala.inline
    def setAndroidTestLoop(value: js.Any): Self = this.set("androidTestLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidTestLoop: Self = this.set("androidTestLoop", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: Duration): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTimeout: Self = this.set("testTimeout", js.undefined)
  }
}
