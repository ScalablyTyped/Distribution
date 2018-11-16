package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function): this.type = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  def getMaxListeners(): scala.Double = js.native
  def listenerCount(`type`: java.lang.String): scala.Double = js.native
  def listenerCount(`type`: js.Symbol): scala.Double = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  def once(event: js.Symbol, listener: js.Function): this.type = js.native
  def prependListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function): this.type = js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function): this.type = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: java.lang.String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  def removeListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function): this.type = js.native
  def setMaxListeners(n: scala.Double): this.type = js.native
}

