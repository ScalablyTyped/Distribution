package typings
package nodeDashWitLib.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-wit", "log")
@js.native
object logNs extends js.Object {
  @js.native
  class Logger protected () extends js.Object {
    def this(level: java.lang.String) = this()
  }
  
  val DEBUG: java.lang.String = js.native
  val ERROR: java.lang.String = js.native
  val INFO: java.lang.String = js.native
  val WARN: java.lang.String = js.native
}

