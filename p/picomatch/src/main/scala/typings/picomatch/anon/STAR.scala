package typings.picomatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait STAR extends js.Object {
  
  var STAR: String = js.native
}
object STAR {
  
  @scala.inline
  def apply(STAR: String): STAR = {
    val __obj = js.Dynamic.literal(STAR = STAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[STAR]
  }
  
  @scala.inline
  implicit class STAROps[Self <: STAR] (val x: Self) extends AnyVal {
    
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
    def setSTAR(value: String): Self = this.set("STAR", value.asInstanceOf[js.Any])
  }
}
