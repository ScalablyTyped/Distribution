package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crossorigin extends StObject {
  
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
  implicit class CrossoriginMutableBuilder[Self <: Crossorigin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    @scala.inline
    def setCreateBitmap(value: Boolean): Self = StObject.set(x, "createBitmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateBitmapUndefined: Self = StObject.set(x, "createBitmap", js.undefined)
    
    @scala.inline
    def setCrossorigin(value: Boolean): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setUpdateFPS(value: Double): Self = StObject.set(x, "updateFPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateFPSUndefined: Self = StObject.set(x, "updateFPS", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
