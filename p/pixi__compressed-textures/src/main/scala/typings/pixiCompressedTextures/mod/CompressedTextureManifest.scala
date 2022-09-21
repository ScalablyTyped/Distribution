package typings.pixiCompressedTextures.mod

import typings.pixiCompressedTextures.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressedTextureManifest extends StObject {
  
  var cacheID: String
  
  var textures: js.Array[Format]
}
object CompressedTextureManifest {
  
  inline def apply(cacheID: String, textures: js.Array[Format]): CompressedTextureManifest = {
    val __obj = js.Dynamic.literal(cacheID = cacheID.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressedTextureManifest]
  }
  
  extension [Self <: CompressedTextureManifest](x: Self) {
    
    inline def setCacheID(value: String): Self = StObject.set(x, "cacheID", value.asInstanceOf[js.Any])
    
    inline def setTextures(value: js.Array[Format]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTexturesVarargs(value: Format*): Self = StObject.set(x, "textures", js.Array(value*))
  }
}
