package typings.ol.cartoDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CartoDBLayerInfo extends js.Object {
  
  var cdn_url: js.Any = js.native
  
  var layergroupid: String = js.native
}
object CartoDBLayerInfo {
  
  @scala.inline
  def apply(cdn_url: js.Any, layergroupid: String): CartoDBLayerInfo = {
    val __obj = js.Dynamic.literal(cdn_url = cdn_url.asInstanceOf[js.Any], layergroupid = layergroupid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartoDBLayerInfo]
  }
  
  @scala.inline
  implicit class CartoDBLayerInfoOps[Self <: CartoDBLayerInfo] (val x: Self) extends AnyVal {
    
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
    def setCdn_url(value: js.Any): Self = this.set("cdn_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayergroupid(value: String): Self = this.set("layergroupid", value.asInstanceOf[js.Any])
  }
}
