package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fps extends StObject {
  
  var fps: js.UndefOr[Double] = js.native
  
  var loop: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var spriteAsset: js.UndefOr[Double] = js.native
}
object Fps {
  
  @scala.inline
  def apply(): Fps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fps]
  }
  
  @scala.inline
  implicit class FpsMutableBuilder[Self <: Fps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    @scala.inline
    def setLoop(value: js.Any): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSpriteAsset(value: Double): Self = StObject.set(x, "spriteAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteAssetUndefined: Self = StObject.set(x, "spriteAsset", js.undefined)
  }
}
