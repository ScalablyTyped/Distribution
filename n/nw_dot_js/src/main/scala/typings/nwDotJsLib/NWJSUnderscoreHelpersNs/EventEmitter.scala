package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Node.js v6.x EventEmitter Class
     */
@JSGlobal("NWJS_Helpers.EventEmitter")
@js.native
class EventEmitter ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  def removeListener(event: java.lang.String, listener: js.Function): this.type = js.native
}

/**
     * Node.js v6.x EventEmitter Class
     */
@JSGlobal("NWJS_Helpers.EventEmitter")
@js.native
object EventEmitter extends js.Object {
  var EventEmitter: nwDotJsLib.NWJSUnderscoreHelpersNs.EventEmitter = js.native
   // deprecated
  var defaultMaxListeners: scala.Double = js.native
  def listenerCount(emitter: nwDotJsLib.NWJSUnderscoreHelpersNs.EventEmitter, event: java.lang.String): scala.Double = js.native
}

