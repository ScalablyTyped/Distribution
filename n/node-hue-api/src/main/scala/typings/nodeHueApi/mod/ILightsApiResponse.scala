package typings.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILightsApiResponse extends js.Object {
  
  var lights: js.Array[ILight] = js.native
}
object ILightsApiResponse {
  
  @scala.inline
  def apply(lights: js.Array[ILight]): ILightsApiResponse = {
    val __obj = js.Dynamic.literal(lights = lights.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightsApiResponse]
  }
  
  @scala.inline
  implicit class ILightsApiResponseOps[Self <: ILightsApiResponse] (val x: Self) extends AnyVal {
    
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
    def setLightsVarargs(value: ILight*): Self = this.set("lights", js.Array(value :_*))
    
    @scala.inline
    def setLights(value: js.Array[ILight]): Self = this.set("lights", value.asInstanceOf[js.Any])
  }
}
