package typings.node

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.TypedArray
import typings.node.utilMod.CustomPromisify
import typings.node.utilMod.InspectOptions
import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  @js.native
  trait CustomPromisify[TCustom /* <: js.Function */]
    extends js.Function {
    var __promisify__ : TCustom = js.native
  }
  
  @js.native
  class TextDecoder () extends js.Object {
    def this(encoding: java.lang.String) = this()
    def this(encoding: java.lang.String, options: Anon_Fatal) = this()
    val encoding: java.lang.String = js.native
    val fatal: Boolean = js.native
    val ignoreBOM: Boolean = js.native
    def decode(): java.lang.String = js.native
    def decode(input: Null, options: Anon_Stream): java.lang.String = js.native
    def decode(input: TypedArray): java.lang.String = js.native
    def decode(input: TypedArray, options: Anon_Stream): java.lang.String = js.native
    def decode(input: ArrayBuffer): java.lang.String = js.native
    def decode(input: ArrayBuffer, options: Anon_Stream): java.lang.String = js.native
    def decode(input: DataView): java.lang.String = js.native
    def decode(input: DataView, options: Anon_Stream): java.lang.String = js.native
  }
  
  @js.native
  class TextEncoder () extends js.Object {
    val encoding: java.lang.String = js.native
    def encode(): Uint8Array = js.native
    def encode(input: java.lang.String): Uint8Array = js.native
  }
  
  def callbackify(fn: js.Function0[js.Promise[Unit]]): js.Function1[/* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit] = js.native
  def callbackify[T1](fn: js.Function1[/* arg1 */ T1, js.Promise[Unit]]): js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit] = js.native
  def callbackify[T1, T2](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  def callbackify[T1, T2, T3](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  def callbackify[T1, T2, T3, T4](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  def callbackify[T1, T2, T3, T4, T5](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      js.Promise[Unit]
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  def callbackify[T1, T2, T3, T4, T5, T6](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      js.Promise[Unit]
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3T4T5T6TResult[T1, T2, T3, T4, T5, T6, TResult](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      js.Promise[TResult]
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3T4T5TResult[T1, T2, T3, T4, T5, TResult](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      js.Promise[TResult]
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3T4TResult[T1, T2, T3, T4, TResult](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3TResult[T1, T2, T3, TResult](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2TResult[T1, T2, TResult](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1TResult[T1, TResult](fn: js.Function1[/* arg1 */ T1, js.Promise[TResult]]): js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_TResult[TResult](fn: js.Function0[js.Promise[TResult]]): js.Function1[
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  def debuglog(key: java.lang.String): js.Function2[/* msg */ java.lang.String, /* repeated */ js.Any, Unit] = js.native
  def deprecate[T /* <: js.Function */](fn: T, message: java.lang.String): T = js.native
  def format(format: js.Any, param: js.Any*): java.lang.String = js.native
  def formatWithOptions(inspectOptions: InspectOptions, format: java.lang.String, param: js.Any*): java.lang.String = js.native
  def inherits(constructor: js.Any, superConstructor: js.Any): Unit = js.native
  /** @deprecated since v4.0.0 - use `Array.isArray()` instead. */
  def isArray(`object`: js.Any): /* is std.Array<any> */ Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'boolean'` instead. */
  def isBoolean(`object`: js.Any): /* is boolean */ Boolean = js.native
  /** @deprecated since v4.0.0 - use `Buffer.isBuffer()` instead. */
  def isBuffer(`object`: js.Any): /* is node.Buffer */ Boolean = js.native
  /** @deprecated since v4.0.0 - use `util.types.isDate()` instead. */
  def isDate(`object`: js.Any): /* is std.Date */ Boolean = js.native
  def isDeepStrictEqual(val1: js.Any, val2: js.Any): Boolean = js.native
  /** @deprecated since v4.0.0 - use `util.types.isNativeError()` instead. */
  def isError(`object`: js.Any): /* is node.Error */ Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'function'` instead. */
  def isFunction(`object`: js.Any): Boolean = js.native
  /** @deprecated since v4.0.0 - use `value === null` instead. */
  def isNull(`object`: js.Any): /* is null */ Boolean = js.native
  /** @deprecated since v4.0.0 - use `value === null || value === undefined` instead. */
  def isNullOrUndefined(`object`: js.Any): Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'number'` instead. */
  def isNumber(`object`: js.Any): /* is number */ Boolean = js.native
  /** @deprecated since v4.0.0 - use `value !== null && typeof value === 'object'` instead. */
  def isObject(`object`: js.Any): Boolean = js.native
  /** @deprecated since v4.0.0 - use `(typeof value !== 'object' && typeof value !== 'function') || value === null` instead. */
  def isPrimitive(`object`: js.Any): Boolean = js.native
  /** @deprecated since v4.0.0 - use `util.types.isRegExp()` instead. */
  def isRegExp(`object`: js.Any): /* is std.RegExp */ Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'string'` instead. */
  def isString(`object`: js.Any): /* is string */ Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'symbol'` instead. */
  def isSymbol(`object`: js.Any): /* is symbol */ Boolean = js.native
  /** @deprecated since v4.0.0 - use `value === undefined` instead. */
  def isUndefined(`object`: js.Any): /* is undefined */ Boolean = js.native
  /** @deprecated since v0.11.3 - use a third party module instead. */
  def log(string: java.lang.String): Unit = js.native
  @js.native
  object inspect extends js.Object {
    val custom: js.Symbol = js.native
    var defaultOptions: InspectOptions = js.native
    /**
      * Allows changing inspect settings from the repl.
      */
    var replDefaults: InspectOptions = js.native
    def apply(`object`: js.Any): java.lang.String = js.native
    def apply(`object`: js.Any, options: InspectOptions): java.lang.String = js.native
    def apply(`object`: js.Any, showHidden: Boolean): java.lang.String = js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: Double): java.lang.String = js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: Double, color: Boolean): java.lang.String = js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: Null, color: Boolean): java.lang.String = js.native
    @js.native
    object colors
      extends /* color */ StringDictionary[js.UndefOr[js.Tuple2[Double, Double]]]
    
    @js.native
    object styles
      extends /* style */ StringDictionary[js.UndefOr[java.lang.String]]
    
  }
  
  @js.native
  object promisify extends js.Object {
    val custom: js.Symbol = js.native
    def apply(fn: js.Function): js.Function = js.native
    def apply(fn: js.Function1[/* callback */ js.Function1[js.UndefOr[Error | Null], Unit], Unit]): js.Function0[js.Promise[Unit]] = js.native
    def apply[T1](fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], Unit]): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = js.native
    def apply[TCustom /* <: js.Function */](fn: CustomPromisify[TCustom]): TCustom = js.native
    def apply[T1, T2](
      fn: js.Function3[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = js.native
    def apply[T1, T2, T3](
      fn: js.Function4[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = js.native
    def apply[T1, T2, T3, T4](
      fn: js.Function5[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* arg4 */ T4, 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = js.native
    def apply[T1, T2, T3, T4, T5](
      fn: js.Function6[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* arg4 */ T4, 
          /* arg5 */ T5, 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): js.Function5[
        /* arg1 */ T1, 
        /* arg2 */ T2, 
        /* arg3 */ T3, 
        /* arg4 */ T4, 
        /* arg5 */ T5, 
        js.Promise[Unit]
      ] = js.native
  }
  
  @js.native
  object types extends js.Object {
    def isAnyArrayBuffer(`object`: js.Any): Boolean = js.native
    def isArgumentsObject(`object`: js.Any): /* is std.IArguments */ Boolean = js.native
    def isArrayBuffer(`object`: js.Any): /* is std.ArrayBuffer */ Boolean = js.native
    def isAsyncFunction(`object`: js.Any): Boolean = js.native
    def isBigInt64Array(value: js.Any): Boolean = js.native
    def isBigUint64Array(value: js.Any): Boolean = js.native
    def isBooleanObject(`object`: js.Any): /* is std.Boolean */ Boolean = js.native
    def isBoxedPrimitive(`object`: js.Any): Boolean = js.native
    def isDataView(`object`: js.Any): /* is std.DataView */ Boolean = js.native
    def isDate(`object`: js.Any): /* is std.Date */ Boolean = js.native
    def isExternal(`object`: js.Any): Boolean = js.native
    def isFloat32Array(`object`: js.Any): /* is std.Float32Array */ Boolean = js.native
    def isFloat64Array(`object`: js.Any): /* is std.Float64Array */ Boolean = js.native
    def isGeneratorFunction(`object`: js.Any): Boolean = js.native
    def isGeneratorObject(`object`: js.Any): Boolean = js.native
    def isInt16Array(`object`: js.Any): /* is std.Int16Array */ Boolean = js.native
    def isInt32Array(`object`: js.Any): /* is std.Int32Array */ Boolean = js.native
    def isInt8Array(`object`: js.Any): /* is std.Int8Array */ Boolean = js.native
    def isMap(`object`: js.Any): Boolean = js.native
    def isMapIterator(`object`: js.Any): Boolean = js.native
    def isModuleNamespaceObject(value: js.Any): Boolean = js.native
    def isNativeError(`object`: js.Any): /* is node.Error */ Boolean = js.native
    def isNumberObject(`object`: js.Any): /* is std.Number */ Boolean = js.native
    def isPromise(`object`: js.Any): Boolean = js.native
    def isProxy(`object`: js.Any): Boolean = js.native
    def isRegExp(`object`: js.Any): /* is std.RegExp */ Boolean = js.native
    def isSet(`object`: js.Any): Boolean = js.native
    def isSetIterator(`object`: js.Any): Boolean = js.native
    def isSharedArrayBuffer(`object`: js.Any): Boolean = js.native
    def isStringObject(`object`: js.Any): Boolean = js.native
    def isSymbolObject(`object`: js.Any): Boolean = js.native
    def isTypedArray(`object`: js.Any): /* is node.NodeJS.TypedArray */ Boolean = js.native
    def isUint16Array(`object`: js.Any): /* is std.Uint16Array */ Boolean = js.native
    def isUint32Array(`object`: js.Any): /* is std.Uint32Array */ Boolean = js.native
    def isUint8Array(`object`: js.Any): /* is std.Uint8Array */ Boolean = js.native
    def isUint8ClampedArray(`object`: js.Any): /* is std.Uint8ClampedArray */ Boolean = js.native
    def isWeakMap(`object`: js.Any): Boolean = js.native
    def isWeakSet(`object`: js.Any): Boolean = js.native
    def isWebAssemblyCompiledModule(`object`: js.Any): Boolean = js.native
  }
  
  type InspectOptions = typings.node.NodeJS.InspectOptions
}

