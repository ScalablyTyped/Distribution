package typings.node

import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.Dict
import typings.node.NodeJS.ErrnoException
import typings.node.anon.Fatal
import typings.node.anon.Stream
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("util", "TextDecoder")
  @js.native
  class TextDecoder () extends StObject {
    def this(encoding: java.lang.String) = this()
    def this(encoding: js.UndefOr[scala.Nothing], options: Fatal) = this()
    def this(encoding: java.lang.String, options: Fatal) = this()
    
    def decode(): java.lang.String = js.native
    def decode(input: js.UndefOr[ArrayBufferView], options: Stream): java.lang.String = js.native
    def decode(input: Null, options: Stream): java.lang.String = js.native
    def decode(input: ArrayBufferView): java.lang.String = js.native
    def decode(input: ArrayBuffer): java.lang.String = js.native
    def decode(input: ArrayBuffer, options: Stream): java.lang.String = js.native
    
    val encoding: java.lang.String = js.native
    
    val fatal: Boolean = js.native
    
    val ignoreBOM: Boolean = js.native
  }
  
  @JSImport("util", "TextEncoder")
  @js.native
  class TextEncoder () extends StObject {
    
    def encode(): Uint8Array = js.native
    def encode(input: java.lang.String): Uint8Array = js.native
    
    def encodeInto(input: java.lang.String, output: Uint8Array): EncodeIntoResult = js.native
    
    val encoding: java.lang.String = js.native
  }
  
  @JSImport("util", "callbackify")
  @js.native
  def callbackify(fn: js.Function0[js.Promise[Unit]]): js.Function1[/* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit] = js.native
  @JSImport("util", "callbackify")
  @js.native
  def callbackify[T1](fn: js.Function1[/* arg1 */ T1, js.Promise[Unit]]): js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit] = js.native
  @JSImport("util", "callbackify")
  @js.native
  def callbackify[T1, T2](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  @JSImport("util", "callbackify")
  @js.native
  def callbackify[T1, T2, T3](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  @JSImport("util", "callbackify")
  @js.native
  def callbackify[T1, T2, T3, T4](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  @JSImport("util", "callbackify")
  @js.native
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
  @JSImport("util", "callbackify")
  @js.native
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
  @JSImport("util", "callbackify")
  @js.native
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
  @JSImport("util", "callbackify")
  @js.native
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
  @JSImport("util", "callbackify")
  @js.native
  def callbackify_T1T2T3T4TResult[T1, T2, T3, T4, TResult](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSImport("util", "callbackify")
  @js.native
  def callbackify_T1T2T3TResult[T1, T2, T3, TResult](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSImport("util", "callbackify")
  @js.native
  def callbackify_T1T2TResult[T1, T2, TResult](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSImport("util", "callbackify")
  @js.native
  def callbackify_T1TResult[T1, TResult](fn: js.Function1[/* arg1 */ T1, js.Promise[TResult]]): js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSImport("util", "callbackify")
  @js.native
  def callbackify_TResult[TResult](fn: js.Function0[js.Promise[TResult]]): js.Function1[
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  
  @JSImport("util", "debuglog")
  @js.native
  def debuglog(key: java.lang.String): js.Function2[/* msg */ java.lang.String, /* repeated */ js.Any, Unit] = js.native
  
  @JSImport("util", "deprecate")
  @js.native
  def deprecate[T /* <: js.Function */](fn: T, message: java.lang.String): T = js.native
  @JSImport("util", "deprecate")
  @js.native
  def deprecate[T /* <: js.Function */](fn: T, message: java.lang.String, code: java.lang.String): T = js.native
  
  @JSImport("util", "format")
  @js.native
  def format(format: js.Any, param: js.Any*): java.lang.String = js.native
  
  @JSImport("util", "formatWithOptions")
  @js.native
  def formatWithOptions(inspectOptions: InspectOptions, format: java.lang.String, param: js.Any*): java.lang.String = js.native
  
  @JSImport("util", "inherits")
  @js.native
  def inherits(constructor: js.Any, superConstructor: js.Any): Unit = js.native
  
  object inspect {
    
    @JSImport("util", "inspect")
    @js.native
    def apply(`object`: js.Any): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    def apply(`object`: js.Any, options: InspectOptions): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    def apply(
      `object`: js.Any,
      showHidden: js.UndefOr[scala.Nothing],
      depth: js.UndefOr[scala.Nothing],
      color: Boolean
    ): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Double): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Double, color: Boolean): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Null, color: Boolean): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: Boolean): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: js.UndefOr[scala.Nothing], color: Boolean): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: Double): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: Double, color: Boolean): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: Null, color: Boolean): java.lang.String = js.native
    @JSImport("util", "inspect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("util", "inspect.colors")
    @js.native
    def colors: Dict[js.Tuple2[Double, Double]] = js.native
    @scala.inline
    def colors_=(x: Dict[js.Tuple2[Double, Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("util", "inspect.custom")
    @js.native
    val custom: js.Symbol = js.native
    
    @JSImport("util", "inspect.defaultOptions")
    @js.native
    def defaultOptions: InspectOptions = js.native
    @scala.inline
    def defaultOptions_=(x: InspectOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Allows changing inspect settings from the repl.
      */
    @JSImport("util", "inspect.replDefaults")
    @js.native
    def replDefaults: InspectOptions = js.native
    @scala.inline
    def replDefaults_=(x: InspectOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replDefaults")(x.asInstanceOf[js.Any])
    
    /* Inlined {[ K in node.util.Style ]: string} */
    object styles {
      
      @JSImport("util", "inspect.styles")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("util", "inspect.styles.bigint")
      @js.native
      def bigint: java.lang.String = js.native
      @scala.inline
      def bigint_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigint")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.boolean")
      @js.native
      def boolean: java.lang.String = js.native
      @scala.inline
      def boolean_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.date")
      @js.native
      def date: java.lang.String = js.native
      @scala.inline
      def date_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.module")
      @js.native
      def module: java.lang.String = js.native
      @scala.inline
      def module_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("module")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.number")
      @js.native
      def number: java.lang.String = js.native
      @scala.inline
      def number_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.regexp")
      @js.native
      def regexp: java.lang.String = js.native
      @scala.inline
      def regexp_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.special")
      @js.native
      def special: java.lang.String = js.native
      @scala.inline
      def special_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("special")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.string")
      @js.native
      def string: java.lang.String = js.native
      @scala.inline
      def string_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.symbol")
      @js.native
      def symbol: java.lang.String = js.native
      @scala.inline
      def symbol_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.undefined")
      @js.native
      def undefined: java.lang.String = js.native
      @scala.inline
      def undefined_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.null")
      @js.native
      val `null`: java.lang.String = js.native
    }
  }
  
  /** @deprecated since v4.0.0 - use `Array.isArray()` instead. */
  @JSImport("util", "isArray")
  @js.native
  def isArray(`object`: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `typeof value === 'boolean'` instead. */
  @JSImport("util", "isBoolean")
  @js.native
  def isBoolean(`object`: js.Any): /* is boolean */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `Buffer.isBuffer()` instead. */
  @JSImport("util", "isBuffer")
  @js.native
  def isBuffer(`object`: js.Any): /* is node.Buffer */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `util.types.isDate()` instead. */
  @JSImport("util", "isDate")
  @js.native
  def isDate(`object`: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("util", "isDeepStrictEqual")
  @js.native
  def isDeepStrictEqual(val1: js.Any, val2: js.Any): Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `util.types.isNativeError()` instead. */
  @JSImport("util", "isError")
  @js.native
  def isError(`object`: js.Any): /* is std.Error */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `typeof value === 'function'` instead. */
  @JSImport("util", "isFunction")
  @js.native
  def isFunction(`object`: js.Any): Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `value === null` instead. */
  @JSImport("util", "isNull")
  @js.native
  def isNull(`object`: js.Any): /* is null */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `value === null || value === undefined` instead. */
  @JSImport("util", "isNullOrUndefined")
  @js.native
  def isNullOrUndefined(`object`: js.Any): Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `typeof value === 'number'` instead. */
  @JSImport("util", "isNumber")
  @js.native
  def isNumber(`object`: js.Any): /* is number */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `value !== null && typeof value === 'object'` instead. */
  @JSImport("util", "isObject")
  @js.native
  def isObject(`object`: js.Any): Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `(typeof value !== 'object' && typeof value !== 'function') || value === null` instead. */
  @JSImport("util", "isPrimitive")
  @js.native
  def isPrimitive(`object`: js.Any): Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `util.types.isRegExp()` instead. */
  @JSImport("util", "isRegExp")
  @js.native
  def isRegExp(`object`: js.Any): /* is std.RegExp */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `typeof value === 'string'` instead. */
  @JSImport("util", "isString")
  @js.native
  def isString(`object`: js.Any): /* is string */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `typeof value === 'symbol'` instead. */
  @JSImport("util", "isSymbol")
  @js.native
  def isSymbol(`object`: js.Any): /* is symbol */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `value === undefined` instead. */
  @JSImport("util", "isUndefined")
  @js.native
  def isUndefined(`object`: js.Any): /* is undefined */ Boolean = js.native
  
  /** @deprecated since v0.11.3 - use a third party module instead. */
  @JSImport("util", "log")
  @js.native
  def log(string: java.lang.String): Unit = js.native
  
  object promisify {
    
    @JSImport("util", "promisify")
    @js.native
    def apply(fn: js.Function): js.Function = js.native
    @JSImport("util", "promisify")
    @js.native
    def apply(fn: js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]): js.Function0[js.Promise[Unit]] = js.native
    @JSImport("util", "promisify")
    @js.native
    def apply[T1](
      fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
    ): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = js.native
    @JSImport("util", "promisify")
    @js.native
    def apply[TCustom /* <: js.Function */](fn: CustomPromisify[TCustom]): TCustom = js.native
    @JSImport("util", "promisify")
    @js.native
    def apply[T1, T2](
      fn: js.Function3[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = js.native
    @JSImport("util", "promisify")
    @js.native
    def apply[T1, T2, T3](
      fn: js.Function4[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = js.native
    @JSImport("util", "promisify")
    @js.native
    def apply[T1, T2, T3, T4](
      fn: js.Function5[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* arg4 */ T4, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = js.native
    @JSImport("util", "promisify")
    @js.native
    def apply[T1, T2, T3, T4, T5](
      fn: js.Function6[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* arg4 */ T4, 
          /* arg5 */ T5, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
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
    
    @JSImport("util", "promisify.custom")
    @js.native
    val custom: js.Symbol = js.native
  }
  
  object types {
    
    @JSImport("util", "types.isAnyArrayBuffer")
    @js.native
    def isAnyArrayBuffer(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isArgumentsObject")
    @js.native
    def isArgumentsObject(`object`: js.Any): /* is std.IArguments */ Boolean = js.native
    
    @JSImport("util", "types.isArrayBuffer")
    @js.native
    def isArrayBuffer(`object`: js.Any): /* is std.ArrayBuffer */ Boolean = js.native
    
    @JSImport("util", "types.isArrayBufferView")
    @js.native
    def isArrayBufferView(`object`: js.Any): /* is std.ArrayBufferView */ Boolean = js.native
    
    @JSImport("util", "types.isAsyncFunction")
    @js.native
    def isAsyncFunction(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isBigInt64Array")
    @js.native
    def isBigInt64Array(value: js.Any): /* is std.BigInt64Array */ Boolean = js.native
    
    @JSImport("util", "types.isBigUint64Array")
    @js.native
    def isBigUint64Array(value: js.Any): /* is std.BigUint64Array */ Boolean = js.native
    
    @JSImport("util", "types.isBooleanObject")
    @js.native
    def isBooleanObject(`object`: js.Any): /* is std.Boolean */ Boolean = js.native
    
    @JSImport("util", "types.isBoxedPrimitive")
    @js.native
    def isBoxedPrimitive(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isDataView")
    @js.native
    def isDataView(`object`: js.Any): /* is std.DataView */ Boolean = js.native
    
    @JSImport("util", "types.isDate")
    @js.native
    def isDate(`object`: js.Any): /* is std.Date */ Boolean = js.native
    
    @JSImport("util", "types.isExternal")
    @js.native
    def isExternal(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isFloat32Array")
    @js.native
    def isFloat32Array(`object`: js.Any): /* is std.Float32Array */ Boolean = js.native
    
    @JSImport("util", "types.isFloat64Array")
    @js.native
    def isFloat64Array(`object`: js.Any): /* is std.Float64Array */ Boolean = js.native
    
    @JSImport("util", "types.isGeneratorFunction")
    @js.native
    def isGeneratorFunction(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isGeneratorObject")
    @js.native
    def isGeneratorObject(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isInt16Array")
    @js.native
    def isInt16Array(`object`: js.Any): /* is std.Int16Array */ Boolean = js.native
    
    @JSImport("util", "types.isInt32Array")
    @js.native
    def isInt32Array(`object`: js.Any): /* is std.Int32Array */ Boolean = js.native
    
    @JSImport("util", "types.isInt8Array")
    @js.native
    def isInt8Array(`object`: js.Any): /* is std.Int8Array */ Boolean = js.native
    
    @JSImport("util", "types.isMap")
    @js.native
    def isMap(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isMapIterator")
    @js.native
    def isMapIterator(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isModuleNamespaceObject")
    @js.native
    def isModuleNamespaceObject(value: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isNativeError")
    @js.native
    def isNativeError(`object`: js.Any): /* is std.Error */ Boolean = js.native
    
    @JSImport("util", "types.isNumberObject")
    @js.native
    def isNumberObject(`object`: js.Any): /* is std.Number */ Boolean = js.native
    
    @JSImport("util", "types.isPromise")
    @js.native
    def isPromise(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isProxy")
    @js.native
    def isProxy(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isRegExp")
    @js.native
    def isRegExp(`object`: js.Any): /* is std.RegExp */ Boolean = js.native
    
    @JSImport("util", "types.isSet")
    @js.native
    def isSet(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isSetIterator")
    @js.native
    def isSetIterator(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isSharedArrayBuffer")
    @js.native
    def isSharedArrayBuffer(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isStringObject")
    @js.native
    def isStringObject(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isSymbolObject")
    @js.native
    def isSymbolObject(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isTypedArray")
    @js.native
    def isTypedArray(`object`: js.Any): /* is node.NodeJS.TypedArray */ Boolean = js.native
    
    @JSImport("util", "types.isUint16Array")
    @js.native
    def isUint16Array(`object`: js.Any): /* is std.Uint16Array */ Boolean = js.native
    
    @JSImport("util", "types.isUint32Array")
    @js.native
    def isUint32Array(`object`: js.Any): /* is std.Uint32Array */ Boolean = js.native
    
    @JSImport("util", "types.isUint8Array")
    @js.native
    def isUint8Array(`object`: js.Any): /* is std.Uint8Array */ Boolean = js.native
    
    @JSImport("util", "types.isUint8ClampedArray")
    @js.native
    def isUint8ClampedArray(`object`: js.Any): /* is std.Uint8ClampedArray */ Boolean = js.native
    
    @JSImport("util", "types.isWeakMap")
    @js.native
    def isWeakMap(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isWeakSet")
    @js.native
    def isWeakSet(`object`: js.Any): Boolean = js.native
    
    @JSImport("util", "types.isWebAssemblyCompiledModule")
    @js.native
    def isWebAssemblyCompiledModule(`object`: js.Any): Boolean = js.native
  }
  
  type CustomInspectFunction = js.Function2[/* depth */ Double, /* options */ InspectOptionsStylized, java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.utilMod.CustomPromisifySymbol[TCustom]
    - typings.node.utilMod.CustomPromisifyLegacy[TCustom]
  */
  trait CustomPromisify[TCustom /* <: js.Function */] extends StObject
  
  @js.native
  trait CustomPromisifyLegacy[TCustom /* <: js.Function */]
    extends js.Function
       with CustomPromisify[TCustom] {
    
    var __promisify__ : TCustom = js.native
  }
  
  @js.native
  trait CustomPromisifySymbol[TCustom /* <: js.Function */]
    extends js.Function
       with CustomPromisify[TCustom]
  
  @js.native
  trait EncodeIntoResult extends StObject {
    
    /**
      * The read Unicode code units of input.
      */
    var read: Double = js.native
    
    /**
      * The written UTF-8 bytes of output.
      */
    var written: Double = js.native
  }
  object EncodeIntoResult {
    
    @scala.inline
    def apply(read: Double, written: Double): EncodeIntoResult = {
      val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeIntoResult]
    }
    
    @scala.inline
    implicit class EncodeIntoResultMutableBuilder[Self <: EncodeIntoResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritten(value: Double): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
    }
  }
  
  type InspectOptions = typings.node.NodeJS.InspectOptions
  
  @js.native
  trait InspectOptionsStylized
    extends typings.node.NodeJS.InspectOptions {
    
    def stylize(text: java.lang.String, styleType: Style): java.lang.String = js.native
  }
  object InspectOptionsStylized {
    
    @scala.inline
    def apply(stylize: (java.lang.String, Style) => java.lang.String): InspectOptionsStylized = {
      val __obj = js.Dynamic.literal(stylize = js.Any.fromFunction2(stylize))
      __obj.asInstanceOf[InspectOptionsStylized]
    }
    
    @scala.inline
    implicit class InspectOptionsStylizedMutableBuilder[Self <: InspectOptionsStylized] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStylize(value: (java.lang.String, Style) => java.lang.String): Self = StObject.set(x, "stylize", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeStrings.special
    - typings.node.nodeStrings.number
    - typings.node.nodeStrings.bigint
    - typings.node.nodeStrings.boolean
    - typings.node.nodeStrings.undefined
    - typings.node.nodeStrings.`null`
    - typings.node.nodeStrings.string
    - typings.node.nodeStrings.symbol
    - typings.node.nodeStrings.date
    - typings.node.nodeStrings.regexp
    - typings.node.nodeStrings.module
  */
  trait Style extends StObject
  object Style {
    
    @scala.inline
    def bigint: typings.node.nodeStrings.bigint = "bigint".asInstanceOf[typings.node.nodeStrings.bigint]
    
    @scala.inline
    def boolean: typings.node.nodeStrings.boolean = "boolean".asInstanceOf[typings.node.nodeStrings.boolean]
    
    @scala.inline
    def date: typings.node.nodeStrings.date = "date".asInstanceOf[typings.node.nodeStrings.date]
    
    @scala.inline
    def module: typings.node.nodeStrings.module = "module".asInstanceOf[typings.node.nodeStrings.module]
    
    @scala.inline
    def `null`: typings.node.nodeStrings.`null` = "null".asInstanceOf[typings.node.nodeStrings.`null`]
    
    @scala.inline
    def number: typings.node.nodeStrings.number = "number".asInstanceOf[typings.node.nodeStrings.number]
    
    @scala.inline
    def regexp: typings.node.nodeStrings.regexp = "regexp".asInstanceOf[typings.node.nodeStrings.regexp]
    
    @scala.inline
    def special: typings.node.nodeStrings.special = "special".asInstanceOf[typings.node.nodeStrings.special]
    
    @scala.inline
    def string: typings.node.nodeStrings.string = "string".asInstanceOf[typings.node.nodeStrings.string]
    
    @scala.inline
    def symbol: typings.node.nodeStrings.symbol = "symbol".asInstanceOf[typings.node.nodeStrings.symbol]
    
    @scala.inline
    def undefined: typings.node.nodeStrings.undefined = "undefined".asInstanceOf[typings.node.nodeStrings.undefined]
  }
}
