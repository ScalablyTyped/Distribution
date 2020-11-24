package typings.miniprogram

import typings.miniprogram.anon.Accuracy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocationArgs extends AsyncCallback[Accuracy] {
  
  /**
    * longitude and latitude location cache expiry time in seconds.
    * Default is 30s. Use of cache can speed up location process. Re-location is done upon cache expiry.
    */
  var catchTimeout: js.UndefOr[Double] = js.native
  
  /**
    * 0: default, get the longitude and latitude.
    */
  var `type`: js.UndefOr[Double] = js.native
}
object GetLocationArgs {
  
  @scala.inline
  def apply(): GetLocationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationArgs]
  }
  
  @scala.inline
  implicit class GetLocationArgsOps[Self <: GetLocationArgs] (val x: Self) extends AnyVal {
    
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
    def setCatchTimeout(value: Double): Self = this.set("catchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatchTimeout: Self = this.set("catchTimeout", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
