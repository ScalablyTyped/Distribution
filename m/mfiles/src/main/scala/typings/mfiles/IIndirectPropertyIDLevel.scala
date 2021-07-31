package typings.mfiles

import typings.mfiles.MFiles.MFIndirectPropertyIDLevelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIndirectPropertyIDLevel extends StObject {
  
  def Clone(): IIndirectPropertyIDLevel
  
  var ID: Double
  
  var LevelType: MFIndirectPropertyIDLevelType
  
  def ToJSON(): String
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
  implicit class IIndirectPropertyIDLevelMutableBuilder[Self <: IIndirectPropertyIDLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IIndirectPropertyIDLevel): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelType(value: MFIndirectPropertyIDLevelType): Self = StObject.set(x, "LevelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
  }
}
