package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Bri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILightGroup extends js.Object {
  
  var action: js.UndefOr[Bri] = js.native
  
  var `class`: js.UndefOr[RoomType] = js.native
  
  var id: String = js.native
  
  var lights: js.UndefOr[js.Array[String]] = js.native
  
  var name: String = js.native
  
  var `type`: LightGroupType = js.native
}
object ILightGroup {
  
  @scala.inline
  def apply(id: String, name: String, `type`: LightGroupType): ILightGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightGroup]
  }
  
  @scala.inline
  implicit class ILightGroupOps[Self <: ILightGroup] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LightGroupType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: Bri): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setClass(value: RoomType): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setLightsVarargs(value: String*): Self = this.set("lights", js.Array(value :_*))
    
    @scala.inline
    def setLights(value: js.Array[String]): Self = this.set("lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLights: Self = this.set("lights", js.undefined)
  }
}
