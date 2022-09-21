package typings.pixiCompressedTextures

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  // eslint-disable-next-line @typescript-eslint/no-empty-interface
  trait BaseTexture extends StObject {
    
    var ktxKeyValueData: Map[String, js.typedarray.DataView]
  }
  object BaseTexture {
    
    inline def apply(ktxKeyValueData: Map[String, js.typedarray.DataView]): BaseTexture = {
      val __obj = js.Dynamic.literal(ktxKeyValueData = ktxKeyValueData.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTexture]
    }
    
    extension [Self <: BaseTexture](x: Self) {
      
      inline def setKtxKeyValueData(value: Map[String, js.typedarray.DataView]): Self = StObject.set(x, "ktxKeyValueData", value.asInstanceOf[js.Any])
    }
  }
}
