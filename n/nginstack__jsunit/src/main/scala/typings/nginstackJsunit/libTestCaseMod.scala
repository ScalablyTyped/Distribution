package typings.nginstackJsunit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestCaseMod {
  
  inline def apply(testSuite: Any, methodName: String, event: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(testSuite.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/jsunit/lib/TestCase", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TestCase {
    def this(testSuite: Any, methodName: String, event: Any) = this()
    
    /* CompleteClass */
    var event: Any = js.native
    
    /* CompleteClass */
    override def getId(): String = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    var methodName: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var testSuite: TestSuite = js.native
  }
  @JSImport("@nginstack/jsunit/lib/TestCase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TestCase extends StObject {
    
    var event: Any
    
    def getId(): String
    
    /* private */ var logger_ : Any
    
    var methodName: String
    
    var name: String
    
    var testSuite: TestSuite
  }
  object TestCase {
    
    inline def apply(
      event: Any,
      getId: () => String,
      logger_ : Any,
      methodName: String,
      name: String,
      testSuite: TestSuite
    ): TestCase = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], getId = js.Any.fromFunction0(getId), logger_ = logger_.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], testSuite = testSuite.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestCase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestCase] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTestSuite(value: TestSuite): Self = StObject.set(x, "testSuite", value.asInstanceOf[js.Any])
    }
  }
  
  type TestSuite = typings.nginstackJsunit.libTestSuiteMod.^
}
