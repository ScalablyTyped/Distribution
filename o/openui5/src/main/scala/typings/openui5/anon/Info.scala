package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  /**
    * If the request is synchronous or asynchronous (if available)
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional information for the request (if available) **deprecated**
    */
  var info: js.UndefOr[String] = js.undefined
  
  /**
    * Additional information for the request (if available)
    */
  var infoObject: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The type of the request (if available)
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The url which is sent to the back end.
    */
  var url: js.UndefOr[String] = js.undefined
}
object Info {
  
  inline def apply(): Info = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Info]
  }
  
  extension [Self <: Info](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoObject(value: js.Object): Self = StObject.set(x, "infoObject", value.asInstanceOf[js.Any])
    
    inline def setInfoObjectUndefined: Self = StObject.set(x, "infoObject", js.undefined)
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
