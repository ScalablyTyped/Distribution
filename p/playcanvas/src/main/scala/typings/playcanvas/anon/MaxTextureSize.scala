package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxTextureSize extends StObject {
  
  var color: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
  ] = js.undefined
  
  var maxTextureSize: js.UndefOr[Double] = js.undefined
}
object MaxTextureSize {
  
  inline def apply(): MaxTextureSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTextureSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxTextureSize] (val x: Self) extends AnyVal {
    
    inline def setColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setMaxTextureSize(value: Double): Self = StObject.set(x, "maxTextureSize", value.asInstanceOf[js.Any])
    
    inline def setMaxTextureSizeUndefined: Self = StObject.set(x, "maxTextureSize", js.undefined)
  }
}
