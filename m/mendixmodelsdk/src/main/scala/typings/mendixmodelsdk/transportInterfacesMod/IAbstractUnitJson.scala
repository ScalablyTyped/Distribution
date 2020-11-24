package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstractUnitJson extends IStructureJson {
  
  var containerId: String = js.native
  
  var containmentName: String = js.native
}
object IAbstractUnitJson {
  
  @scala.inline
  def apply($ID: String, $Type: String, containerId: String, containmentName: String): IAbstractUnitJson = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any], containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractUnitJson]
  }
  
  @scala.inline
  implicit class IAbstractUnitJsonOps[Self <: IAbstractUnitJson] (val x: Self) extends AnyVal {
    
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
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainmentName(value: String): Self = this.set("containmentName", value.asInstanceOf[js.Any])
  }
}
