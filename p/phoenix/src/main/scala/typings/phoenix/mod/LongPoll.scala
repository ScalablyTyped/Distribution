package typings.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "LongPoll")
@js.native
class LongPoll protected () extends js.Object {
  def this(endPoint: String) = this()
  def close(): Unit = js.native
  def close(code: js.Any): Unit = js.native
  def close(code: js.Any, reason: js.Any): Unit = js.native
  def closeAndRetry(): Unit = js.native
  def endpointURL(): String = js.native
  def normalizeEndpoint(endPoint: String): String = js.native
  def ontimeout(): Unit = js.native
  def poll(): Unit = js.native
  def send(body: js.Any): Unit = js.native
}

