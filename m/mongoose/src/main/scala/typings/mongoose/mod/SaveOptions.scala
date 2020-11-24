package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveOptions extends js.Object {
  
  var checkKeys: js.UndefOr[Boolean] = js.native
  
  var j: js.UndefOr[Boolean] = js.native
  
  var safe: js.UndefOr[Boolean | WriteConcern] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
  
  var timestamps: js.UndefOr[Boolean] = js.native
  
  var validateBeforeSave: js.UndefOr[Boolean] = js.native
  
  var validateModifiedOnly: js.UndefOr[Boolean] = js.native
  
  var w: js.UndefOr[Double | String] = js.native
  
  var wtimeout: js.UndefOr[Double] = js.native
}
object SaveOptions {
  
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  
  @scala.inline
  implicit class SaveOptionsOps[Self <: SaveOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckKeys(value: Boolean): Self = this.set("checkKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckKeys: Self = this.set("checkKeys", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = this.set("j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    
    @scala.inline
    def setSafe(value: Boolean | WriteConcern): Self = this.set("safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setTimestamps(value: Boolean): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
    
    @scala.inline
    def setValidateBeforeSave(value: Boolean): Self = this.set("validateBeforeSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateBeforeSave: Self = this.set("validateBeforeSave", js.undefined)
    
    @scala.inline
    def setValidateModifiedOnly(value: Boolean): Self = this.set("validateModifiedOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateModifiedOnly: Self = this.set("validateModifiedOnly", js.undefined)
    
    @scala.inline
    def setW(value: Double | String): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: Double): Self = this.set("wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWtimeout: Self = this.set("wtimeout", js.undefined)
  }
}
