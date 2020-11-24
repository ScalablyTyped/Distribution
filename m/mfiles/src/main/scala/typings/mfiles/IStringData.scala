package typings.mfiles

import typings.mfiles.MFiles.MFStringDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStringData extends js.Object {
  
  var AsString: String = js.native
  
  def Clone(): IStringData = js.native
  
  val StringDataType: MFStringDataType = js.native
}
object IStringData {
  
  @scala.inline
  def apply(AsString: String, Clone: () => IStringData, StringDataType: MFStringDataType): IStringData = {
    val __obj = js.Dynamic.literal(AsString = AsString.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), StringDataType = StringDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringData]
  }
  
  @scala.inline
  implicit class IStringDataOps[Self <: IStringData] (val x: Self) extends AnyVal {
    
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
    def setAsString(value: String): Self = this.set("AsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IStringData): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStringDataType(value: MFStringDataType): Self = this.set("StringDataType", value.asInstanceOf[js.Any])
  }
}
