package typings.pdfmake.anon

import typings.pdfmake.interfacesMod.OrderedListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Counter extends js.Object {
  
  var counter: js.UndefOr[Double] = js.native
  
  var listType: js.UndefOr[OrderedListType] = js.native
}
object Counter {
  
  @scala.inline
  def apply(): Counter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Counter]
  }
  
  @scala.inline
  implicit class CounterOps[Self <: Counter] (val x: Self) extends AnyVal {
    
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
    def setCounter(value: Double): Self = this.set("counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    
    @scala.inline
    def setListType(value: OrderedListType): Self = this.set("listType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListType: Self = this.set("listType", js.undefined)
  }
}
