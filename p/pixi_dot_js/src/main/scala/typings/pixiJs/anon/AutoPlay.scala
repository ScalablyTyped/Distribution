package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoPlay extends StObject {
  
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  var crossorigin: js.UndefOr[Boolean] = js.undefined
  
  var updateFPS: js.UndefOr[Double] = js.undefined
}
object AutoPlay {
  
  @scala.inline
  def apply(): AutoPlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPlay]
  }
  
  @scala.inline
  implicit class AutoPlayMutableBuilder[Self <: AutoPlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    @scala.inline
    def setCrossorigin(value: Boolean): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
    
    @scala.inline
    def setUpdateFPS(value: Double): Self = StObject.set(x, "updateFPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateFPSUndefined: Self = StObject.set(x, "updateFPS", js.undefined)
  }
}
