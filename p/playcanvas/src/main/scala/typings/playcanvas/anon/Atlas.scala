package typings.playcanvas.anon

import typings.playcanvas.pc.TextureAtlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Atlas extends js.Object {
  
  var atlas: js.UndefOr[TextureAtlas] = js.native
  
  var frameKeys: js.UndefOr[js.Array[String]] = js.native
  
  var pixelsPerUnit: js.UndefOr[Double] = js.native
  
  var renderMode: js.UndefOr[Double] = js.native
}
object Atlas {
  
  @scala.inline
  def apply(): Atlas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Atlas]
  }
  
  @scala.inline
  implicit class AtlasOps[Self <: Atlas] (val x: Self) extends AnyVal {
    
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
    def setAtlas(value: TextureAtlas): Self = this.set("atlas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtlas: Self = this.set("atlas", js.undefined)
    
    @scala.inline
    def setFrameKeysVarargs(value: String*): Self = this.set("frameKeys", js.Array(value :_*))
    
    @scala.inline
    def setFrameKeys(value: js.Array[String]): Self = this.set("frameKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameKeys: Self = this.set("frameKeys", js.undefined)
    
    @scala.inline
    def setPixelsPerUnit(value: Double): Self = this.set("pixelsPerUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelsPerUnit: Self = this.set("pixelsPerUnit", js.undefined)
    
    @scala.inline
    def setRenderMode(value: Double): Self = this.set("renderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderMode: Self = this.set("renderMode", js.undefined)
  }
}
