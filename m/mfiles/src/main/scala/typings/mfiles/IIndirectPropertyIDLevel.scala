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
  
  inline def apply(
    Clone: () => IIndirectPropertyIDLevel,
    ID: Double,
    LevelType: MFIndirectPropertyIDLevelType,
    ToJSON: () => String
  ): IIndirectPropertyIDLevel = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], LevelType = LevelType.asInstanceOf[js.Any], ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IIndirectPropertyIDLevel]
  }
  
  extension [Self <: IIndirectPropertyIDLevel](x: Self) {
    
    inline def setClone(value: () => IIndirectPropertyIDLevel): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setLevelType(value: MFIndirectPropertyIDLevelType): Self = StObject.set(x, "LevelType", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
  }
}
