package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidInstrumentationTest extends StObject {
  
  /** The java package for the test to be executed. Required */
  var testPackageId: js.UndefOr[String] = js.undefined
  
  /** The InstrumentationTestRunner class. Required */
  var testRunnerClass: js.UndefOr[String] = js.undefined
  
  /**
    * Each target must be fully qualified with the package name or class name, in one of these formats: - "package package_name" - "class package_name.class_name" - "class
    * package_name.class_name#method_name" If empty, all targets in the module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The flag indicates whether Android Test Orchestrator will be used to run test or not. */
  var useOrchestrator: js.UndefOr[Boolean] = js.undefined
}
object AndroidInstrumentationTest {
  
  @scala.inline
  def apply(): AndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidInstrumentationTest]
  }
  
  @scala.inline
  implicit class AndroidInstrumentationTestMutableBuilder[Self <: AndroidInstrumentationTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestPackageId(value: String): Self = StObject.set(x, "testPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPackageIdUndefined: Self = StObject.set(x, "testPackageId", js.undefined)
    
    @scala.inline
    def setTestRunnerClass(value: String): Self = StObject.set(x, "testRunnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRunnerClassUndefined: Self = StObject.set(x, "testRunnerClass", js.undefined)
    
    @scala.inline
    def setTestTargets(value: js.Array[String]): Self = StObject.set(x, "testTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTargetsUndefined: Self = StObject.set(x, "testTargets", js.undefined)
    
    @scala.inline
    def setTestTargetsVarargs(value: String*): Self = StObject.set(x, "testTargets", js.Array(value :_*))
    
    @scala.inline
    def setUseOrchestrator(value: Boolean): Self = StObject.set(x, "useOrchestrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseOrchestratorUndefined: Self = StObject.set(x, "useOrchestrator", js.undefined)
  }
}
