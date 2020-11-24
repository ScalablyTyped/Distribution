package typings.pino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Equivalent of SonicBoom constructor options object
  */
// TODO: use SonicBoom constructor options interface when available
@js.native
trait DestinationObjectOptions extends js.Object {
  
  var dest: js.UndefOr[String] = js.native
  
  var fd: js.UndefOr[String | Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var sync: js.UndefOr[Boolean] = js.native
}
object DestinationObjectOptions {
  
  @scala.inline
  def apply(): DestinationObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationObjectOptions]
  }
  
  @scala.inline
  implicit class DestinationObjectOptionsOps[Self <: DestinationObjectOptions] (val x: Self) extends AnyVal {
    
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
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    
    @scala.inline
    def setFd(value: String | Double): Self = this.set("fd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFd: Self = this.set("fd", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
}
