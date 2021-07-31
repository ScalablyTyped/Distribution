package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoLoad extends StObject {
  
  var autoLoad: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var linkBaseTexture: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object AutoLoad {
  
  @scala.inline
  def apply(): AutoLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLoad]
  }
  
  @scala.inline
  implicit class AutoLoadMutableBuilder[Self <: AutoLoad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLoad(value: Double): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLinkBaseTexture(value: Double): Self = StObject.set(x, "linkBaseTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkBaseTextureUndefined: Self = StObject.set(x, "linkBaseTexture", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
