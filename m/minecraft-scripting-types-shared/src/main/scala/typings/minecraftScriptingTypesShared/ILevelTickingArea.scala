package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.level_ticking_area
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILevelTickingArea extends ITickingArea {
  
  /**
    * The type of the object
    */
  val __type__ : level_ticking_area = js.native
  
  /**
    * The uuid of the ticking area
    */
  val level_ticking_area_id: String = js.native
}
object ILevelTickingArea {
  
  @scala.inline
  def apply(__type__ : level_ticking_area, level_ticking_area_id: String): ILevelTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], level_ticking_area_id = level_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILevelTickingArea]
  }
  
  @scala.inline
  implicit class ILevelTickingAreaMutableBuilder[Self <: ILevelTickingArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel_ticking_area_id(value: String): Self = StObject.set(x, "level_ticking_area_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type__(value: level_ticking_area): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
