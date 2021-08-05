package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILevel
  extends StObject
     with _IMinecraftObject {
  
  /**
    * The type of the object
    */
  val __type__ : level
  
  /**
    * READ ONLY. This is the unique identifier of the level
    */
  val level_id: Double
}
object ILevel {
  
  inline def apply(level_id: Double): ILevel = {
    val __obj = js.Dynamic.literal(__type__ = "level", level_id = level_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILevel]
  }
  
  extension [Self <: ILevel](x: Self) {
    
    inline def setLevel_id(value: Double): Self = StObject.set(x, "level_id", value.asInstanceOf[js.Any])
    
    inline def set__type__(value: level): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
