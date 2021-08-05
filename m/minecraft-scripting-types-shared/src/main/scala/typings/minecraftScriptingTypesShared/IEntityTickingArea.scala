package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity_ticking_area
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEntityTickingArea
  extends StObject
     with ITickingArea {
  
  /**
    * The type of the object
    */
  val __type__ : entity_ticking_area
  
  /**
    * The unique identifier of the ticking area
    */
  val entity_ticking_area_id: Int64
}
object IEntityTickingArea {
  
  inline def apply(entity_ticking_area_id: Int64): IEntityTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = "entity_ticking_area", entity_ticking_area_id = entity_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityTickingArea]
  }
  
  extension [Self <: IEntityTickingArea](x: Self) {
    
    inline def setEntity_ticking_area_id(value: Int64): Self = StObject.set(x, "entity_ticking_area_id", value.asInstanceOf[js.Any])
    
    inline def set__type__(value: entity_ticking_area): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
