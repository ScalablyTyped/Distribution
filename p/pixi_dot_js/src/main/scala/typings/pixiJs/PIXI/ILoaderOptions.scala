package typings.pixiJs.PIXI

import typings.pixiJs.anon.LoadElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoaderOptions extends StObject {
  
  var crossOrigin: js.UndefOr[Boolean | String] = js.undefined
  
  var loadType: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[LoadElement] = js.undefined
  
  var xhrType: js.UndefOr[String] = js.undefined
}
object ILoaderOptions {
  
  inline def apply(): ILoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoaderOptions]
  }
  
  extension [Self <: ILoaderOptions](x: Self) {
    
    inline def setCrossOrigin(value: Boolean | String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setLoadType(value: Double): Self = StObject.set(x, "loadType", value.asInstanceOf[js.Any])
    
    inline def setLoadTypeUndefined: Self = StObject.set(x, "loadType", js.undefined)
    
    inline def setMetadata(value: LoadElement): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setXhrType(value: String): Self = StObject.set(x, "xhrType", value.asInstanceOf[js.Any])
    
    inline def setXhrTypeUndefined: Self = StObject.set(x, "xhrType", js.undefined)
  }
}
