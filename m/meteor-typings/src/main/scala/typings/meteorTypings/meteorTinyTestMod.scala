package typings.meteorTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorTinyTestMod {
  
  object Tinytest {
    
    @JSImport("meteor/tiny-test", "Tinytest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(
      description: String,
      func: js.Function1[/* test */ typings.meteorTypings.meteorTinyTestMod.ITinytestAssertions, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(description.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addAsync(
      description: String,
      func: js.Function1[/* test */ typings.meteorTypings.meteorTinyTestMod.ITinytestAssertions, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAsync")(description.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait ILengthAble extends StObject {
    
    var length: Double
  }
  object ILengthAble {
    
    inline def apply(length: Double): typings.meteorTypings.meteorTinyTestMod.ILengthAble = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteorTypings.meteorTinyTestMod.ILengthAble]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.meteorTypings.meteorTinyTestMod.ILengthAble] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITinytestAssertions extends StObject {
    
    def _stringEqual(actual: String, expected: String): Unit = js.native
    def _stringEqual(actual: String, expected: String, msg: String): Unit = js.native
    
    def equal[T](actual: T, expected: T): Unit = js.native
    def equal[T](actual: T, expected: T, message: String): Unit = js.native
    def equal[T](actual: T, expected: T, message: String, not: Boolean): Unit = js.native
    def equal[T](actual: T, expected: T, message: Unit, not: Boolean): Unit = js.native
    
    def expect_fail(): Unit = js.native
    
    def fail(doc: js.Object): Unit = js.native
    
    def include[T](s: String, value: Any): Unit = js.native
    def include[T](s: String, value: Any, msg: String): Unit = js.native
    def include[T](s: String, value: Any, msg: String, not: Boolean): Unit = js.native
    def include[T](s: String, value: Any, msg: Unit, not: Boolean): Unit = js.native
    def include[T](s: js.Array[T], value: Any): Unit = js.native
    def include[T](s: js.Array[T], value: Any, msg: String): Unit = js.native
    def include[T](s: js.Array[T], value: Any, msg: String, not: Boolean): Unit = js.native
    def include[T](s: js.Array[T], value: Any, msg: Unit, not: Boolean): Unit = js.native
    def include[T](s: js.Object, value: Any): Unit = js.native
    def include[T](s: js.Object, value: Any, msg: String): Unit = js.native
    def include[T](s: js.Object, value: Any, msg: String, not: Boolean): Unit = js.native
    def include[T](s: js.Object, value: Any, msg: Unit, not: Boolean): Unit = js.native
    
    def instanceOf(obj: js.Object, klass: js.Function): Unit = js.native
    def instanceOf(obj: js.Object, klass: js.Function, message: String): Unit = js.native
    
    def isFalse(v: Boolean): Unit = js.native
    def isFalse(v: Boolean, msg: String): Unit = js.native
    
    def isNan(v: Any): Unit = js.native
    def isNan(v: Any, msg: String): Unit = js.native
    
    def isNotNan(v: Any): Unit = js.native
    def isNotNan(v: Any, msg: String): Unit = js.native
    
    def isNotNull(v: Any): Unit = js.native
    def isNotNull(v: Any, msg: String): Unit = js.native
    
    def isNotUndefined(v: Any): Unit = js.native
    def isNotUndefined(v: Any, msg: String): Unit = js.native
    
    def isNull(v: Any): Unit = js.native
    def isNull(v: Any, msg: String): Unit = js.native
    
    def isTrue(v: Boolean): Unit = js.native
    def isTrue(v: Boolean, msg: String): Unit = js.native
    
    def isUndefined(v: Any): Unit = js.native
    def isUndefined(v: Any, msg: String): Unit = js.native
    
    def length(obj: typings.meteorTypings.meteorTinyTestMod.ILengthAble, expected_length: Double): Unit = js.native
    def length(obj: typings.meteorTypings.meteorTinyTestMod.ILengthAble, expected_length: Double, msg: String): Unit = js.native
    
    def matches(actual: Any, regexp: js.RegExp): Unit = js.native
    def matches(actual: Any, regexp: js.RegExp, message: String): Unit = js.native
    
    def notEqual[T](actual: T, expected: T): Unit = js.native
    def notEqual[T](actual: T, expected: T, message: String): Unit = js.native
    
    def notInclude[T](s: String, value: Any): Unit = js.native
    def notInclude[T](s: String, value: Any, msg: String): Unit = js.native
    def notInclude[T](s: String, value: Any, msg: String, not: Boolean): Unit = js.native
    def notInclude[T](s: String, value: Any, msg: Unit, not: Boolean): Unit = js.native
    def notInclude[T](s: js.Array[T], value: Any): Unit = js.native
    def notInclude[T](s: js.Array[T], value: Any, msg: String): Unit = js.native
    def notInclude[T](s: js.Array[T], value: Any, msg: String, not: Boolean): Unit = js.native
    def notInclude[T](s: js.Array[T], value: Any, msg: Unit, not: Boolean): Unit = js.native
    def notInclude[T](s: js.Object, value: Any): Unit = js.native
    def notInclude[T](s: js.Object, value: Any, msg: String): Unit = js.native
    def notInclude[T](s: js.Object, value: Any, msg: String, not: Boolean): Unit = js.native
    def notInclude[T](s: js.Object, value: Any, msg: Unit, not: Boolean): Unit = js.native
    
    def notInstanceOf(obj: js.Object, klass: js.Function): Unit = js.native
    def notInstanceOf(obj: js.Object, klass: js.Function, message: String): Unit = js.native
    
    def notMatches(actual: Any, regexp: js.RegExp): Unit = js.native
    def notMatches(actual: Any, regexp: js.RegExp, message: String): Unit = js.native
    
    def ok(doc: js.Object): Unit = js.native
    
    def runId(): String = js.native
    
    def throws(f: js.Function): Unit = js.native
    def throws(f: js.Function, expected: String): Unit = js.native
    def throws(f: js.Function, expected: js.RegExp): Unit = js.native
  }
}
