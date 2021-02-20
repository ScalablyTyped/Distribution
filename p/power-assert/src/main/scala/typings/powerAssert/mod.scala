package typings.powerAssert

import org.scalablytyped.runtime.Instantiable1
import typings.powerAssert.anon.Actual
import typings.powerAssert.anon.FnCall
import typings.powerAssert.anon.TypeofpowerAssert
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("power-assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any): Unit = js.native
  @JSImport("power-assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, message: String): Unit = js.native
  
  @JSImport("power-assert", "AssertionError")
  @js.native
  class AssertionError () extends Error {
    def this(options: Actual) = this()
    
    var actual: js.Any = js.native
    
    var expected: js.Any = js.native
    
    var generatedMessage: Boolean = js.native
    
    var operator: String = js.native
  }
  
  @JSImport("power-assert", "customize")
  @js.native
  def customize(options: Options): TypeofpowerAssert = js.native
  
  @JSImport("power-assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("power-assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("power-assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("power-assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("power-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function): Unit = js.native
  @JSImport("power-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: js.Function): Unit = js.native
  @JSImport("power-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  @JSImport("power-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  @JSImport("power-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: js.Function, message: String): Unit = js.native
  @JSImport("power-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: RegExp): Unit = js.native
  @JSImport("power-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: RegExp, message: String): Unit = js.native
  @JSImport("power-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, message: String): Unit = js.native
  
  @JSImport("power-assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("power-assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("power-assert", "fail")
  @js.native
  def fail(): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: String,
    operator: String
  ): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.Any): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String, operator: String): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
  @JSImport("power-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  
  @JSImport("power-assert", "ifError")
  @js.native
  def ifError(value: js.Any): Unit = js.native
  
  @JSImport("power-assert", "notDeepEqual")
  @js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any): Unit = js.native
  @JSImport("power-assert", "notDeepEqual")
  @js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("power-assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("power-assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("power-assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("power-assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("power-assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("power-assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("power-assert", "ok")
  @js.native
  def ok(value: js.Any): Unit = js.native
  @JSImport("power-assert", "ok")
  @js.native
  def ok(value: js.Any, message: String): Unit = js.native
  
  object strict {
    
    @JSImport("power-assert", "strict")
    @js.native
    def apply(value: js.Any): Unit = js.native
    @JSImport("power-assert", "strict")
    @js.native
    def apply(value: js.Any, message: String): Unit = js.native
    @JSImport("power-assert", "strict")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("power-assert", "strict.AssertionError")
    @js.native
    def AssertionError: Instantiable1[/* options */ js.UndefOr[Actual], typings.powerAssert.mod.AssertionError] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("power-assert", "strict.AssertionError")
    @js.native
    class AssertionErrorCls () extends AssertionError {
      def this(options: Actual) = this()
    }
    
    @scala.inline
    def AssertionError_=(x: Instantiable1[/* options */ js.UndefOr[Actual], AssertionError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AssertionError")(x.asInstanceOf[js.Any])
    
    @JSImport("power-assert", "strict.customize")
    @js.native
    def customize(options: Options): /* import warning: importer.ImportType#apply Failed type conversion: typeof assert */ js.Any = js.native
    
    @JSImport("power-assert", "strict.deepEqual")
    @js.native
    def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("power-assert", "strict.deepEqual")
    @js.native
    def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    @JSImport("power-assert", "strict.deepStrictEqual")
    @js.native
    def deepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("power-assert", "strict.deepStrictEqual")
    @js.native
    def deepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    @JSImport("power-assert", "strict.doesNotThrow")
    @js.native
    def doesNotThrow: FnCall = js.native
    @JSImport("power-assert", "strict.doesNotThrow")
    @js.native
    def doesNotThrow(block: js.Function): Unit = js.native
    @JSImport("power-assert", "strict.doesNotThrow")
    @js.native
    def doesNotThrow(block: js.Function, error: js.Function): Unit = js.native
    @JSImport("power-assert", "strict.doesNotThrow")
    @js.native
    def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
    @JSImport("power-assert", "strict.doesNotThrow")
    @js.native
    def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
    @JSImport("power-assert", "strict.doesNotThrow")
    @js.native
    def doesNotThrow(block: js.Function, error: js.Function, message: String): Unit = js.native
    @JSImport("power-assert", "strict.doesNotThrow")
    @js.native
    def doesNotThrow(block: js.Function, error: RegExp): Unit = js.native
    @JSImport("power-assert", "strict.doesNotThrow")
    @js.native
    def doesNotThrow(block: js.Function, error: RegExp, message: String): Unit = js.native
    @JSImport("power-assert", "strict.doesNotThrow")
    @js.native
    def doesNotThrow(block: js.Function, message: String): Unit = js.native
    @scala.inline
    def doesNotThrow_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doesNotThrow")(x.asInstanceOf[js.Any])
    
    @JSImport("power-assert", "strict.equal")
    @js.native
    def equal(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("power-assert", "strict.equal")
    @js.native
    def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.UndefOr[scala.Nothing],
      message: js.UndefOr[scala.Nothing],
      operator: String
    ): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.UndefOr[scala.Nothing],
      message: String,
      operator: String
    ): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.Any,
      message: js.UndefOr[scala.Nothing],
      operator: String
    ): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String, operator: String): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.Any): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(
      actual: js.Any,
      expected: js.UndefOr[scala.Nothing],
      message: js.UndefOr[scala.Nothing],
      operator: String
    ): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String, operator: String): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
    @JSImport("power-assert", "strict.fail")
    @js.native
    def fail(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = js.native
    
    @JSImport("power-assert", "strict.ifError")
    @js.native
    def ifError(value: js.Any): Unit = js.native
    
    @JSImport("power-assert", "strict.notDeepEqual")
    @js.native
    def notDeepEqual(acutal: js.Any, expected: js.Any): Unit = js.native
    @JSImport("power-assert", "strict.notDeepEqual")
    @js.native
    def notDeepEqual(acutal: js.Any, expected: js.Any, message: String): Unit = js.native
    
    @JSImport("power-assert", "strict.notDeepStrictEqual")
    @js.native
    def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("power-assert", "strict.notDeepStrictEqual")
    @js.native
    def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    @JSImport("power-assert", "strict.notEqual")
    @js.native
    def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("power-assert", "strict.notEqual")
    @js.native
    def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    @JSImport("power-assert", "strict.notStrictEqual")
    @js.native
    def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("power-assert", "strict.notStrictEqual")
    @js.native
    def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    @JSImport("power-assert", "strict.ok")
    @js.native
    def ok(value: js.Any): Unit = js.native
    @JSImport("power-assert", "strict.ok")
    @js.native
    def ok(value: js.Any, message: String): Unit = js.native
    
    @JSImport("power-assert", "strict.strict")
    @js.native
    val strict: /* import warning: importer.ImportType#apply Failed type conversion: typeof assert */ js.Any = js.native
    
    @JSImport("power-assert", "strict.strictEqual")
    @js.native
    def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("power-assert", "strict.strictEqual")
    @js.native
    def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    @JSImport("power-assert", "strict.throws")
    @js.native
    def throws: FnCall = js.native
    @JSImport("power-assert", "strict.throws")
    @js.native
    def throws(block: js.Function): Unit = js.native
    @JSImport("power-assert", "strict.throws")
    @js.native
    def throws(block: js.Function, error: js.Function): Unit = js.native
    @JSImport("power-assert", "strict.throws")
    @js.native
    def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
    @JSImport("power-assert", "strict.throws")
    @js.native
    def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
    @JSImport("power-assert", "strict.throws")
    @js.native
    def throws(block: js.Function, error: js.Function, message: String): Unit = js.native
    @JSImport("power-assert", "strict.throws")
    @js.native
    def throws(block: js.Function, error: RegExp): Unit = js.native
    @JSImport("power-assert", "strict.throws")
    @js.native
    def throws(block: js.Function, error: RegExp, message: String): Unit = js.native
    @JSImport("power-assert", "strict.throws")
    @js.native
    def throws(block: js.Function, message: String): Unit = js.native
    @scala.inline
    def throws_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("throws")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("power-assert", "strictEqual")
  @js.native
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("power-assert", "strictEqual")
  @js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("power-assert", "throws")
  @js.native
  def throws(block: js.Function): Unit = js.native
  @JSImport("power-assert", "throws")
  @js.native
  def throws(block: js.Function, error: js.Function): Unit = js.native
  @JSImport("power-assert", "throws")
  @js.native
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  @JSImport("power-assert", "throws")
  @js.native
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  @JSImport("power-assert", "throws")
  @js.native
  def throws(block: js.Function, error: js.Function, message: String): Unit = js.native
  @JSImport("power-assert", "throws")
  @js.native
  def throws(block: js.Function, error: RegExp): Unit = js.native
  @JSImport("power-assert", "throws")
  @js.native
  def throws(block: js.Function, error: RegExp, message: String): Unit = js.native
  @JSImport("power-assert", "throws")
  @js.native
  def throws(block: js.Function, message: String): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var assertion: js.UndefOr[typings.empower.mod.Options] = js.native
    
    var output: js.UndefOr[typings.powerAssertFormatter.mod.Options] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssertion(value: typings.empower.mod.Options): Self = StObject.set(x, "assertion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssertionUndefined: Self = StObject.set(x, "assertion", js.undefined)
      
      @scala.inline
      def setOutput(value: typings.powerAssertFormatter.mod.Options): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
}
