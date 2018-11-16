package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "LongPoll")
@js.native
class LongPoll protected () extends js.Object {
  def this(endPoint: java.lang.String) = this()
  def close(): scala.Unit = js.native
  def close(code: js.Any): scala.Unit = js.native
  def close(code: js.Any, reason: js.Any): scala.Unit = js.native
  def closeAndRetry(): scala.Unit = js.native
  def endpointURL(): java.lang.String = js.native
  def normalizeEndpoint(endPoint: java.lang.String): java.lang.String = js.native
  def ontimeout(): scala.Unit = js.native
  def poll(): scala.Unit = js.native
  def send(body: js.Any): scala.Unit = js.native
}

