package typings.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplStatusReplT extends js.Object {
  
  var ismaster: Boolean = js.native
}
object ReplStatusReplT {
  
  @scala.inline
  def apply(ismaster: Boolean): ReplStatusReplT = {
    val __obj = js.Dynamic.literal(ismaster = ismaster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplStatusReplT]
  }
  
  @scala.inline
  implicit class ReplStatusReplTOps[Self <: ReplStatusReplT] (val x: Self) extends AnyVal {
    
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
    def setIsmaster(value: Boolean): Self = this.set("ismaster", value.asInstanceOf[js.Any])
  }
}
