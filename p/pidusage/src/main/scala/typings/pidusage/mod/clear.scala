package typings.pidusage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pidusage", "clear")
@js.native
object clear extends js.Object {
  /**
    * If needed this function can be used to clear the event loop.
    * Indeed, we're registering an interval to free up the in-memory metrics.
    * By calling this, it will clear this interval and all delete all in-memory data
    */
  def apply(): Unit = js.native
}

