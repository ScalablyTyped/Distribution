package typings.memize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of the enhanced function for controlling cache.
  */
@js.native
trait MemizeMemoizedFunction extends js.Object {
  /**
    * Clear the cache.
    */
  def clear(): Unit = js.native
}

object MemizeMemoizedFunction {
  @scala.inline
  def apply(clear: () => Unit): MemizeMemoizedFunction = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[MemizeMemoizedFunction]
  }
  @scala.inline
  implicit class MemizeMemoizedFunctionOps[Self <: MemizeMemoizedFunction] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
  }
  
}

