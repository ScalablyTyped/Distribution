package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Load extends js.Object {
  
  var load: js.UndefOr[String] = js.native
  
  var original: js.UndefOr[String] = js.native
}
object Load {
  
  @scala.inline
  def apply(): Load = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Load]
  }
  
  @scala.inline
  implicit class LoadOps[Self <: Load] (val x: Self) extends AnyVal {
    
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
    def setLoad(value: String): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setOriginal(value: String): Self = this.set("original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginal: Self = this.set("original", js.undefined)
  }
}
