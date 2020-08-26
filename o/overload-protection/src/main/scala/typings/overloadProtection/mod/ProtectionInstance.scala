package typings.overloadProtection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectionInstance extends js.Object {
  var eventLoopDelay: Double = js.native
  var eventLoopOverload: Boolean = js.native
  var heapUsedOverload: Boolean = js.native
  var maxEventLoopDelay: Double = js.native
  var maxHeapUsedBytes: Double = js.native
  var maxRssBytes: Double = js.native
  var overload: Boolean = js.native
  var rssOverload: Boolean = js.native
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
  @scala.inline
  implicit class ProtectionInstanceOps[Self <: ProtectionInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventLoopDelay(value: Double): Self = this.set("eventLoopDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventLoopOverload(value: Boolean): Self = this.set("eventLoopOverload", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeapUsedOverload(value: Boolean): Self = this.set("heapUsedOverload", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxEventLoopDelay(value: Double): Self = this.set("maxEventLoopDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxHeapUsedBytes(value: Double): Self = this.set("maxHeapUsedBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxRssBytes(value: Double): Self = this.set("maxRssBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverload(value: Boolean): Self = this.set("overload", value.asInstanceOf[js.Any])
    @scala.inline
    def setRssOverload(value: Boolean): Self = this.set("rssOverload", value.asInstanceOf[js.Any])
  }
  
}

