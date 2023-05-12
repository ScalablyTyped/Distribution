package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetworkDecomposeDataUriMod {
  
  @JSImport("@pixi/utils/lib/network/decomposeDataUri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decomposeDataUri(dataUri: String): js.UndefOr[DecomposedDataUri] = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeDataUri")(dataUri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DecomposedDataUri]]
  
  trait DecomposedDataUri extends StObject {
    
    var charset: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var mediaType: js.UndefOr[String] = js.undefined
    
    var subType: js.UndefOr[String] = js.undefined
  }
  object DecomposedDataUri {
    
    inline def apply(): DecomposedDataUri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecomposedDataUri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecomposedDataUri] (val x: Self) extends AnyVal {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
      
      inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    }
  }
}
