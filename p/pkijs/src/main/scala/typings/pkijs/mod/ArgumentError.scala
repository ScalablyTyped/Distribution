package typings.pkijs.mod

import org.scalablytyped.runtime.Instantiable1
import typings.pkijs.pkijsStrings.Array
import typings.pkijs.pkijsStrings.ArrayBuffer
import typings.pkijs.pkijsStrings.ArrayBufferView
import typings.pkijs.pkijsStrings.`null`
import typings.pkijs.pkijsStrings.`object`
import typings.pkijs.pkijsStrings.boolean
import typings.pkijs.pkijsStrings.number
import typings.pkijs.pkijsStrings.string
import typings.pkijs.pkijsStrings.undefined
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs", "ArgumentError")
@js.native
open class ArgumentError ()
  extends StObject
     with Error {
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
object ArgumentError {
  
  @JSImport("pkijs", "ArgumentError")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "ArgumentError.NAME")
  @js.native
  val NAME: /* "ArgumentError" */ String = js.native
  
  /* static member */
  inline def assert(value: Any, name: String, `type`: ArgumentType, types: ArgumentType*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")((scala.List(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).`++`(types.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  /* static member */
  inline def assert[T](value: Any, name: String, `type`: Instantiable1[/* args (repeated) */ Any, T]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  /* static member */
  inline def assert_Array(value: Any, name: String, `type`: Array): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(any))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(any))),IArray())))*/ Boolean]
  
  /* static member */
  inline def assert_ArrayBuffer(value: Any, name: String, `type`: ArrayBuffer): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ArrayBuffer))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ArrayBuffer))),IArray())*/ Boolean]
  
  /* static member */
  inline def assert_ArrayBufferView(value: Any, name: String, `type`: ArrayBufferView): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ArrayBufferView))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ArrayBufferView))),IArray())*/ Boolean]
  
  /* static member */
  inline def assert_boolean(value: Any, name: String, `type`: boolean): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())*/ Boolean]
  
  /* static member */
  inline def assert_null(value: Any, name: String, `type`: `null`): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean]
  
  /* static member */
  inline def assert_number(value: Any, name: String, `type`: number): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean]
  
  /* static member */
  inline def assert_object(value: Any, name: String, `type`: `object`): /* asserts value is TsTypeObject(NoComments,IArray(TsMemberIndex(NoComments,false,Default,Dict(TsIdentSimple(key),TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())),Some(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(any))),IArray())))))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeObject(NoComments,IArray(TsMemberIndex(NoComments,false,Default,Dict(TsIdentSimple(key),TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())),Some(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(any))),IArray())))))*/ Boolean]
  
  /* static member */
  inline def assert_string(value: Any, name: String, `type`: string): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean]
  
  /* static member */
  inline def assert_undefined(value: Any, name: String, `type`: undefined): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())*/ Boolean]
  
  /* static member */
  inline def isType(value: Any, `type`: ArgumentType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /* static member */
  inline def isType[T](value: Any, `type`: Instantiable1[/* args (repeated) */ Any, T]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  /* static member */
  inline def isType_Array(value: Any, `type`: Array): /* is std.Array<any> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  /* static member */
  inline def isType_ArrayBuffer(value: Any, `type`: ArrayBuffer): /* is std.ArrayBuffer */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.ArrayBuffer */ Boolean]
  
  /* static member */
  inline def isType_ArrayBufferView(value: Any, `type`: ArrayBufferView): /* is std.ArrayBufferView */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.ArrayBufferView */ Boolean]
  
  /* static member */
  inline def isType_boolean(value: Any, `type`: boolean): /* is boolean */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is boolean */ Boolean]
  
  /* static member */
  inline def isType_null(value: Any, `type`: `null`): /* is null */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is null */ Boolean]
  
  /* static member */
  inline def isType_number(value: Any, `type`: number): /* is number */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is number */ Boolean]
  
  /* static member */
  inline def isType_object(value: Any, `type`: `object`): /* is object */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is object */ Boolean]
  
  /* static member */
  inline def isType_string(value: Any, `type`: string): /* is string */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is string */ Boolean]
  
  /* static member */
  inline def isType_undefined(value: Any, `type`: undefined): /* is undefined */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is undefined */ Boolean]
}
