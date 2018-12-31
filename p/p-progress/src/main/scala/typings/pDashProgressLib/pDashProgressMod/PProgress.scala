package typings
package pDashProgressLib.pDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PProgress[T]
  extends stdLib.Promise[T] {
  /**
    * The current progress percentage of the promise as a number between 0 and
    * 1.
    */
  var progress: scala.Double = js.native
  /**
    * Accepts a function that gets `instance.progress` as an argument and is
    * called for every progress event.
    *
    * @throws {TypeError}
    */
  def onProgress(cb: js.Function1[/* progress */ scala.Double, scala.Unit]): scala.Unit = js.native
}

