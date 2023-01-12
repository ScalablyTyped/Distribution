package typings.nginstackJsunit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestRunnerMod {
  
  inline def apply(suite: TestSuite): Unit = ^.asInstanceOf[js.Dynamic].apply(suite.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(suite: TestSuite, opt_trackingId: String): Unit = (^.asInstanceOf[js.Dynamic].apply(suite.asInstanceOf[js.Any], opt_trackingId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/jsunit/lib/TestRunner", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TestRunner {
    def this(suite: TestSuite) = this()
    def this(suite: TestSuite, opt_trackingId: String) = this()
    
    /* private */ /* CompleteClass */
    var clear_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var isUnitTest_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var loadSuite_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    override def runTest(testName: String): typings.nginstackJsunit.libTestResultMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var scriptRunner_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var suite_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var trackingId_ : Any = js.native
  }
  @JSImport("@nginstack/jsunit/lib/TestRunner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TestRunner extends StObject {
    
    /* private */ var clear_ : Any
    
    /* private */ var isUnitTest_ : Any
    
    /* private */ var loadSuite_ : Any
    
    /* private */ var logger_ : Any
    
    def runTest(testName: String): typings.nginstackJsunit.libTestResultMod.^
    
    /* private */ var scriptRunner_ : Any
    
    /* private */ var suite_ : Any
    
    /* private */ var trackingId_ : Any
  }
  object TestRunner {
    
    inline def apply(
      clear_ : Any,
      isUnitTest_ : Any,
      loadSuite_ : Any,
      logger_ : Any,
      runTest: String => typings.nginstackJsunit.libTestResultMod.^,
      scriptRunner_ : Any,
      suite_ : Any,
      trackingId_ : Any
    ): TestRunner = {
      val __obj = js.Dynamic.literal(clear_ = clear_.asInstanceOf[js.Any], isUnitTest_ = isUnitTest_.asInstanceOf[js.Any], loadSuite_ = loadSuite_.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], runTest = js.Any.fromFunction1(runTest), scriptRunner_ = scriptRunner_.asInstanceOf[js.Any], suite_ = suite_.asInstanceOf[js.Any], trackingId_ = trackingId_.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestRunner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestRunner] (val x: Self) extends AnyVal {
      
      inline def setClear_(value: Any): Self = StObject.set(x, "clear_", value.asInstanceOf[js.Any])
      
      inline def setIsUnitTest_(value: Any): Self = StObject.set(x, "isUnitTest_", value.asInstanceOf[js.Any])
      
      inline def setLoadSuite_(value: Any): Self = StObject.set(x, "loadSuite_", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setRunTest(value: String => typings.nginstackJsunit.libTestResultMod.^): Self = StObject.set(x, "runTest", js.Any.fromFunction1(value))
      
      inline def setScriptRunner_(value: Any): Self = StObject.set(x, "scriptRunner_", value.asInstanceOf[js.Any])
      
      inline def setSuite_(value: Any): Self = StObject.set(x, "suite_", value.asInstanceOf[js.Any])
      
      inline def setTrackingId_(value: Any): Self = StObject.set(x, "trackingId_", value.asInstanceOf[js.Any])
    }
  }
  
  type TestSuite = typings.nginstackJsunit.libTestSuiteMod.^
}
