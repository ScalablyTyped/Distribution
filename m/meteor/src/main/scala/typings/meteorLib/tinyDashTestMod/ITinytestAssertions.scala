package typings
package meteorLib.tinyDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITinytestAssertions extends js.Object {
  def _stringEqual(actual: java.lang.String, expected: java.lang.String): scala.Unit = js.native
  def _stringEqual(actual: java.lang.String, expected: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def equal[T](actual: T, expected: T): scala.Unit = js.native
  def equal[T](actual: T, expected: T, message: java.lang.String): scala.Unit = js.native
  def equal[T](actual: T, expected: T, message: java.lang.String, not: scala.Boolean): scala.Unit = js.native
  def expect_fail(): scala.Unit = js.native
  def fail(doc: js.Object): scala.Unit = js.native
  def include[T](s: java.lang.String, value: js.Any): scala.Unit = js.native
  def include[T](s: java.lang.String, value: js.Any, msg: java.lang.String): scala.Unit = js.native
  def include[T](s: java.lang.String, value: js.Any, msg: java.lang.String, not: scala.Boolean): scala.Unit = js.native
  def include[T](s: js.Array[T], value: js.Any): scala.Unit = js.native
  def include[T](s: js.Array[T], value: js.Any, msg: java.lang.String): scala.Unit = js.native
  def include[T](s: js.Array[T], value: js.Any, msg: java.lang.String, not: scala.Boolean): scala.Unit = js.native
  def include[T](s: js.Object, value: js.Any): scala.Unit = js.native
  def include[T](s: js.Object, value: js.Any, msg: java.lang.String): scala.Unit = js.native
  def include[T](s: js.Object, value: js.Any, msg: java.lang.String, not: scala.Boolean): scala.Unit = js.native
  def instanceOf(obj: js.Object, klass: js.Function): scala.Unit = js.native
  def instanceOf(obj: js.Object, klass: js.Function, message: java.lang.String): scala.Unit = js.native
  def isFalse(v: scala.Boolean): scala.Unit = js.native
  def isFalse(v: scala.Boolean, msg: java.lang.String): scala.Unit = js.native
  def isNan(v: js.Any): scala.Unit = js.native
  def isNan(v: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotNan(v: js.Any): scala.Unit = js.native
  def isNotNan(v: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotNull(v: js.Any): scala.Unit = js.native
  def isNotNull(v: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotUndefined(v: js.Any): scala.Unit = js.native
  def isNotUndefined(v: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNull(v: js.Any): scala.Unit = js.native
  def isNull(v: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isTrue(v: scala.Boolean): scala.Unit = js.native
  def isTrue(v: scala.Boolean, msg: java.lang.String): scala.Unit = js.native
  def isUndefined(v: js.Any): scala.Unit = js.native
  def isUndefined(v: js.Any, msg: java.lang.String): scala.Unit = js.native
  def length(obj: ILengthAble, expected_length: scala.Double): scala.Unit = js.native
  def length(obj: ILengthAble, expected_length: scala.Double, msg: java.lang.String): scala.Unit = js.native
  def matches(actual: js.Any, regexp: stdLib.RegExp): scala.Unit = js.native
  def matches(actual: js.Any, regexp: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def notEqual[T](actual: T, expected: T): scala.Unit = js.native
  def notEqual[T](actual: T, expected: T, message: java.lang.String): scala.Unit = js.native
  def notInclude[T](s: java.lang.String, value: js.Any): scala.Unit = js.native
  def notInclude[T](s: java.lang.String, value: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notInclude[T](s: java.lang.String, value: js.Any, msg: java.lang.String, not: scala.Boolean): scala.Unit = js.native
  def notInclude[T](s: js.Array[T], value: js.Any): scala.Unit = js.native
  def notInclude[T](s: js.Array[T], value: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notInclude[T](s: js.Array[T], value: js.Any, msg: java.lang.String, not: scala.Boolean): scala.Unit = js.native
  def notInclude[T](s: js.Object, value: js.Any): scala.Unit = js.native
  def notInclude[T](s: js.Object, value: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notInclude[T](s: js.Object, value: js.Any, msg: java.lang.String, not: scala.Boolean): scala.Unit = js.native
  def notInstanceOf(obj: js.Object, klass: js.Function): scala.Unit = js.native
  def notInstanceOf(obj: js.Object, klass: js.Function, message: java.lang.String): scala.Unit = js.native
  def notMatches(actual: js.Any, regexp: stdLib.RegExp): scala.Unit = js.native
  def notMatches(actual: js.Any, regexp: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def ok(doc: js.Object): scala.Unit = js.native
  def runId(): java.lang.String = js.native
  def throws(f: js.Function): scala.Unit = js.native
  def throws(f: js.Function, expected: java.lang.String): scala.Unit = js.native
  def throws(f: js.Function, expected: stdLib.RegExp): scala.Unit = js.native
}

