package typings
package nodeLib.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", JSImport.Namespace)
@js.native
object utilModMembers extends js.Object {
  val inspect: nodeLib.Anon_Object = js.native
  def callbackify(fn: js.Function0[stdLib.Promise[scala.Unit]]): js.Function1[
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1](fn: js.Function1[/* arg1 */ T1, stdLib.Promise[scala.Unit]]): js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1, T2](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, stdLib.Promise[scala.Unit]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1, T2, T3](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, stdLib.Promise[scala.Unit]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1, T2, T3, T4](
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, stdLib.Promise[scala.Unit]]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1, T2, T3, T4, T5](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      stdLib.Promise[scala.Unit]
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1, T2, T3, T4, T5, T6](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      stdLib.Promise[scala.Unit]
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
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
      stdLib.Promise[TResult]
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3T4T5TResult[T1, T2, T3, T4, T5, TResult](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      stdLib.Promise[TResult]
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3T4TResult[T1, T2, T3, T4, TResult](
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, stdLib.Promise[TResult]]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3TResult[T1, T2, T3, TResult](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, stdLib.Promise[TResult]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2TResult[T1, T2, TResult](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, stdLib.Promise[TResult]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1TResult[T1, TResult](fn: js.Function1[/* arg1 */ T1, stdLib.Promise[TResult]]): js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_TResult[TResult](fn: js.Function0[stdLib.Promise[TResult]]): js.Function1[
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  /** @deprecated since v0.11.3 - use `console.error()` instead. */
  def debug(string: java.lang.String): scala.Unit = js.native
  def debuglog(key: java.lang.String): js.Function2[/* msg */ java.lang.String, /* repeated */js.Any, scala.Unit] = js.native
  def deprecate[T /* <: js.Function */](fn: T, message: java.lang.String): T = js.native
  /** @deprecated since v0.11.3 - use `console.error()` instead. */
  def error(param: js.Any*): scala.Unit = js.native
  def format(format: js.Any, param: js.Any*): java.lang.String = js.native
  def formatWithOptions(inspectOptions: InspectOptions, format: java.lang.String, param: js.Any*): java.lang.String = js.native
  def inherits(constructor: js.Any, superConstructor: js.Any): scala.Unit = js.native
  /** @deprecated since v4.0.0 - use `Array.isArray()` instead. */
  def isArray(`object`: js.Any): /* is Array */scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'boolean'` instead. */
  def isBoolean(`object`: js.Any): /* is boolean */scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `Buffer.isBuffer()` instead. */
  def isBuffer(`object`: js.Any): /* is Buffer */scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `util.types.isDate()` instead. */
  def isDate(`object`: js.Any): /* is Date */scala.Boolean = js.native
  def isDeepStrictEqual(val1: js.Any, val2: js.Any): scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `util.types.isNativeError()` instead. */
  def isError(`object`: js.Any): /* is Error */scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'function'` instead. */
  def isFunction(`object`: js.Any): scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `value === null` instead. */
  def isNull(`object`: js.Any): /* is null */scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `value === null || value === undefined` instead. */
  def isNullOrUndefined(`object`: js.Any): scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'number'` instead. */
  def isNumber(`object`: js.Any): /* is number */scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `value !== null && typeof value === 'object'` instead. */
  def isObject(`object`: js.Any): scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `(typeof value !== 'object' && typeof value !== 'function') || value === null` instead. */
  def isPrimitive(`object`: js.Any): scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `util.types.isRegExp()` instead. */
  def isRegExp(`object`: js.Any): /* is RegExp */scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'string'` instead. */
  def isString(`object`: js.Any): /* is string */scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'symbol'` instead. */
  def isSymbol(`object`: js.Any): /* is symbol */scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `value === undefined` instead. */
  def isUndefined(`object`: js.Any): /* is undefined */scala.Boolean = js.native
  /** @deprecated since v0.11.3 - use a third party module instead. */
  def log(string: java.lang.String): scala.Unit = js.native
  /** @deprecated since v0.11.3 - use `console.log()` instead. */
  def print(param: js.Any*): scala.Unit = js.native
  def promisify(fn: js.Function): js.Function = js.native
  def promisify(
    fn: js.Function1[
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function0[stdLib.Promise[scala.Unit]] = js.native
  def promisify[T1](
    fn: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* arg1 */ T1, stdLib.Promise[scala.Unit]] = js.native
  def promisify[TCustom /* <: js.Function */](fn: CustomPromisify[TCustom]): TCustom = js.native
  def promisify[T1, T2](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, stdLib.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, stdLib.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3, T4](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, stdLib.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    stdLib.Promise[scala.Unit]
  ] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4T5TResult[T1, T2, T3, T4, T5, TResult](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    stdLib.Promise[TResult]
  ] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4TResult[T1, T2, T3, T4, TResult](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, stdLib.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3TResult[T1, T2, T3, TResult](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, stdLib.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_T1T2TResult[T1, T2, TResult](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, stdLib.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_T1TResult[T1, TResult](
    fn: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* arg1 */ T1, stdLib.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_TResult[TResult](
    fn: js.Function1[
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function0[stdLib.Promise[TResult]] = js.native
  /** @deprecated since v0.11.3 - use `console.log()` instead. */
  def puts(param: js.Any*): scala.Unit = js.native
}

