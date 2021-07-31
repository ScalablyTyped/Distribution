package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Bri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILightGroup extends StObject {
  
  var action: js.UndefOr[Bri] = js.undefined
  
  var `class`: js.UndefOr[RoomType] = js.undefined
  
  var id: String
  
  var lights: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: String
  
  var `type`: LightGroupType
}
object ILightGroup {
  
  @scala.inline
  def apply(id: String, name: String, `type`: LightGroupType): ILightGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightGroup]
  }
  
  @scala.inline
  implicit class ILightGroupMutableBuilder[Self <: ILightGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Bri): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setClass(value: RoomType): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLights(value: js.Array[String]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsUndefined: Self = StObject.set(x, "lights", js.undefined)
    
    @scala.inline
    def setLightsVarargs(value: String*): Self = StObject.set(x, "lights", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LightGroupType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
