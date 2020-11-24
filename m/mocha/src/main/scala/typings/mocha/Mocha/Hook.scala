package typings.mocha.Mocha

import typings.mocha.mochaStrings.hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion Runner untyped events
/**
  * Initialize a new `Hook` with the given `title` and callback `fn`
  *
  * @see https://mochajs.org/api/Hook.html
  */
@js.native
trait Hook extends Runnable {
  
  var _error: js.Any = js.native
  
   // added by Runner
  /**
    * Get the test `err`.
    *
    * @see https://mochajs.org/api/Hook.html#error
    */
  def error(): js.Any = js.native
  /**
    * Set the test `err`.
    *
    * @see https://mochajs.org/api/Hook.html#error
    */
  def error(err: js.Any): Unit = js.native
  
  var originalTitle: js.UndefOr[String] = js.native
  
  var `type`: hook = js.native
}
