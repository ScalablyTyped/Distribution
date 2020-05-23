package typings.memize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of the enhanced function for controlling cache.
  */
trait MemizeMemoizedFunction extends js.Object {
  /**
    * Clear the cache.
    */
  def clear(): Unit
}

object MemizeMemoizedFunction {
  @scala.inline
  def apply(clear: () => Unit): MemizeMemoizedFunction = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[MemizeMemoizedFunction]
  }
}

