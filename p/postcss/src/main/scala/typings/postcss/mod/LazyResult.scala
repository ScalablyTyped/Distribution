package typings.postcss.mod

import typings.postcss.anon.FnCall
import typings.postcss.anon.FnCallOnrejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A promise proxy for the result of PostCSS transformations.
  */
@js.native
trait LazyResult extends js.Object {
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  @JSName("catch")
  var catch_Original: FnCallOnrejected = js.native
  /**
    * Alias for css property to use when syntaxes generate non-CSS output.
    */
  var content: String = js.native
  /**
    * Processes input CSS through synchronous plugins and converts Root to
    * CSS string. This property will only work with synchronous plugins. If
    * the processor contains any asynchronous plugins it will throw an error.
    * In this case, you should use LazyResult#then() instead.
    * @returns Result#css.
    */
  var css: String = js.native
  /**
    * Processes input CSS through synchronous plugins. This property will
    * work only with synchronous plugins. If processor contains any
    * asynchronous plugins it will throw an error. You should use
    * LazyResult#then() instead.
    */
  var map: ResultMap = js.native
  /**
    * Processes input CSS through synchronous plugins. This property will work
    * only with synchronous plugins. If processor contains any asynchronous
    * plugins it will throw an error. You should use LazyResult#then() instead.
    */
  var messages: js.Array[ResultMessage] = js.native
  /**
    * @returns Options from the Processor#process(css, opts) call that produced
    * this Result instance.
    */
  var opts: ResultOptions = js.native
  /**
    * @returns A processor used for CSS transformations.
    */
  var processor: Processor = js.native
  /**
    * Processes input CSS through synchronous plugins. This property will work
    * only with synchronous plugins. If processor contains any asynchronous
    * plugins it will throw an error. You should use LazyResult#then() instead.
    */
  var root: Root_ = js.native
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  @JSName("then")
  var then_Original: FnCall = js.native
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `catch`[TResult](): js.Promise[Result | TResult] = js.native
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Result | TResult] = js.native
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Result, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ Result, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  /**
    * Processes input CSS through synchronous plugins and calls Result#warnings().
    * This property will only work with synchronous plugins. If the processor
    * contains any asynchronous plugins it will throw an error. In this case,
    * you should use LazyResult#then() instead.
    */
  def warnings(): js.Array[Warning] = js.native
}

