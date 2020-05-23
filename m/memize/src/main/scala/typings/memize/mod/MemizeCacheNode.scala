package typings.memize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal cache entry.
  */
trait MemizeCacheNode extends js.Object {
  /**
    * Function arguments for cache
    * entry.
    */
  var args: js.Array[_]
  /**
    * Next node.
    */
  var next: js.UndefOr[MemizeCacheNode | Null] = js.undefined
  /**
    * Previous node.
    */
  var prev: js.UndefOr[MemizeCacheNode | Null] = js.undefined
  /**
    * Function result.
    */
  var `val`: js.Any
}

object MemizeCacheNode {
  @scala.inline
  def apply(
    args: js.Array[_],
    `val`: js.Any,
    next: js.UndefOr[Null | MemizeCacheNode] = js.undefined,
    prev: js.UndefOr[Null | MemizeCacheNode] = js.undefined
  ): MemizeCacheNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (!js.isUndefined(prev)) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemizeCacheNode]
  }
}

