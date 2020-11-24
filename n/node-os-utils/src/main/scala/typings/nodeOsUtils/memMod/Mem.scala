package typings.nodeOsUtils.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mem extends js.Object {
  
  def free(): js.Promise[MemFreeInfo] = js.native
  
  def info(): js.Promise[MemInfo] = js.native
  
  def totalMem(): Double = js.native
  
  def used(): js.Promise[MemUsedInfo] = js.native
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
  
  @scala.inline
  implicit class MemOps[Self <: Mem] (val x: Self) extends AnyVal {
    
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
    def setFree(value: () => js.Promise[MemFreeInfo]): Self = this.set("free", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInfo(value: () => js.Promise[MemInfo]): Self = this.set("info", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTotalMem(value: () => Double): Self = this.set("totalMem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsed(value: () => js.Promise[MemUsedInfo]): Self = this.set("used", js.Any.fromFunction0(value))
  }
}
