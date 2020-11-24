package typings.nodeTlv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOLConstructed extends js.Object {
  
  def count(): Double = js.native
  
  def find(args: js.Any*): TL = js.native
  
  def getDolRelatedDataLength(): Double = js.native
  
  def getList(): js.Array[TL] = js.native
  
  var list: js.Array[TL] = js.native
  
  def print(): Unit = js.native
  
  def setValue(args: js.Any*): js.Array[TLV] = js.native
}
object DOLConstructed {
  
  @scala.inline
  def apply(
    count: () => Double,
    find: /* repeated */ js.Any => TL,
    getDolRelatedDataLength: () => Double,
    getList: () => js.Array[TL],
    list: js.Array[TL],
    print: () => Unit,
    setValue: /* repeated */ js.Any => js.Array[TLV]
  ): DOLConstructed = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), find = js.Any.fromFunction1(find), getDolRelatedDataLength = js.Any.fromFunction0(getDolRelatedDataLength), getList = js.Any.fromFunction0(getList), list = list.asInstanceOf[js.Any], print = js.Any.fromFunction0(print), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[DOLConstructed]
  }
  
  @scala.inline
  implicit class DOLConstructedOps[Self <: DOLConstructed] (val x: Self) extends AnyVal {
    
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
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFind(value: /* repeated */ js.Any => TL): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDolRelatedDataLength(value: () => Double): Self = this.set("getDolRelatedDataLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetList(value: () => js.Array[TL]): Self = this.set("getList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setListVarargs(value: TL*): Self = this.set("list", js.Array(value :_*))
    
    @scala.inline
    def setList(value: js.Array[TL]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: () => Unit): Self = this.set("print", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValue(value: /* repeated */ js.Any => js.Array[TLV]): Self = this.set("setValue", js.Any.fromFunction1(value))
  }
}
