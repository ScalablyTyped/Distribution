package typings.pixiCompressedTextures.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompressedTextureResourceOptions extends StObject {
  
  var format: INTERNAL_FORMATS
  
  var height: Double
  
  var levelBuffers: js.UndefOr[js.Array[CompressedLevelBuffer]] = js.undefined
  
  var levels: js.UndefOr[Double] = js.undefined
  
  var width: Double
}
object ICompressedTextureResourceOptions {
  
  inline def apply(format: INTERNAL_FORMATS, height: Double, width: Double): ICompressedTextureResourceOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompressedTextureResourceOptions]
  }
  
  extension [Self <: ICompressedTextureResourceOptions](x: Self) {
    
    inline def setFormat(value: INTERNAL_FORMATS): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLevelBuffers(value: js.Array[CompressedLevelBuffer]): Self = StObject.set(x, "levelBuffers", value.asInstanceOf[js.Any])
    
    inline def setLevelBuffersUndefined: Self = StObject.set(x, "levelBuffers", js.undefined)
    
    inline def setLevelBuffersVarargs(value: CompressedLevelBuffer*): Self = StObject.set(x, "levelBuffers", js.Array(value*))
    
    inline def setLevels(value: Double): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
