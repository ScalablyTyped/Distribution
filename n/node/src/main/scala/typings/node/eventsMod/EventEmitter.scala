package typings.node.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("events", "EventEmitter")
@js.native
class EventEmitter ()
  extends typings.node.eventsMod.global.NodeJS.EventEmitter {
  def this(options: EventEmitterOptions) = this()
}

/* static members */
@JSImport("events", "EventEmitter")
@js.native
object EventEmitter extends js.Object {
  var defaultMaxListeners: Double = js.native
  /**
    * This symbol shall be used to install a listener for only monitoring `'error'`
    * events. Listeners installed using this symbol are called before the regular
    * `'error'` listeners are called.
    *
    * Installing a listener using this symbol does not change the behavior once an
    * `'error'` event is emitted, therefore the process will still crash if no
    * regular `'error'` listener is installed.
    */
  val errorMonitor: js.Symbol = js.native
  /** @deprecated since v4.0.0 */
  def listenerCount(emitter: EventEmitter, event: String): Double = js.native
  def listenerCount(emitter: EventEmitter, event: js.Symbol): Double = js.native
}

