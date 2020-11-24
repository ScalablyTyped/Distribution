package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemPocket extends js.Object {
  
  var generations: js.Array[Double] = js.native
  
  var pocket: String = js.native
}
object ItemPocket {
  
  @scala.inline
  def apply(generations: js.Array[Double], pocket: String): ItemPocket = {
    val __obj = js.Dynamic.literal(generations = generations.asInstanceOf[js.Any], pocket = pocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPocket]
  }
  
  @scala.inline
  implicit class ItemPocketOps[Self <: ItemPocket] (val x: Self) extends AnyVal {
    
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
    def setGenerationsVarargs(value: Double*): Self = this.set("generations", js.Array(value :_*))
    
    @scala.inline
    def setGenerations(value: js.Array[Double]): Self = this.set("generations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPocket(value: String): Self = this.set("pocket", value.asInstanceOf[js.Any])
  }
}
