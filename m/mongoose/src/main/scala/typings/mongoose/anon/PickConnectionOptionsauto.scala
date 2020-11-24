package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<mongoose.mongoose.ConnectionOptions, 'autoIndex' | 'autoCreate' | 'useCreateIndex' | 'useFindAndModify' | 'bufferCommands'> */
@js.native
trait PickConnectionOptionsauto extends js.Object {
  
  var autoCreate: js.UndefOr[Boolean] = js.native
  
  var autoIndex: js.UndefOr[Boolean] = js.native
  
  var bufferCommands: js.UndefOr[Boolean] = js.native
  
  var useCreateIndex: js.UndefOr[Boolean] = js.native
  
  var useFindAndModify: js.UndefOr[Boolean] = js.native
}
object PickConnectionOptionsauto {
  
  @scala.inline
  def apply(): PickConnectionOptionsauto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickConnectionOptionsauto]
  }
  
  @scala.inline
  implicit class PickConnectionOptionsautoOps[Self <: PickConnectionOptionsauto] (val x: Self) extends AnyVal {
    
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
    def setAutoCreate(value: Boolean): Self = this.set("autoCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCreate: Self = this.set("autoCreate", js.undefined)
    
    @scala.inline
    def setAutoIndex(value: Boolean): Self = this.set("autoIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIndex: Self = this.set("autoIndex", js.undefined)
    
    @scala.inline
    def setBufferCommands(value: Boolean): Self = this.set("bufferCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferCommands: Self = this.set("bufferCommands", js.undefined)
    
    @scala.inline
    def setUseCreateIndex(value: Boolean): Self = this.set("useCreateIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCreateIndex: Self = this.set("useCreateIndex", js.undefined)
    
    @scala.inline
    def setUseFindAndModify(value: Boolean): Self = this.set("useFindAndModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFindAndModify: Self = this.set("useFindAndModify", js.undefined)
  }
}
