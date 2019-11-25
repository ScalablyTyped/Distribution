package typings.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapInfo extends js.Object {
  var does_zap_garbage: DoesZapCodeSpaceFlag
  var heap_size_limit: Double
  var malloced_memory: Double
  var number_of_detached_contexts: Double
  var number_of_native_contexts: Double
  var peak_malloced_memory: Double
  var total_available_size: Double
  var total_heap_size: Double
  var total_heap_size_executable: Double
  var total_physical_size: Double
  var used_heap_size: Double
}

object HeapInfo {
  @scala.inline
  def apply(
    does_zap_garbage: DoesZapCodeSpaceFlag,
    heap_size_limit: Double,
    malloced_memory: Double,
    number_of_detached_contexts: Double,
    number_of_native_contexts: Double,
    peak_malloced_memory: Double,
    total_available_size: Double,
    total_heap_size: Double,
    total_heap_size_executable: Double,
    total_physical_size: Double,
    used_heap_size: Double
  ): HeapInfo = {
    val __obj = js.Dynamic.literal(does_zap_garbage = does_zap_garbage.asInstanceOf[js.Any], heap_size_limit = heap_size_limit.asInstanceOf[js.Any], malloced_memory = malloced_memory.asInstanceOf[js.Any], number_of_detached_contexts = number_of_detached_contexts.asInstanceOf[js.Any], number_of_native_contexts = number_of_native_contexts.asInstanceOf[js.Any], peak_malloced_memory = peak_malloced_memory.asInstanceOf[js.Any], total_available_size = total_available_size.asInstanceOf[js.Any], total_heap_size = total_heap_size.asInstanceOf[js.Any], total_heap_size_executable = total_heap_size_executable.asInstanceOf[js.Any], total_physical_size = total_physical_size.asInstanceOf[js.Any], used_heap_size = used_heap_size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeapInfo]
  }
}

