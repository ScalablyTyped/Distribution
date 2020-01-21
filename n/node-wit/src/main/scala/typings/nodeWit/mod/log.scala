package typings.nodeWit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-wit", "log")
@js.native
object log extends js.Object {
  @js.native
  class Logger protected () extends js.Object {
    def this(level: String) = this()
  }
  
  val DEBUG: String = js.native
  val ERROR: String = js.native
  val INFO: String = js.native
  val WARN: String = js.native
}

