package typings.node

import org.scalablytyped.runtime.Instantiable0
import typings.node.anon.Actual
import typings.node.anon.DeepEqual
import typings.node.nodeStrings.ERR_ASSERTION
import typings.node.nodeStrings.deepEqual
import typings.node.nodeStrings.deepStrictEqual
import typings.node.nodeStrings.equal
import typings.node.nodeStrings.ifError
import typings.node.nodeStrings.notDeepEqual
import typings.node.nodeStrings.notEqual
import typings.node.nodeStrings.ok
import typings.node.nodeStrings.strictEqual
import typings.std.Error
import typings.std.Omit
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertMod {
  
  /** An alias of `assert.ok()`. */
  @scala.inline
  def apply(value: js.Any): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  @scala.inline
  def apply(value: js.Any, message: java.lang.String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  @scala.inline
  def apply(value: js.Any, message: Error): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  
  @JSImport("assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("assert", "AssertionError")
  @js.native
  class AssertionError ()
    extends StObject
       with Error {
    def this(options: Actual) = this()
    
    var actual: js.Any = js.native
    
    var code: ERR_ASSERTION = js.native
    
    var expected: js.Any = js.native
    
    var generatedMessage: Boolean = js.native
    
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* CompleteClass */
    var name: java.lang.String = js.native
    
    var operator: java.lang.String = js.native
  }
  
  @JSImport("assert", "CallTracker")
  @js.native
  class CallTracker () extends StObject {
    
    def calls(): js.Function0[Unit] = js.native
    def calls(exact: Double): js.Function0[Unit] = js.native
    def calls[Func /* <: js.Function1[/* repeated */ js.Any, js.Any] */](fn: Func): Func = js.native
    def calls[Func /* <: js.Function1[/* repeated */ js.Any, js.Any] */](fn: Func, exact: Double): Func = js.native
    def calls[Func /* <: js.Function1[/* repeated */ js.Any, js.Any] */](fn: Unit, exact: Double): Func = js.native
    @JSName("calls")
    def calls_Func_Function1AnyAny_Func[Func /* <: js.Function1[/* repeated */ js.Any, js.Any] */](): Func = js.native
    
    def report(): js.Array[CallTrackerReportInformation] = js.native
    
    def verify(): Unit = js.native
  }
  
  /** @deprecated since v9.9.0 - use deepStrictEqual() instead. */
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deepStrictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  @scala.inline
  def deepStrictEqual[T](actual: js.Any, expected: T, message: java.lang.String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  @scala.inline
  def deepStrictEqual[T](actual: js.Any, expected: T, message: Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  @scala.inline
  def doesNotMatch(value: java.lang.String, regExp: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotMatch")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotMatch(value: java.lang.String, regExp: RegExp, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotMatch")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotMatch(value: java.lang.String, regExp: RegExp, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotMatch")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def doesNotReject(block: js.Function0[js.Promise[js.Any]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Function0[js.Promise[js.Any]], error: js.Function): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Function0[js.Promise[js.Any]], error: js.Function, message: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Function0[js.Promise[js.Any]], error: js.Function, message: Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Function0[js.Promise[js.Any]], error: RegExp): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Function0[js.Promise[js.Any]], error: RegExp, message: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Function0[js.Promise[js.Any]], error: RegExp, message: Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Function0[js.Promise[js.Any]], message: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Function0[js.Promise[js.Any]], message: Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Promise[js.Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Promise[js.Any], error: js.Function): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Promise[js.Any], error: js.Function, message: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Promise[js.Any], error: js.Function, message: Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Promise[js.Any], error: RegExp): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Promise[js.Any], error: RegExp, message: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Promise[js.Any], error: RegExp, message: Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Promise[js.Any], message: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def doesNotReject(block: js.Promise[js.Any], message: Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def doesNotThrow(block: js.Function0[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[js.Any], error: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[js.Any], error: js.Function, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[js.Any], error: js.Function, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[js.Any], error: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[js.Any], error: RegExp, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[js.Any], error: RegExp, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[js.Any], message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[js.Any], message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated since v9.9.0 - use strictEqual() instead. */
  @scala.inline
  def equal(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def equal(actual: js.Any, expected: js.Any, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fail(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[scala.Nothing]
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  @scala.inline
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: Unit,
    stackStartFn: js.Function
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: Unit, operator: java.lang.String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: Unit,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: Unit, operator: Unit, stackStartFn: js.Function): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: Error): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: Error, operator: java.lang.String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: Error,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: Error, operator: Unit, stackStartFn: js.Function): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(message: java.lang.String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(message: Error): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ifError(value: js.Any): js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ]]
  
  @scala.inline
  def `match`(value: java.lang.String, regExp: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def `match`(value: java.lang.String, regExp: RegExp, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def `match`(value: java.lang.String, regExp: RegExp, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated since v9.9.0 - use notDeepStrictEqual() instead. */
  @scala.inline
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notDeepEqual(actual: js.Any, expected: js.Any, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated since v9.9.0 - use notStrictEqual() instead. */
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ok(value: js.Any): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  @scala.inline
  def ok(value: js.Any, message: java.lang.String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  @scala.inline
  def ok(value: js.Any, message: Error): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  
  @scala.inline
  def rejects(block: js.Function0[js.Promise[js.Any]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Function0[js.Promise[js.Any]], error: AssertPredicate): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Function0[js.Promise[js.Any]], error: AssertPredicate, message: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Function0[js.Promise[js.Any]], error: AssertPredicate, message: Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Function0[js.Promise[js.Any]], message: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Function0[js.Promise[js.Any]], message: Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Promise[js.Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Promise[js.Any], error: AssertPredicate): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Promise[js.Any], error: AssertPredicate, message: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Promise[js.Any], error: AssertPredicate, message: Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Promise[js.Any], message: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rejects(block: js.Promise[js.Any], message: Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("assert", "strict")
  @js.native
  val strict: (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ js.Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | typings.node.nodeStrings.strict
  ]) & DeepEqual = js.native
  
  @scala.inline
  def strictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  @scala.inline
  def strictEqual[T](actual: js.Any, expected: T, message: java.lang.String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  @scala.inline
  def strictEqual[T](actual: js.Any, expected: T, message: Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  @scala.inline
  def throws(block: js.Function0[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[js.Any], error: AssertPredicate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[js.Any], error: AssertPredicate, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[js.Any], error: AssertPredicate, message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[js.Any], message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[js.Any], message: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AssertPredicate = RegExp | Instantiable0[js.Object] | (js.Function1[/* thrown */ js.Any, Boolean]) | js.Object | Error
  
  trait CallTrackerReportInformation extends StObject {
    
    /** The actual number of times the function was called. */
    var actual: Double
    
    /** The number of times the function was expected to be called. */
    var expected: Double
    
    var message: java.lang.String
    
    /** The name of the function that is wrapped. */
    var operator: java.lang.String
    
    /** A stack trace of the function. */
    var stack: js.Object
  }
  object CallTrackerReportInformation {
    
    @scala.inline
    def apply(
      actual: Double,
      expected: Double,
      message: java.lang.String,
      operator: java.lang.String,
      stack: js.Object
    ): CallTrackerReportInformation = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallTrackerReportInformation]
    }
    
    @scala.inline
    implicit class CallTrackerReportInformationMutableBuilder[Self <: CallTrackerReportInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActual(value: Double): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpected(value: Double): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(value: java.lang.String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.Object): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
