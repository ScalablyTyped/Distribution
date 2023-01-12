package typings.pixiLoaders.mod

import typings.pixiLoaders.mod.LoaderResource.LOAD_TYPE
import typings.pixiLoaders.mod.LoaderResource.OnCompleteSignal
import typings.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAddOptions extends StObject {
  
  var callback: js.UndefOr[OnCompleteSignal] = js.undefined
  
  var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var loadType: js.UndefOr[LOAD_TYPE] = js.undefined
  
  var metadata: js.UndefOr[IResourceMetadata] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onComplete: js.UndefOr[OnCompleteSignal] = js.undefined
  
  var parentResource: js.UndefOr[LoaderResource] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.undefined
}
object IAddOptions {
  
  inline def apply(): IAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAddOptions] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: /* resource */ LoaderResource => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCrossOrigin(value: String | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLoadType(value: LOAD_TYPE): Self = StObject.set(x, "loadType", value.asInstanceOf[js.Any])
    
    inline def setLoadTypeUndefined: Self = StObject.set(x, "loadType", js.undefined)
    
    inline def setMetadata(value: IResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnComplete(value: /* resource */ LoaderResource => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setParentResource(value: LoaderResource): Self = StObject.set(x, "parentResource", value.asInstanceOf[js.Any])
    
    inline def setParentResourceUndefined: Self = StObject.set(x, "parentResource", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXhrType(value: XHR_RESPONSE_TYPE): Self = StObject.set(x, "xhrType", value.asInstanceOf[js.Any])
    
    inline def setXhrTypeUndefined: Self = StObject.set(x, "xhrType", js.undefined)
  }
}
