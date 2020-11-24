package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavImagesValues extends js.Object {
  
  var DOWN: String = js.native
  
  var GROUP: String = js.native
  
  var HOVER: String = js.native
  
  var REST: String = js.native
}
object NavImagesValues {
  
  @scala.inline
  def apply(DOWN: String, GROUP: String, HOVER: String, REST: String): NavImagesValues = {
    val __obj = js.Dynamic.literal(DOWN = DOWN.asInstanceOf[js.Any], GROUP = GROUP.asInstanceOf[js.Any], HOVER = HOVER.asInstanceOf[js.Any], REST = REST.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavImagesValues]
  }
  
  @scala.inline
  implicit class NavImagesValuesOps[Self <: NavImagesValues] (val x: Self) extends AnyVal {
    
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
    def setDOWN(value: String): Self = this.set("DOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGROUP(value: String): Self = this.set("GROUP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHOVER(value: String): Self = this.set("HOVER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREST(value: String): Self = this.set("REST", value.asInstanceOf[js.Any])
  }
}
