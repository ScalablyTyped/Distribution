package typings
package nodeLib.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapInfo extends js.Object {
  var does_zap_garbage: DoesZapCodeSpaceFlag
  var heap_size_limit: scala.Double
  var malloced_memory: scala.Double
  var peak_malloced_memory: scala.Double
  var total_available_size: scala.Double
  var total_heap_size: scala.Double
  var total_heap_size_executable: scala.Double
  var total_physical_size: scala.Double
  var used_heap_size: scala.Double
}

