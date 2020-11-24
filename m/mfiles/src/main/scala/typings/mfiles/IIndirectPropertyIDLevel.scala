package typings.mfiles

import typings.mfiles.MFiles.MFIndirectPropertyIDLevelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIndirectPropertyIDLevel extends js.Object {
  
  def Clone(): IIndirectPropertyIDLevel = js.native
  
  var ID: Double = js.native
  
  var LevelType: MFIndirectPropertyIDLevelType = js.native
  
  def ToJSON(): String = js.native
}
object IIndirectPropertyIDLevel {
  
  @scala.inline
  def apply(
    Clone: () => IIndirectPropertyIDLevel,
    ID: Double,
    LevelType: MFIndirectPropertyIDLevelType,
    ToJSON: () => String
  ): IIndirectPropertyIDLevel = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], LevelType = LevelType.asInstanceOf[js.Any], ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IIndirectPropertyIDLevel]
  }
  
  @scala.inline
  implicit class IIndirectPropertyIDLevelOps[Self <: IIndirectPropertyIDLevel] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IIndirectPropertyIDLevel): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelType(value: MFIndirectPropertyIDLevelType): Self = this.set("LevelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("ToJSON", js.Any.fromFunction0(value))
  }
}
