package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidInstrumentationTest extends js.Object {
  
  /** The APK for the application under test. */
  var appApk: js.UndefOr[FileReference] = js.native
  
  /** A multi-apk app bundle for the application under test. */
  var appBundle: js.UndefOr[AppBundle] = js.native
  
  /** The java package for the application under test. The default value is determined by examining the application's manifest. */
  var appPackageId: js.UndefOr[String] = js.native
  
  /**
    * The option of whether running each test within its own invocation of instrumentation with Android Test Orchestrator or not. ** Orchestrator is only compatible with
    * AndroidJUnitRunner version 1.0 or higher! ** Orchestrator offers the following benefits: - No shared state - Crashes are isolated - Logs are scoped per test See for more information
    * about Android Test Orchestrator. If not set, the test will be run without the orchestrator.
    */
  var orchestratorOption: js.UndefOr[String] = js.native
  
  /** The option to run tests in multiple shards in parallel. */
  var shardingOption: js.UndefOr[ShardingOption] = js.native
  
  /** Required. The APK containing the test code to be executed. */
  var testApk: js.UndefOr[FileReference] = js.native
  
  /** The java package for the test to be executed. The default value is determined by examining the application's manifest. */
  var testPackageId: js.UndefOr[String] = js.native
  
  /** The InstrumentationTestRunner class. The default value is determined by examining the application's manifest. */
  var testRunnerClass: js.UndefOr[String] = js.native
  
  /**
    * Each target must be fully qualified with the package name or class name, in one of these formats: - "package package_name" - "class package_name.class_name" - "class
    * package_name.class_name#method_name" If empty, all targets in the module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
}
object AndroidInstrumentationTest {
  
  @scala.inline
  def apply(): AndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidInstrumentationTest]
  }
  
  @scala.inline
  implicit class AndroidInstrumentationTestOps[Self <: AndroidInstrumentationTest] (val x: Self) extends AnyVal {
    
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
    def setAppApk(value: FileReference): Self = this.set("appApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppApk: Self = this.set("appApk", js.undefined)
    
    @scala.inline
    def setAppBundle(value: AppBundle): Self = this.set("appBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppBundle: Self = this.set("appBundle", js.undefined)
    
    @scala.inline
    def setAppPackageId(value: String): Self = this.set("appPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppPackageId: Self = this.set("appPackageId", js.undefined)
    
    @scala.inline
    def setOrchestratorOption(value: String): Self = this.set("orchestratorOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrchestratorOption: Self = this.set("orchestratorOption", js.undefined)
    
    @scala.inline
    def setShardingOption(value: ShardingOption): Self = this.set("shardingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardingOption: Self = this.set("shardingOption", js.undefined)
    
    @scala.inline
    def setTestApk(value: FileReference): Self = this.set("testApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestApk: Self = this.set("testApk", js.undefined)
    
    @scala.inline
    def setTestPackageId(value: String): Self = this.set("testPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestPackageId: Self = this.set("testPackageId", js.undefined)
    
    @scala.inline
    def setTestRunnerClass(value: String): Self = this.set("testRunnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestRunnerClass: Self = this.set("testRunnerClass", js.undefined)
    
    @scala.inline
    def setTestTargetsVarargs(value: String*): Self = this.set("testTargets", js.Array(value :_*))
    
    @scala.inline
    def setTestTargets(value: js.Array[String]): Self = this.set("testTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTargets: Self = this.set("testTargets", js.undefined)
  }
}
