package typings.polymer.mod.global.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolymerSplice extends js.Object {
  
  var addedCount: Double = js.native
  
  var index: Double = js.native
  
  var `object`: js.Array[js.Object] = js.native
  
  var removed: js.Array[js.Object] = js.native
  
  var `type`: String = js.native
}
object PolymerSplice {
  
  @scala.inline
  def apply(
    addedCount: Double,
    index: Double,
    `object`: js.Array[js.Object],
    removed: js.Array[js.Object],
    `type`: String
  ): PolymerSplice = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolymerSplice]
  }
  
  @scala.inline
  implicit class PolymerSpliceOps[Self <: PolymerSplice] (val x: Self) extends AnyVal {
    
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
    def setObjectVarargs(value: js.Object*): Self = this.set("object", js.Array(value :_*))
    
    @scala.inline
    def setObject(value: js.Array[js.Object]): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: js.Object*): Self = this.set("removed", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[js.Object]): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
