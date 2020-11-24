package typings.polymerTs.anon

import typings.polymerTs.polymerTsStrings.splice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddedCount extends js.Object {
  
  var addedCount: Double = js.native
  
  var index: Double = js.native
  
  var `object`: js.Array[_] = js.native
  
  var removed: js.Array[_] = js.native
  
  var `type`: splice = js.native
}
object AddedCount {
  
  @scala.inline
  def apply(addedCount: Double, index: Double, `object`: js.Array[_], removed: js.Array[_], `type`: splice): AddedCount = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedCount]
  }
  
  @scala.inline
  implicit class AddedCountOps[Self <: AddedCount] (val x: Self) extends AnyVal {
    
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
    def setObjectVarargs(value: js.Any*): Self = this.set("object", js.Array(value :_*))
    
    @scala.inline
    def setObject(value: js.Array[_]): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: js.Any*): Self = this.set("removed", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[_]): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: splice): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
