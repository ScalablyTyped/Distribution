package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetworkDecomposeDataUriMod {
  
  @JSImport("@pixi/utils/lib/network/decomposeDataUri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decomposeDataUri(dataUri: String): DecomposedDataUri = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeDataUri")(dataUri.asInstanceOf[js.Any]).asInstanceOf[DecomposedDataUri]
  
  trait DecomposedDataUri extends StObject {
    
    var charset: String
    
    var data: String
    
    var encoding: String
    
    var mediaType: String
    
    var subType: String
  }
  object DecomposedDataUri {
    
    inline def apply(charset: String, data: String, encoding: String, mediaType: String, subType: String): DecomposedDataUri = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecomposedDataUri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecomposedDataUri] (val x: Self) extends AnyVal {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    }
  }
}
