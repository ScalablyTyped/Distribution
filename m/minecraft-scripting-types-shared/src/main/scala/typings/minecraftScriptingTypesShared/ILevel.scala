package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILevel extends _IMinecraftObject {
  
  /**
    * The type of the object
    */
  val __type__ : level = js.native
  
  /**
    * READ ONLY. This is the unique identifier of the level
    */
  val level_id: Double = js.native
}
object ILevel {
  
  @scala.inline
  def apply(__type__ : level, level_id: Double): ILevel = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], level_id = level_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILevel]
  }
  
  @scala.inline
  implicit class ILevelMutableBuilder[Self <: ILevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel_id(value: Double): Self = StObject.set(x, "level_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type__(value: level): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
