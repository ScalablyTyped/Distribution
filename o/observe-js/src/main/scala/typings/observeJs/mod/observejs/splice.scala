package typings.observeJs.mod.observejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*----------------------
  ArrayObserver
  ----------------------*/
@js.native
trait splice extends js.Object {
  
  /**
    * the number of element which were inserted
    */
  var addedCount: Double = js.native
  
  /**
    * the index position that the change occured
    */
  var index: Double = js.native
  
  /**
    * an array of values representing the sequence of removed elements
    */
  var removed: js.Array[_] = js.native
}
object splice {
  
  @scala.inline
  def apply(addedCount: Double, index: Double, removed: js.Array[_]): splice = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[splice]
  }
  
  @scala.inline
  implicit class spliceOps[Self <: splice] (val x: Self) extends AnyVal {
    
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
    def setAddedCount(value: Double): Self = this.set("addedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: js.Any*): Self = this.set("removed", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[_]): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
}
