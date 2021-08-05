package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.level_ticking_area
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILevelTickingArea
  extends StObject
     with ITickingArea {
  
  /**
    * The type of the object
    */
  val __type__ : level_ticking_area
  
  /**
    * The uuid of the ticking area
    */
  val level_ticking_area_id: String
}
object ILevelTickingArea {
  
  inline def apply(level_ticking_area_id: String): ILevelTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = "level_ticking_area", level_ticking_area_id = level_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILevelTickingArea]
  }
  
  extension [Self <: ILevelTickingArea](x: Self) {
    
    inline def setLevel_ticking_area_id(value: String): Self = StObject.set(x, "level_ticking_area_id", value.asInstanceOf[js.Any])
    
    inline def set__type__(value: level_ticking_area): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
