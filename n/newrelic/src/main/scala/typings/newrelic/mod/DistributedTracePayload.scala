package typings.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributedTracePayload extends js.Object {
  /**
    * The base64 encoded JSON representation of the distributed trace payload.
    */
  def httpSafe(): String
  /**
    * The base64 encoded JSON representation of the distributed trace payload.
    */
  def text(): String
}

object DistributedTracePayload {
  @scala.inline
  def apply(httpSafe: () => String, text: () => String): DistributedTracePayload = {
    val __obj = js.Dynamic.literal(httpSafe = js.Any.fromFunction0(httpSafe), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[DistributedTracePayload]
  }
}

