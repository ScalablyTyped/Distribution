package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A promise proxy for the result of PostCSS transformations.
  */
@js.native
trait LazyResult extends js.Object {
  /**
    * Alias for css property to use when syntaxes generate non-CSS output.
    */
  var content: java.lang.String = js.native
  /**
    * Processes input CSS through synchronous plugins and converts Root to
    * CSS string. This property will only work with synchronous plugins. If
    * the processor contains any asynchronous plugins it will throw an error.
    * In this case, you should use LazyResult#then() instead.
    * @returns Result#css.
    */
  var css: java.lang.String = js.native
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
  var root: Root = js.native
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `catch`(onRejected: js.Function1[/* error */ stdLib.Error, scala.Unit]): js.Function | js.Any = js.native
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `then`(onFulfilled: js.Function1[/* result */ Result, scala.Unit]): js.Function | js.Any = js.native
  def `then`(
    onFulfilled: js.Function1[/* result */ Result, scala.Unit],
    onRejected: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): js.Function | js.Any = js.native
  /**
    * Processes input CSS through synchronous plugins and calls Result#warnings().
    * This property will only work with synchronous plugins. If the processor
    * contains any asynchronous plugins it will throw an error. In this case,
    * you should use LazyResult#then() instead.
    */
  def warnings(): js.Array[ResultMessage] = js.native
}

