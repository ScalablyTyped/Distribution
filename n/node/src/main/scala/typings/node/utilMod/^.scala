package typings.node.utilMod

import typings.node.Error
import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def inspect(`object`: js.Any): java.lang.String = js.native
  def inspect(`object`: js.Any, options: InspectOptions): java.lang.String = js.native
  def inspect(`object`: js.Any, showHidden: Boolean): java.lang.String = js.native
  def inspect(`object`: js.Any, showHidden: Boolean, depth: Double): java.lang.String = js.native
  def inspect(`object`: js.Any, showHidden: Boolean, depth: Double, color: Boolean): java.lang.String = js.native
  def inspect(`object`: js.Any, showHidden: Boolean, depth: Null, color: Boolean): java.lang.String = js.native
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
  def promisify(fn: js.Function): js.Function = js.native
  def promisify(fn: js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], Unit]): js.Function0[js.Promise[Unit]] = js.native
  def promisify[T1](
    fn: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = js.native
  def promisify[TCustom /* <: js.Function */](fn: CustomPromisify[TCustom]): TCustom = js.native
  def promisify[T1, T2](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = js.native
  def promisify[T1, T2, T3](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = js.native
  def promisify[T1, T2, T3, T4](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = js.native
  def promisify[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
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
  @JSName("promisify")
  def promisify_T1T2T3T4T5TResult[T1, T2, T3, T4, T5, TResult](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function2[/* err */ Error | Null, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    js.Promise[TResult]
  ] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4TResult[T1, T2, T3, T4, TResult](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function2[/* err */ Error | Null, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3TResult[T1, T2, T3, TResult](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ Error | Null, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_T1T2TResult[T1, T2, TResult](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ Error | Null, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_T1TResult[T1, TResult](
    fn: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function2[/* err */ Error | Null, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ T1, js.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_TResult[TResult](
    fn: js.Function1[
      /* callback */ js.Function2[/* err */ Error | Null, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function0[js.Promise[TResult]] = js.native
}

