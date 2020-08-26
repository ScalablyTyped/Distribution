package typings.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeapInfo extends js.Object {
  var does_zap_garbage: DoesZapCodeSpaceFlag = js.native
  var heap_size_limit: Double = js.native
  var malloced_memory: Double = js.native
  var number_of_detached_contexts: Double = js.native
  var number_of_native_contexts: Double = js.native
  var peak_malloced_memory: Double = js.native
  var total_available_size: Double = js.native
  var total_heap_size: Double = js.native
  var total_heap_size_executable: Double = js.native
  var total_physical_size: Double = js.native
  var used_heap_size: Double = js.native
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
  @scala.inline
  implicit class HeapInfoOps[Self <: HeapInfo] (val x: Self) extends AnyVal {
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
    def setDoes_zap_garbage(value: DoesZapCodeSpaceFlag): Self = this.set("does_zap_garbage", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeap_size_limit(value: Double): Self = this.set("heap_size_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMalloced_memory(value: Double): Self = this.set("malloced_memory", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber_of_detached_contexts(value: Double): Self = this.set("number_of_detached_contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber_of_native_contexts(value: Double): Self = this.set("number_of_native_contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeak_malloced_memory(value: Double): Self = this.set("peak_malloced_memory", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_available_size(value: Double): Self = this.set("total_available_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_heap_size(value: Double): Self = this.set("total_heap_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_heap_size_executable(value: Double): Self = this.set("total_heap_size_executable", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_physical_size(value: Double): Self = this.set("total_physical_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_heap_size(value: Double): Self = this.set("used_heap_size", value.asInstanceOf[js.Any])
  }
  
}

