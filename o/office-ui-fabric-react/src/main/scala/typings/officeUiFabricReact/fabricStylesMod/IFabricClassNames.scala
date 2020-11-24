package typings.officeUiFabricReact.fabricStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFabricClassNames extends js.Object {
  
  var bodyThemed: String = js.native
  
  var root: String = js.native
}
object IFabricClassNames {
  
  @scala.inline
  def apply(bodyThemed: String, root: String): IFabricClassNames = {
    val __obj = js.Dynamic.literal(bodyThemed = bodyThemed.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFabricClassNames]
  }
  
  @scala.inline
  implicit class IFabricClassNamesOps[Self <: IFabricClassNames] (val x: Self) extends AnyVal {
    
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
    def setBodyThemed(value: String): Self = this.set("bodyThemed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
