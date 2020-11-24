package typings.modesl.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("modesl", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(opts: js.Any) = this()
  def this(opts: js.Any, readycb: js.Function0[Unit]) = this()
  
  def close(callback: js.Any): Unit = js.native
}
