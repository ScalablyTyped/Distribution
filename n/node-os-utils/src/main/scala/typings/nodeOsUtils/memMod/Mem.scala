package typings.nodeOsUtils.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mem extends js.Object {
  def free(): js.Promise[MemFreeInfo]
  def info(): js.Promise[MemInfo]
  def totalMem(): Double
  def used(): js.Promise[MemUsedInfo]
}

object Mem {
  @scala.inline
  def apply(
    free: () => js.Promise[MemFreeInfo],
    info: () => js.Promise[MemInfo],
    totalMem: () => Double,
    used: () => js.Promise[MemUsedInfo]
  ): Mem = {
    val __obj = js.Dynamic.literal(free = js.Any.fromFunction0(free), info = js.Any.fromFunction0(info), totalMem = js.Any.fromFunction0(totalMem), used = js.Any.fromFunction0(used))
  
    __obj.asInstanceOf[Mem]
  }
}

