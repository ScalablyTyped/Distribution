package typings.opentypeJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LowMemory extends js.Object {
  
  var lowMemory: Boolean = js.native
}
object LowMemory {
  
  @scala.inline
  def apply(lowMemory: Boolean): LowMemory = {
    val __obj = js.Dynamic.literal(lowMemory = lowMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowMemory]
  }
  
  @scala.inline
  implicit class LowMemoryOps[Self <: LowMemory] (val x: Self) extends AnyVal {
    
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
    def setLowMemory(value: Boolean): Self = this.set("lowMemory", value.asInstanceOf[js.Any])
  }
}
