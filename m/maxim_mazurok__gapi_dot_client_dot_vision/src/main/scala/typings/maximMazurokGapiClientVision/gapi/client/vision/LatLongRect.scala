package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LatLongRect extends js.Object {
  
  /** Max lat/long pair. */
  var maxLatLng: js.UndefOr[LatLng] = js.native
  
  /** Min lat/long pair. */
  var minLatLng: js.UndefOr[LatLng] = js.native
}
object LatLongRect {
  
  @scala.inline
  def apply(): LatLongRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatLongRect]
  }
  
  @scala.inline
  implicit class LatLongRectOps[Self <: LatLongRect] (val x: Self) extends AnyVal {
    
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
    def setMaxLatLng(value: LatLng): Self = this.set("maxLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLatLng: Self = this.set("maxLatLng", js.undefined)
    
    @scala.inline
    def setMinLatLng(value: LatLng): Self = this.set("minLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLatLng: Self = this.set("minLatLng", js.undefined)
  }
}
