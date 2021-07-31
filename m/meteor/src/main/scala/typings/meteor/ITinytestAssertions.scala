package typings.meteor

import typings.std.RegExp
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
  
  def include[T](s: String, value: js.Any): Unit = js.native
  def include[T](s: String, value: js.Any, msg: String): Unit = js.native
  def include[T](s: String, value: js.Any, msg: String, not: Boolean): Unit = js.native
  def include[T](s: String, value: js.Any, msg: Unit, not: Boolean): Unit = js.native
  def include[T](s: js.Array[T], value: js.Any): Unit = js.native
  def include[T](s: js.Array[T], value: js.Any, msg: String): Unit = js.native
  def include[T](s: js.Array[T], value: js.Any, msg: String, not: Boolean): Unit = js.native
  def include[T](s: js.Array[T], value: js.Any, msg: Unit, not: Boolean): Unit = js.native
  def include[T](s: js.Object, value: js.Any): Unit = js.native
  def include[T](s: js.Object, value: js.Any, msg: String): Unit = js.native
  def include[T](s: js.Object, value: js.Any, msg: String, not: Boolean): Unit = js.native
  def include[T](s: js.Object, value: js.Any, msg: Unit, not: Boolean): Unit = js.native
  
  def instanceOf(obj: js.Object, klass: js.Function): Unit = js.native
  def instanceOf(obj: js.Object, klass: js.Function, message: String): Unit = js.native
  
  def isFalse(v: Boolean): Unit = js.native
  def isFalse(v: Boolean, msg: String): Unit = js.native
  
  def isNan(v: js.Any): Unit = js.native
  def isNan(v: js.Any, msg: String): Unit = js.native
  
  def isNotNan(v: js.Any): Unit = js.native
  def isNotNan(v: js.Any, msg: String): Unit = js.native
  
  def isNotNull(v: js.Any): Unit = js.native
  def isNotNull(v: js.Any, msg: String): Unit = js.native
  
  def isNotUndefined(v: js.Any): Unit = js.native
  def isNotUndefined(v: js.Any, msg: String): Unit = js.native
  
  def isNull(v: js.Any): Unit = js.native
  def isNull(v: js.Any, msg: String): Unit = js.native
  
  def isTrue(v: Boolean): Unit = js.native
  def isTrue(v: Boolean, msg: String): Unit = js.native
  
  def isUndefined(v: js.Any): Unit = js.native
  def isUndefined(v: js.Any, msg: String): Unit = js.native
  
  def length(obj: ILengthAble, expected_length: Double): Unit = js.native
  def length(obj: ILengthAble, expected_length: Double, msg: String): Unit = js.native
  
  def matches(actual: js.Any, regexp: RegExp): Unit = js.native
  def matches(actual: js.Any, regexp: RegExp, message: String): Unit = js.native
  
  def notEqual[T](actual: T, expected: T): Unit = js.native
  def notEqual[T](actual: T, expected: T, message: String): Unit = js.native
  
  def notInclude[T](s: String, value: js.Any): Unit = js.native
  def notInclude[T](s: String, value: js.Any, msg: String): Unit = js.native
  def notInclude[T](s: String, value: js.Any, msg: String, not: Boolean): Unit = js.native
  def notInclude[T](s: String, value: js.Any, msg: Unit, not: Boolean): Unit = js.native
  def notInclude[T](s: js.Array[T], value: js.Any): Unit = js.native
  def notInclude[T](s: js.Array[T], value: js.Any, msg: String): Unit = js.native
  def notInclude[T](s: js.Array[T], value: js.Any, msg: String, not: Boolean): Unit = js.native
  def notInclude[T](s: js.Array[T], value: js.Any, msg: Unit, not: Boolean): Unit = js.native
  def notInclude[T](s: js.Object, value: js.Any): Unit = js.native
  def notInclude[T](s: js.Object, value: js.Any, msg: String): Unit = js.native
  def notInclude[T](s: js.Object, value: js.Any, msg: String, not: Boolean): Unit = js.native
  def notInclude[T](s: js.Object, value: js.Any, msg: Unit, not: Boolean): Unit = js.native
  
  def notInstanceOf(obj: js.Object, klass: js.Function): Unit = js.native
  def notInstanceOf(obj: js.Object, klass: js.Function, message: String): Unit = js.native
  
  def notMatches(actual: js.Any, regexp: RegExp): Unit = js.native
  def notMatches(actual: js.Any, regexp: RegExp, message: String): Unit = js.native
  
  def ok(doc: js.Object): Unit = js.native
  
  def runId(): String = js.native
  
  def throws(f: js.Function): Unit = js.native
  def throws(f: js.Function, expected: String): Unit = js.native
  def throws(f: js.Function, expected: RegExp): Unit = js.native
}
