package typings.pdfjsDist.anon

import typings.std.CanvasRenderingContext2D
import typings.std.OffscreenCanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ctx extends StObject {
  
  var ctx: CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D | Null
  
  var div: Null
  
  var prevFontFamily: Null
  
  var prevFontSize: Null
  
  var properties: Null
  
  var scale: Double
}
object Ctx {
  
  inline def apply(div: Null, prevFontFamily: Null, prevFontSize: Null, properties: Null, scale: Double): Ctx = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], prevFontFamily = prevFontFamily.asInstanceOf[js.Any], prevFontSize = prevFontSize.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], ctx = null)
    __obj.asInstanceOf[Ctx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ctx] (val x: Self) extends AnyVal {
    
    inline def setCtx(value: CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setCtxNull: Self = StObject.set(x, "ctx", null)
    
    inline def setDiv(value: Null): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
    
    inline def setPrevFontFamily(value: Null): Self = StObject.set(x, "prevFontFamily", value.asInstanceOf[js.Any])
    
    inline def setPrevFontSize(value: Null): Self = StObject.set(x, "prevFontSize", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Null): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
