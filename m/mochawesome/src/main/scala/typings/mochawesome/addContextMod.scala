package typings.mochawesome

import typings.mocha.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addContextMod {
  
  /**
    * Add context to the test object so it can
    * be displayed in the mochawesome report.
    *
    * **Note**: Arrow function tests are not currently
    * supported, since we depend on the current test
    * context (i.e. `this`)
    *
    * @example
    * it('should test something', function () {
    *   someFunctionThatTestsCode();
    *
    *   addContext(this, 'some context to add');
    *
    *   addContext(this, {
    *     title: 'Expected number of something'
    *     value: 42
    *   });
    *
    *   assert('something');
    * });
    *
    */
  inline def apply(testCtx: Context, context: TestContext): Unit = (^.asInstanceOf[js.Dynamic].apply(testCtx.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mochawesome/addContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type TestContext = String | TestContextObject
  
  trait TestContextObject extends StObject {
    
    var title: String
    
    var value: Any
  }
  object TestContextObject {
    
    inline def apply(title: String, value: Any): TestContextObject = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestContextObject]
    }
    
    extension [Self <: TestContextObject](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
