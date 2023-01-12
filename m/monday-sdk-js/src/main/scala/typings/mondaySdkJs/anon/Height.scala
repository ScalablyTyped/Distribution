package typings.mondaySdkJs.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  /**
    * The height of the modal
    * Defaults to "0px"
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the page displayed in the modal
    * Defaults to current iFrame's URL
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Query parameters for the URL
    */
  var urlParams: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Subdirectory or path of the URL to open
    */
  var urlPath: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the modal
    * Defaults to "0px"
    */
  var width: js.UndefOr[String] = js.undefined
}
object Height {
  
  inline def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlParams(value: Record[String, String]): Self = StObject.set(x, "urlParams", value.asInstanceOf[js.Any])
    
    inline def setUrlParamsUndefined: Self = StObject.set(x, "urlParams", js.undefined)
    
    inline def setUrlPath(value: String): Self = StObject.set(x, "urlPath", value.asInstanceOf[js.Any])
    
    inline def setUrlPathUndefined: Self = StObject.set(x, "urlPath", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
