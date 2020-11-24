package typings.nodeWit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-wit", "log")
@js.native
object log extends js.Object {
  
  val DEBUG: String = js.native
  
  val ERROR: String = js.native
  
  val INFO: String = js.native
  
  val WARN: String = js.native
  
  @js.native
  class Logger protected () extends js.Object {
    def this(level: String) = this()
  }
}
