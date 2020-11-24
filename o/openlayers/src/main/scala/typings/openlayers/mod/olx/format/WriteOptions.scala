package typings.openlayers.mod.olx.format

import typings.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteOptions extends js.Object {
  
  var dataProjection: ProjectionLike = js.native
  
  var decimals: js.UndefOr[Double] = js.native
  
  var featureProjection: js.UndefOr[ProjectionLike] = js.native
  
  var rightHanded: js.UndefOr[Boolean] = js.native
}
object WriteOptions {
  
  @scala.inline
  def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  
  @scala.inline
  implicit class WriteOptionsOps[Self <: WriteOptions] (val x: Self) extends AnyVal {
    
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
    def setDataProjection(value: ProjectionLike): Self = this.set("dataProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataProjection: Self = this.set("dataProjection", js.undefined)
    
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    
    @scala.inline
    def setFeatureProjection(value: ProjectionLike): Self = this.set("featureProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureProjection: Self = this.set("featureProjection", js.undefined)
    
    @scala.inline
    def setRightHanded(value: Boolean): Self = this.set("rightHanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightHanded: Self = this.set("rightHanded", js.undefined)
  }
}
