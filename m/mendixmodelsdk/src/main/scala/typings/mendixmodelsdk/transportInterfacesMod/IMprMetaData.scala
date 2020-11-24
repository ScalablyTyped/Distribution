package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMprMetaData extends js.Object {
  
  /** docs:keep */ var _BuildVersion: String = js.native
  
  /** docs:keep */ var _ProductVersion: String = js.native
  
  /** docs:keep */ var _SchemaHash: String = js.native
}
object IMprMetaData {
  
  @scala.inline
  def apply(_BuildVersion: String, _ProductVersion: String, _SchemaHash: String): IMprMetaData = {
    val __obj = js.Dynamic.literal(_BuildVersion = _BuildVersion.asInstanceOf[js.Any], _ProductVersion = _ProductVersion.asInstanceOf[js.Any], _SchemaHash = _SchemaHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMprMetaData]
  }
  
  @scala.inline
  implicit class IMprMetaDataOps[Self <: IMprMetaData] (val x: Self) extends AnyVal {
    
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
    def set_BuildVersion(value: String): Self = this.set("_BuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ProductVersion(value: String): Self = this.set("_ProductVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_SchemaHash(value: String): Self = this.set("_SchemaHash", value.asInstanceOf[js.Any])
  }
}
