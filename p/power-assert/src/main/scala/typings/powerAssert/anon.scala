package typings.powerAssert

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.powerAssert.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actual extends StObject {
    
    var actual: js.UndefOr[Any] = js.undefined
    
    var expected: js.UndefOr[Any] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var operator: js.UndefOr[String] = js.undefined
    
    var stackStartFunction: js.UndefOr[js.Function0[js.UndefOr[Unit]]] = js.undefined
  }
  object Actual {
    
    inline def apply(): Actual = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actual]
    }
    
    extension [Self <: Actual](x: Self) {
      
      inline def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      inline def setExpected(value: Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setStackStartFunction(value: () => js.UndefOr[Unit]): Self = StObject.set(x, "stackStartFunction", js.Any.fromFunction0(value))
      
      inline def setStackStartFunctionUndefined: Self = StObject.set(x, "stackStartFunction", js.undefined)
    }
  }
  
  @js.native
  trait TypeofpowerAssert extends StObject {
    
    def apply(value: Any): Unit = js.native
    def apply(value: Any, message: String): Unit = js.native
    
    var AssertionError: Instantiable1[/* options */ js.UndefOr[Actual], typings.powerAssert.mod.AssertionError] = js.native
    
    def customize(options: Options): /* import warning: importer.ImportType#apply Failed type conversion: typeof assert */ js.Any = js.native
    
    def deepEqual(actual: Any, expected: Any): Unit = js.native
    def deepEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def deepStrictEqual(actual: Any, expected: Any): Unit = js.native
    def deepStrictEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def doesNotThrow(block: js.Function0[Any]): Unit = js.native
    def doesNotThrow(block: js.Function0[Any], error: js.Function1[/* err */ Any, Boolean]): Unit = js.native
    def doesNotThrow(block: js.Function0[Any], error: js.Function1[/* err */ Any, Boolean], message: String): Unit = js.native
    def doesNotThrow(block: js.Function0[Any], error: js.RegExp): Unit = js.native
    def doesNotThrow(block: js.Function0[Any], error: js.RegExp, message: String): Unit = js.native
    def doesNotThrow(block: js.Function0[Any], error: Instantiable0[js.Object]): Unit = js.native
    def doesNotThrow(block: js.Function0[Any], error: Instantiable0[js.Object], message: String): Unit = js.native
    def doesNotThrow(block: js.Function0[Any], message: String): Unit = js.native
    
    def equal(actual: Any, expected: Any): Unit = js.native
    def equal(actual: Any, expected: Any, message: String): Unit = js.native
    
    def fail(): scala.Nothing = js.native
    def fail(actual: Any): scala.Nothing = js.native
    def fail(actual: Any, expected: Any): scala.Nothing = js.native
    def fail(actual: Any, expected: Any, message: String): scala.Nothing = js.native
    def fail(actual: Any, expected: Any, message: String, operator: String): scala.Nothing = js.native
    def fail(actual: Any, expected: Any, message: Unit, operator: String): scala.Nothing = js.native
    def fail(actual: Any, expected: Unit, message: String): scala.Nothing = js.native
    def fail(actual: Any, expected: Unit, message: String, operator: String): scala.Nothing = js.native
    def fail(actual: Any, expected: Unit, message: Unit, operator: String): scala.Nothing = js.native
    def fail(actual: Unit, expected: Any): scala.Nothing = js.native
    def fail(actual: Unit, expected: Any, message: String): scala.Nothing = js.native
    def fail(actual: Unit, expected: Any, message: String, operator: String): scala.Nothing = js.native
    def fail(actual: Unit, expected: Any, message: Unit, operator: String): scala.Nothing = js.native
    def fail(actual: Unit, expected: Unit, message: String): scala.Nothing = js.native
    def fail(actual: Unit, expected: Unit, message: String, operator: String): scala.Nothing = js.native
    def fail(actual: Unit, expected: Unit, message: Unit, operator: String): scala.Nothing = js.native
    
    def ifError(value: Any): js.UndefOr[Unit] = js.native
    
    def notDeepEqual(actual: Any, expected: Any): Unit = js.native
    def notDeepEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def notDeepStrictEqual(actual: Any, expected: Any): Unit = js.native
    def notDeepStrictEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def notEqual(actual: Any, expected: Any): Unit = js.native
    def notEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def notStrictEqual(actual: Any, expected: Any): Unit = js.native
    def notStrictEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def ok(value: Any): Unit = js.native
    def ok(value: Any, message: String): Unit = js.native
    
    def strictEqual(actual: Any, expected: Any): Unit = js.native
    def strictEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def throws(block: js.Function0[Any]): Unit = js.native
    def throws(block: js.Function0[Any], error: js.Function1[/* err */ Any, Boolean]): Unit = js.native
    def throws(block: js.Function0[Any], error: js.Function1[/* err */ Any, Boolean], message: String): Unit = js.native
    def throws(block: js.Function0[Any], error: js.RegExp): Unit = js.native
    def throws(block: js.Function0[Any], error: js.RegExp, message: String): Unit = js.native
    def throws(block: js.Function0[Any], error: Instantiable0[js.Object]): Unit = js.native
    def throws(block: js.Function0[Any], error: Instantiable0[js.Object], message: String): Unit = js.native
    def throws(block: js.Function0[Any], message: String): Unit = js.native
  }
}
