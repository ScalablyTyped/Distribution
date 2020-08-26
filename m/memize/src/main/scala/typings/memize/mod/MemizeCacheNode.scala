package typings.memize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal cache entry.
  */
@js.native
trait MemizeCacheNode extends js.Object {
  /**
    * Function arguments for cache
    * entry.
    */
  var args: js.Array[_] = js.native
  /**
    * Next node.
    */
  var next: js.UndefOr[MemizeCacheNode | Null] = js.native
  /**
    * Previous node.
    */
  var prev: js.UndefOr[MemizeCacheNode | Null] = js.native
  /**
    * Function result.
    */
  var `val`: js.Any = js.native
}

object MemizeCacheNode {
  @scala.inline
  def apply(args: js.Array[_], `val`: js.Any): MemizeCacheNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemizeCacheNode]
  }
  @scala.inline
  implicit class MemizeCacheNodeOps[Self <: MemizeCacheNode] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setVal(value: js.Any): Self = this.set("val", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: MemizeCacheNode): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    @scala.inline
    def setPrev(value: MemizeCacheNode): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    @scala.inline
    def setPrevNull: Self = this.set("prev", null)
  }
  
}

