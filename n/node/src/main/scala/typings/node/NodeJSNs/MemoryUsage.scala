package typings.node.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryUsage extends js.Object {
  var external: Double
  var heapTotal: Double
  var heapUsed: Double
  var rss: Double
}

object MemoryUsage {
  @scala.inline
  def apply(external: Double, heapTotal: Double, heapUsed: Double, rss: Double): MemoryUsage = {
    val __obj = js.Dynamic.literal(external = external, heapTotal = heapTotal, heapUsed = heapUsed, rss = rss)
  
    __obj.asInstanceOf[MemoryUsage]
  }
}

