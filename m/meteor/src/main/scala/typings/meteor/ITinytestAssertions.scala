package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def length(obj: ILengthAble, expected_length: Double): Unit = js.native
  def length(obj: ILengthAble, expected_length: Double, msg: String): Unit = js.native
  
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
