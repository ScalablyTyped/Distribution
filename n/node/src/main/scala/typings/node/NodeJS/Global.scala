package typings.node.NodeJS

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.Console
import typings.node.anon.FnCallSRadix
import typings.node.anon.FnCallUriComponent
import typings.node.anon.TypeofBuffer
import typings.std.ArrayBufferConstructor
import typings.std.ArrayBufferLike
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DataViewConstructor
import typings.std.DateConstructor
import typings.std.ErrorConstructor
import typings.std.EvalErrorConstructor
import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.FunctionConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.Iterable
import typings.std.MapConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.PromiseConstructor
import typings.std.RangeErrorConstructor
import typings.std.ReferenceErrorConstructor
import typings.std.RegExp
import typings.std.RegExpConstructor
import typings.std.SetConstructor
import typings.std.StringConstructor
import typings.std.SyntaxErrorConstructor
import typings.std.TypeErrorConstructor
import typings.std.URIErrorConstructor
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import typings.std.Uint8ClampedArrayConstructor
import typings.std.WeakMapConstructor
import typings.std.WeakSetConstructor
import typings.std.global.Array
import typings.std.global.Boolean
import typings.std.global.Date
import typings.std.global.Error
import typings.std.global.EvalError
import typings.std.global.Function
import typings.std.global.Number
import typings.std.global.Object
import typings.std.global.RangeError
import typings.std.global.ReferenceError
import typings.std.global.SyntaxError
import typings.std.global.TypeError
import typings.std.global.URIError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  var ArrayBuffer: ArrayBufferConstructor with (Instantiable1[/* byteLength */ Double, typings.std.global.ArrayBuffer]) = js.native
  @JSName("Array")
  var Array_Original: ArrayConstructor with (Instantiable1[/* arrayLength */ Double, Array[js.Object]]) = js.native
  @JSName("Boolean")
  var Boolean_Original: BooleanConstructor with Instantiable0[Boolean] = js.native
  var Buffer: TypeofBuffer = js.native
  var DataView: DataViewConstructor with (Instantiable1[/* buffer */ ArrayBufferLike, typings.std.global.DataView]) = js.native
  @JSName("Date")
  var Date_Original: DateConstructor with (Instantiable1[/* value */ Double, Date]) = js.native
  @JSName("Error")
  var Error_Original: ErrorConstructor with Instantiable0[Error] = js.native
  @JSName("EvalError")
  var EvalError_Original: EvalErrorConstructor with Instantiable0[EvalError] = js.native
  var Float32Array: Float32ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Float32Array]) = js.native
  var Float64Array: Float64ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Float64Array]) = js.native
  @JSName("Function")
  var Function_Original: FunctionConstructor with (Instantiable1[/* args (repeated) */ String, Function]) = js.native
  var Infinity: Double = js.native
  var Int16Array: Int16ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Int16Array]) = js.native
  var Int32Array: Int32ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Int32Array]) = js.native
  var Int8Array: Int8ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Int8Array]) = js.native
  var Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any = js.native
  var JSON: typings.std.JSON = js.native
  var Map: MapConstructor = js.native
  var Math: typings.std.Math = js.native
  var NaN: Double = js.native
  @JSName("Number")
  var Number_Original: NumberConstructor with Instantiable0[Number] = js.native
  @JSName("Object")
  var Object_Original: ObjectConstructor with Instantiable0[Object] = js.native
  var Promise: PromiseConstructor with (Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[
        /* value */ js.UndefOr[
          (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
        ], 
        Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ], 
    typings.std.global.Promise[js.Object]
  ]) = js.native
  @JSName("RangeError")
  var RangeError_Original: RangeErrorConstructor with Instantiable0[RangeError] = js.native
  @JSName("ReferenceError")
  var ReferenceError_Original: ReferenceErrorConstructor with Instantiable0[ReferenceError] = js.native
  @JSName("RegExp")
  var RegExp_Original: RegExpConstructor with (Instantiable1[/* pattern */ RegExp, typings.std.global.RegExp]) = js.native
  var Set: SetConstructor = js.native
  @JSName("String")
  var String_Original: StringConstructor with Instantiable0[typings.std.global.String] = js.native
  var Symbol: js.Function = js.native
  @JSName("SyntaxError")
  var SyntaxError_Original: SyntaxErrorConstructor with Instantiable0[SyntaxError] = js.native
  @JSName("TypeError")
  var TypeError_Original: TypeErrorConstructor with Instantiable0[TypeError] = js.native
  @JSName("URIError")
  var URIError_Original: URIErrorConstructor with Instantiable0[URIError] = js.native
  var Uint16Array: Uint16ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Uint16Array]) = js.native
  var Uint32Array: Uint32ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Uint32Array]) = js.native
  var Uint8Array: Uint8ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Uint8Array]) = js.native
  var Uint8ClampedArray: Uint8ClampedArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Uint8ClampedArray]) = js.native
  var WeakMap: WeakMapConstructor = js.native
  var WeakSet: WeakSetConstructor = js.native
  var console: Console = js.native
  @JSName("decodeURIComponent")
  var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ String, String] = js.native
  @JSName("decodeURI")
  var decodeURI_Original: js.Function1[/* encodedURI */ String, String] = js.native
  @JSName("encodeURIComponent")
  var encodeURIComponent_Original: FnCallUriComponent = js.native
  @JSName("encodeURI")
  var encodeURI_Original: js.Function1[/* uri */ String, String] = js.native
  @JSName("eval")
  var eval_Original: js.Function1[/* x */ String, _] = js.native
  var global: Global = js.native
  @JSName("isFinite")
  var isFinite_Original: js.Function1[/* number */ Double, scala.Boolean] = js.native
  @JSName("isNaN")
  var isNaN_Original: js.Function1[/* number */ Double, scala.Boolean] = js.native
  @JSName("parseFloat")
  var parseFloat_Original: js.Function1[/* string */ String, Double] = js.native
  @JSName("parseInt")
  var parseInt_Original: FnCallSRadix = js.native
  var process: Process = js.native
  @JSName("queueMicrotask")
  var queueMicrotask_Original: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
  var undefined: js.UndefOr[scala.Nothing] = js.native
  var v8debug: js.UndefOr[js.Any] = js.native
  def Array(): js.Array[_] = js.native
  def Array(arrayLength: Double): js.Array[_] = js.native
  def Array[T](items: T*): js.Array[T] = js.native
  @JSName("Array")
  def Array_T[T](arrayLength: Double): js.Array[T] = js.native
  def Boolean[T](): scala.Boolean = js.native
  def Boolean[T](value: T): scala.Boolean = js.native
  def Date(): String = js.native
  def Error(): typings.std.Error = js.native
  def Error(message: String): typings.std.Error = js.native
  def EvalError(): typings.std.Error = js.native
  def EvalError(message: String): typings.std.Error = js.native
  @JSName("EvalError")
  def EvalError_EvalError(): typings.std.EvalError = js.native
  @JSName("EvalError")
  def EvalError_EvalError(message: String): typings.std.EvalError = js.native
  def Function(args: String*): js.Function = js.native
  def Number(): Double = js.native
  def Number(value: js.Any): Double = js.native
  def Object(): js.Any = js.native
  def Object(value: js.Any): js.Any = js.native
  def RangeError(): typings.std.RangeError = js.native
  def RangeError(message: String): typings.std.RangeError = js.native
  @JSName("RangeError")
  def RangeError_Error(): typings.std.Error = js.native
  @JSName("RangeError")
  def RangeError_Error(message: String): typings.std.Error = js.native
  def ReferenceError(): typings.std.Error = js.native
  def ReferenceError(message: String): typings.std.Error = js.native
  @JSName("ReferenceError")
  def ReferenceError_ReferenceError(): typings.std.ReferenceError = js.native
  @JSName("ReferenceError")
  def ReferenceError_ReferenceError(message: String): typings.std.ReferenceError = js.native
  def RegExp(pattern: String): typings.std.RegExp = js.native
  def RegExp(pattern: String, flags: String): typings.std.RegExp = js.native
  def RegExp(pattern: typings.std.RegExp): typings.std.RegExp = js.native
  def RegExp(pattern: typings.std.RegExp, flags: String): typings.std.RegExp = js.native
  def String(): java.lang.String = js.native
  def String(value: js.Any): java.lang.String = js.native
  def SyntaxError(): typings.std.SyntaxError = js.native
  def SyntaxError(message: String): typings.std.SyntaxError = js.native
  @JSName("SyntaxError")
  def SyntaxError_Error(): typings.std.Error = js.native
  @JSName("SyntaxError")
  def SyntaxError_Error(message: String): typings.std.Error = js.native
  def TypeError(): typings.std.Error = js.native
  def TypeError(message: String): typings.std.Error = js.native
  @JSName("TypeError")
  def TypeError_TypeError(): typings.std.TypeError = js.native
  @JSName("TypeError")
  def TypeError_TypeError(message: String): typings.std.TypeError = js.native
  def URIError(): typings.std.Error = js.native
  def URIError(message: String): typings.std.Error = js.native
  @JSName("URIError")
  def URIError_URIError(): typings.std.URIError = js.native
  @JSName("URIError")
  def URIError_URIError(message: String): typings.std.URIError = js.native
  def clearImmediate(immediateId: Immediate): Unit = js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  def decodeURI(encodedURI: String): String = js.native
  def decodeURIComponent(encodedURIComponent: String): String = js.native
  def encodeURI(uri: String): String = js.native
  def encodeURIComponent(uriComponent: String): String = js.native
  def encodeURIComponent(uriComponent: scala.Boolean): String = js.native
  def encodeURIComponent(uriComponent: Double): String = js.native
  def escape(str: String): String = js.native
  def eval(x: String): js.Any = js.native
  def gc(): Unit = js.native
  def isFinite(number: Double): scala.Boolean = js.native
  def isNaN(number: Double): scala.Boolean = js.native
  def parseFloat(string: String): Double = js.native
  def parseInt(s: String): Double = js.native
  def parseInt(s: String, radix: Double): Double = js.native
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def unescape(str: String): String = js.native
}

