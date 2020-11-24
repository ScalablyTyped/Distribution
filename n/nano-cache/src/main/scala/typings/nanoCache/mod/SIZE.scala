package typings.nanoCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SIZE extends js.Object {
  
  var GB: Double = js.native
  
  var KB: Double = js.native
  
  var MB: Double = js.native
}
object SIZE {
  
  @scala.inline
  def apply(GB: Double, KB: Double, MB: Double): SIZE = {
    val __obj = js.Dynamic.literal(GB = GB.asInstanceOf[js.Any], KB = KB.asInstanceOf[js.Any], MB = MB.asInstanceOf[js.Any])
    __obj.asInstanceOf[SIZE]
  }
  
  @scala.inline
  implicit class SIZEOps[Self <: SIZE] (val x: Self) extends AnyVal {
    
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
    def setGB(value: Double): Self = this.set("GB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKB(value: Double): Self = this.set("KB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMB(value: Double): Self = this.set("MB", value.asInstanceOf[js.Any])
  }
}
