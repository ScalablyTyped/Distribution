package typings
package mochaLib.mochaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Runnable "error" event
// #region Runnable untyped events
// #region Runnable "error" event
/**
     * Initialize a new `Runnable` with the given `title` and callback `fn`.
     *
     * @see https://mochajs.org/api/Runnable.html
     */
@JSImport("mocha", "Runnable")
@js.native
class Runnable protected ()
  extends mochaLib.MochaNs.Runnable {
  def this(title: java.lang.String) = this()
  def this(title: java.lang.String, fn: mochaLib.MochaNs.AsyncFunc) = this()
  def this(title: java.lang.String, fn: mochaLib.MochaNs.Func) = this()
}

