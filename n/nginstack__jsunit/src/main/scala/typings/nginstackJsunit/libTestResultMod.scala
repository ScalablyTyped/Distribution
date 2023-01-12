package typings.nginstackJsunit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestResultMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_error: js.Error): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/jsunit/lib/TestResult", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TestResult {
    def this(opt_error: js.Error) = this()
    
    /* CompleteClass */
    var errorCount: Double = js.native
    
    /* CompleteClass */
    var failureCount: Double = js.native
    
    /* private */ /* CompleteClass */
    var formatFileName_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var initialize_ : Any = js.native
    
    /* CompleteClass */
    var memDelta: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var runTime: Double = js.native
    
    /* CompleteClass */
    var stackTraceMessage: String = js.native
    
    /* CompleteClass */
    var testCaseName: String = js.native
    
    /* CompleteClass */
    var testSuiteName: String = js.native
    
    /* CompleteClass */
    var wasSuccessful: Boolean = js.native
  }
  @JSImport("@nginstack/jsunit/lib/TestResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TestResult extends StObject {
    
    var errorCount: Double
    
    var failureCount: Double
    
    /* private */ var formatFileName_ : Any
    
    /* private */ var initialize_ : Any
    
    var memDelta: Double
    
    var message: String
    
    var runTime: Double
    
    var stackTraceMessage: String
    
    var testCaseName: String
    
    var testSuiteName: String
    
    var wasSuccessful: Boolean
  }
  object TestResult {
    
    inline def apply(
      errorCount: Double,
      failureCount: Double,
      formatFileName_ : Any,
      initialize_ : Any,
      memDelta: Double,
      message: String,
      runTime: Double,
      stackTraceMessage: String,
      testCaseName: String,
      testSuiteName: String,
      wasSuccessful: Boolean
    ): TestResult = {
      val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], formatFileName_ = formatFileName_.asInstanceOf[js.Any], initialize_ = initialize_.asInstanceOf[js.Any], memDelta = memDelta.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], runTime = runTime.asInstanceOf[js.Any], stackTraceMessage = stackTraceMessage.asInstanceOf[js.Any], testCaseName = testCaseName.asInstanceOf[js.Any], testSuiteName = testSuiteName.asInstanceOf[js.Any], wasSuccessful = wasSuccessful.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
      
      inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
      
      inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
      
      inline def setFormatFileName_(value: Any): Self = StObject.set(x, "formatFileName_", value.asInstanceOf[js.Any])
      
      inline def setInitialize_(value: Any): Self = StObject.set(x, "initialize_", value.asInstanceOf[js.Any])
      
      inline def setMemDelta(value: Double): Self = StObject.set(x, "memDelta", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRunTime(value: Double): Self = StObject.set(x, "runTime", value.asInstanceOf[js.Any])
      
      inline def setStackTraceMessage(value: String): Self = StObject.set(x, "stackTraceMessage", value.asInstanceOf[js.Any])
      
      inline def setTestCaseName(value: String): Self = StObject.set(x, "testCaseName", value.asInstanceOf[js.Any])
      
      inline def setTestSuiteName(value: String): Self = StObject.set(x, "testSuiteName", value.asInstanceOf[js.Any])
      
      inline def setWasSuccessful(value: Boolean): Self = StObject.set(x, "wasSuccessful", value.asInstanceOf[js.Any])
    }
  }
}
