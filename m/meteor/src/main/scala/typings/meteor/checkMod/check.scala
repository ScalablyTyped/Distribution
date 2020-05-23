package typings.meteor.checkMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.meteor.checkMod.Match.Matcher
import typings.meteor.checkMod.Match.Pattern
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import typings.std.global.Function
import typings.std.global.Number
import typings.std.global.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/check", "check")
@js.native
object check extends js.Object {
  def apply(value: js.Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean = js.native
  def apply(value: js.Any, pattern: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())))*/ Boolean = js.native
  def apply(value: js.Any, pattern: Boolean): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())))*/ Boolean = js.native
  def apply(value: js.Any, pattern: Double): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())))*/ Boolean = js.native
  def apply[T /* <: (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (ObjectConstructor with Instantiable0[Object]) | (FunctionConstructor with (Instantiable1[/* args (repeated) */ String, Function])) | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](value: js.Any, pattern: T): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
}

