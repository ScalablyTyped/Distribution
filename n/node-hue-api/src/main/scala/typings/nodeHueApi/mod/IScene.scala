package typings.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScene extends js.Object {
  
  var id: String = js.native
  
  var lights: js.Array[Double] = js.native
  
  var name: String = js.native
}
object IScene {
  
  @scala.inline
  def apply(id: String, lights: js.Array[Double], name: String): IScene = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScene]
  }
  
  @scala.inline
  implicit class ISceneOps[Self <: IScene] (val x: Self) extends AnyVal {
    
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
    def setLightsVarargs(value: Double*): Self = this.set("lights", js.Array(value :_*))
    
    @scala.inline
    def setLights(value: js.Array[Double]): Self = this.set("lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
