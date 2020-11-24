package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crossorigin extends js.Object {
  
  var autoLoad: js.UndefOr[Boolean] = js.native
  
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  var createBitmap: js.UndefOr[Boolean] = js.native
  
  var crossorigin: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var updateFPS: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Crossorigin {
  
  @scala.inline
  def apply(): Crossorigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crossorigin]
  }
  
  @scala.inline
  implicit class CrossoriginOps[Self <: Crossorigin] (val x: Self) extends AnyVal {
    
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
    def setCreateBitmap(value: Boolean): Self = this.set("createBitmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateBitmap: Self = this.set("createBitmap", js.undefined)
    
    @scala.inline
    def setCrossorigin(value: Boolean): Self = this.set("crossorigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossorigin: Self = this.set("crossorigin", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setUpdateFPS(value: Double): Self = this.set("updateFPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateFPS: Self = this.set("updateFPS", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
