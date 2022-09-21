package typings.pixiCompressedTextures.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressedLevelBuffer extends StObject {
  
  var levelBuffer: js.typedarray.Uint8Array
  
  var levelHeight: Double
  
  var levelID: Double
  
  var levelWidth: Double
}
object CompressedLevelBuffer {
  
  inline def apply(levelBuffer: js.typedarray.Uint8Array, levelHeight: Double, levelID: Double, levelWidth: Double): CompressedLevelBuffer = {
    val __obj = js.Dynamic.literal(levelBuffer = levelBuffer.asInstanceOf[js.Any], levelHeight = levelHeight.asInstanceOf[js.Any], levelID = levelID.asInstanceOf[js.Any], levelWidth = levelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressedLevelBuffer]
  }
  
  extension [Self <: CompressedLevelBuffer](x: Self) {
    
    inline def setLevelBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "levelBuffer", value.asInstanceOf[js.Any])
    
    inline def setLevelHeight(value: Double): Self = StObject.set(x, "levelHeight", value.asInstanceOf[js.Any])
    
    inline def setLevelID(value: Double): Self = StObject.set(x, "levelID", value.asInstanceOf[js.Any])
    
    inline def setLevelWidth(value: Double): Self = StObject.set(x, "levelWidth", value.asInstanceOf[js.Any])
  }
}
