package typings.openlayers.mod.olx.format

import typings.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopoJSONOptions extends js.Object {
  
  var defaultDataProjection: ProjectionLike = js.native
}
object TopoJSONOptions {
  
  @scala.inline
  def apply(): TopoJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopoJSONOptions]
  }
  
  @scala.inline
  implicit class TopoJSONOptionsOps[Self <: TopoJSONOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultDataProjection(value: ProjectionLike): Self = this.set("defaultDataProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDataProjection: Self = this.set("defaultDataProjection", js.undefined)
  }
}
