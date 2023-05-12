package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FarClip extends StObject {
  
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  var farClip: js.UndefOr[Double] = js.undefined
  
  var fov: js.UndefOr[Double] = js.undefined
  
  var horizontalFov: js.UndefOr[Boolean] = js.undefined
  
  var nearClip: js.UndefOr[Double] = js.undefined
}
object FarClip {
  
  inline def apply(): FarClip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FarClip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FarClip] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setFarClip(value: Double): Self = StObject.set(x, "farClip", value.asInstanceOf[js.Any])
    
    inline def setFarClipUndefined: Self = StObject.set(x, "farClip", js.undefined)
    
    inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    inline def setFovUndefined: Self = StObject.set(x, "fov", js.undefined)
    
    inline def setHorizontalFov(value: Boolean): Self = StObject.set(x, "horizontalFov", value.asInstanceOf[js.Any])
    
    inline def setHorizontalFovUndefined: Self = StObject.set(x, "horizontalFov", js.undefined)
    
    inline def setNearClip(value: Double): Self = StObject.set(x, "nearClip", value.asInstanceOf[js.Any])
    
    inline def setNearClipUndefined: Self = StObject.set(x, "nearClip", js.undefined)
  }
}
