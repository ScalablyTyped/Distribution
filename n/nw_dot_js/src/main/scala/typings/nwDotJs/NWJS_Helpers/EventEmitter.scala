package typings.nwDotJs.NWJS_Helpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node.js v6.x EventEmitter Class
  */
@JSGlobal("NWJS_Helpers.EventEmitter")
@js.native
class EventEmitter ()
  extends typings.node.NodeJS.EventEmitter {
  def addListener(event: String, listener: js.Function): this.type = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  def once(event: String, listener: js.Function): this.type = js.native
  def removeListener(event: String, listener: js.Function): this.type = js.native
}

/* static members */
@JSGlobal("NWJS_Helpers.EventEmitter")
@js.native
object EventEmitter extends js.Object {
  var EventEmitter: typings.nwDotJs.NWJS_Helpers.EventEmitter = js.native
   // deprecated
  var defaultMaxListeners: Double = js.native
  def listenerCount(emitter: EventEmitter, event: String): Double = js.native
}

