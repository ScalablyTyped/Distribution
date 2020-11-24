package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoPlay extends js.Object {
  
  var autoLoad: js.UndefOr[Boolean] = js.native
  
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  var crossorigin: js.UndefOr[Boolean] = js.native
  
  var updateFPS: js.UndefOr[Double] = js.native
}
object AutoPlay {
  
  @scala.inline
  def apply(): AutoPlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPlay]
  }
  
  @scala.inline
  implicit class AutoPlayOps[Self <: AutoPlay] (val x: Self) extends AnyVal {
    
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
    def setAutoLoad(value: Boolean): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    
    @scala.inline
    def setCrossorigin(value: Boolean): Self = this.set("crossorigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossorigin: Self = this.set("crossorigin", js.undefined)
    
    @scala.inline
    def setUpdateFPS(value: Double): Self = this.set("updateFPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateFPS: Self = this.set("updateFPS", js.undefined)
  }
}
