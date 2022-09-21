package typings.mochaEach

import typings.mocha.mod.Context
import typings.mocha.mod.Suite_
import typings.mocha.mod.Test_
import typings.mochaEach.mod.ForEachDescribeDefinition
import typings.mochaEach.mod.ForEachTestFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Describe extends StObject {
    
    def describe(expectation: String): Suite_
    def describe(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ Any, Any]): Suite_
    @JSName("describe")
    var describe_Original: ForEachDescribeDefinition
    
    def it(expectation: String): Test_
    def it(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ Any, Any]): Test_
    @JSName("it")
    var it_Original: ForEachTestFunction
  }
  object Describe {
    
    inline def apply(describe: ForEachDescribeDefinition, it: ForEachTestFunction): Describe = {
      val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any])
      __obj.asInstanceOf[Describe]
    }
    
    extension [Self <: Describe](x: Self) {
      
      inline def setDescribe(value: ForEachDescribeDefinition): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setIt(value: ForEachTestFunction): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
    }
  }
}
