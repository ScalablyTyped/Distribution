package typings.pixiJs.anon

import typings.pixiJs.PIXI.ALPHA_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBitmap extends StObject {
  
  var alphaMode: js.UndefOr[ALPHA_MODES] = js.undefined
  
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  
  var createBitmap: js.UndefOr[Boolean] = js.undefined
  
  var crossorigin: js.UndefOr[Boolean] = js.undefined
}
object CreateBitmap {
  
  @scala.inline
  def apply(): CreateBitmap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBitmap]
  }
  
  @scala.inline
  implicit class CreateBitmapMutableBuilder[Self <: CreateBitmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaMode(value: ALPHA_MODES): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
    
    @scala.inline
    def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    @scala.inline
    def setCreateBitmap(value: Boolean): Self = StObject.set(x, "createBitmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateBitmapUndefined: Self = StObject.set(x, "createBitmap", js.undefined)
    
    @scala.inline
    def setCrossorigin(value: Boolean): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
  }
}
