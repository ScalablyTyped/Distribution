package typings.polymer.mod.global.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArraySplice extends js.Object {
  
  def calculateSplices[T](current: js.Array[T], previous: js.Array[T]): js.Array[PolymerSplice] = js.native
}
object ArraySplice {
  
  @scala.inline
  def apply(calculateSplices: (js.Array[js.Any], js.Array[js.Any]) => js.Array[PolymerSplice]): ArraySplice = {
    val __obj = js.Dynamic.literal(calculateSplices = js.Any.fromFunction2(calculateSplices))
    __obj.asInstanceOf[ArraySplice]
  }
  
  @scala.inline
  implicit class ArraySpliceOps[Self <: ArraySplice] (val x: Self) extends AnyVal {
    
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
    def setCalculateSplices(value: (js.Array[js.Any], js.Array[js.Any]) => js.Array[PolymerSplice]): Self = this.set("calculateSplices", js.Any.fromFunction2(value))
  }
}
