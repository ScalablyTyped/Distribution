package typings.pixiCore.mod

import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICubeResourceOptions
  extends StObject
     with ISize
     with _IAutoDetectOptions {
  
  /** Whether to auto-load resources */
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  
  /** In case BaseTextures are supplied, whether to copy them or use. */
  var linkBaseTexture: js.UndefOr[Boolean] = js.undefined
}
object ICubeResourceOptions {
  
  inline def apply(height: Double, width: Double): ICubeResourceOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICubeResourceOptions]
  }
  
  extension [Self <: ICubeResourceOptions](x: Self) {
    
    inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setLinkBaseTexture(value: Boolean): Self = StObject.set(x, "linkBaseTexture", value.asInstanceOf[js.Any])
    
    inline def setLinkBaseTextureUndefined: Self = StObject.set(x, "linkBaseTexture", js.undefined)
  }
}
