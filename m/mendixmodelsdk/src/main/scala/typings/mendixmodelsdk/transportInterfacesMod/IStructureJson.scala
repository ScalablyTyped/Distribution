package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStructureJson extends js.Object {
  
  @JSName("$ID")
  var $ID: String = js.native
  
  @JSName("$Type")
  var $Type: String = js.native
}
object IStructureJson {
  
  @scala.inline
  def apply($ID: String, $Type: String): IStructureJson = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructureJson]
  }
  
  @scala.inline
  implicit class IStructureJsonOps[Self <: IStructureJson] (val x: Self) extends AnyVal {
    
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
    def set$ID(value: String): Self = this.set("$ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Type(value: String): Self = this.set("$Type", value.asInstanceOf[js.Any])
  }
}
