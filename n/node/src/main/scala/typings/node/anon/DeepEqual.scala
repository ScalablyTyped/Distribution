package typings.node.anon

import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepEqual extends StObject {
  
  def apply(value: Any): /* asserts value */ Boolean = js.native
  def apply(value: Any, message: String): /* asserts value */ Boolean = js.native
  def apply(value: Any, message: js.Error): /* asserts value */ Boolean = js.native
  
  def deepEqual[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def deepEqual[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def deepEqual[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSName("deepEqual")
  var deepEqual_Original: FnCall = js.native
  
  def deepStrictEqual[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def deepStrictEqual[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def deepStrictEqual[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSName("deepStrictEqual")
  var deepStrictEqual_Original: FnCall = js.native
  
  def equal[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def equal[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def equal[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSName("equal")
  var equal_Original: FnCall = js.native
  
  def ifError(value: Any): /* asserts value is TsTypeUnion(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean = js.native
  @JSName("ifError")
  var ifError_Original: js.Function1[
    /* value */ Any, 
    /* asserts value is TsTypeUnion(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean
  ] = js.native
  
  def notDeepEqual(actual: Any, expected: Any): Unit = js.native
  def notDeepEqual(actual: Any, expected: Any, message: String): Unit = js.native
  def notDeepEqual(actual: Any, expected: Any, message: js.Error): Unit = js.native
  @JSName("notDeepEqual")
  var notDeepEqual_Original: js.Function3[
    /* actual */ Any, 
    /* expected */ Any, 
    /* message */ js.UndefOr[String | js.Error], 
    Unit
  ] = js.native
  
  def notEqual(actual: Any, expected: Any): Unit = js.native
  def notEqual(actual: Any, expected: Any, message: String): Unit = js.native
  def notEqual(actual: Any, expected: Any, message: js.Error): Unit = js.native
  @JSName("notEqual")
  var notEqual_Original: js.Function3[
    /* actual */ Any, 
    /* expected */ Any, 
    /* message */ js.UndefOr[String | js.Error], 
    Unit
  ] = js.native
  
  // Mapped types and assertion functions are incompatible?
  // TS2775: Assertions require every name in the call target
  // to be declared with an explicit type annotation.
  def ok(value: Any): /* asserts value */ Boolean = js.native
  def ok(value: Any, message: String): /* asserts value */ Boolean = js.native
  def ok(value: Any, message: js.Error): /* asserts value */ Boolean = js.native
  // Mapped types and assertion functions are incompatible?
  // TS2775: Assertions require every name in the call target
  // to be declared with an explicit type annotation.
  @JSName("ok")
  var ok_Original: js.Function2[
    /* value */ Any, 
    /* message */ js.UndefOr[String | js.Error], 
    /* asserts value */ Boolean
  ] = js.native
  
  def strict(value: Any): /* asserts value */ Boolean = js.native
  def strict(value: Any, message: String): /* asserts value */ Boolean = js.native
  def strict(value: Any, message: js.Error): /* asserts value */ Boolean = js.native
  
  def strictEqual[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def strictEqual[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def strictEqual[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSName("strictEqual")
  var strictEqual_Original: FnCall = js.native
  
  @JSName("strict")
  var strict_Original: (Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof assert */ js.Any, 
    "equal" | "notEqual" | "deepEqual" | "notDeepEqual" | "ok" | "strictEqual" | "deepStrictEqual" | "ifError" | "strict"
  ]) & Call = js.native
}
