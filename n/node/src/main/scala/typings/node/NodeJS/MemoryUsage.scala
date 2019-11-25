package typings.node.NodeJS

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
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemoryUsage]
  }
}

