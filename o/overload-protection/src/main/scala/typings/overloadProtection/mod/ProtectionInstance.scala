package typings.overloadProtection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectionInstance extends js.Object {
  var eventLoopDelay: Double
  var eventLoopOverload: Boolean
  var heapUsedOverload: Boolean
  var maxEventLoopDelay: Double
  var maxHeapUsedBytes: Double
  var maxRssBytes: Double
  var overload: Boolean
  var rssOverload: Boolean
}

object ProtectionInstance {
  @scala.inline
  def apply(
    eventLoopDelay: Double,
    eventLoopOverload: Boolean,
    heapUsedOverload: Boolean,
    maxEventLoopDelay: Double,
    maxHeapUsedBytes: Double,
    maxRssBytes: Double,
    overload: Boolean,
    rssOverload: Boolean
  ): ProtectionInstance = {
    val __obj = js.Dynamic.literal(eventLoopDelay = eventLoopDelay.asInstanceOf[js.Any], eventLoopOverload = eventLoopOverload.asInstanceOf[js.Any], heapUsedOverload = heapUsedOverload.asInstanceOf[js.Any], maxEventLoopDelay = maxEventLoopDelay.asInstanceOf[js.Any], maxHeapUsedBytes = maxHeapUsedBytes.asInstanceOf[js.Any], maxRssBytes = maxRssBytes.asInstanceOf[js.Any], overload = overload.asInstanceOf[js.Any], rssOverload = rssOverload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionInstance]
  }
}

