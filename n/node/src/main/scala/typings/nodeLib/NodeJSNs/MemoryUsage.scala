package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryUsage extends js.Object {
  var external: scala.Double
  var heapTotal: scala.Double
  var heapUsed: scala.Double
  var rss: scala.Double
}

object MemoryUsage {
  @scala.inline
  def apply(external: scala.Double, heapTotal: scala.Double, heapUsed: scala.Double, rss: scala.Double): MemoryUsage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("external")(external)
    __obj.updateDynamic("heapTotal")(heapTotal)
    __obj.updateDynamic("heapUsed")(heapUsed)
    __obj.updateDynamic("rss")(rss)
    __obj.asInstanceOf[MemoryUsage]
  }
}

