package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxWithCredentials extends StObject {
  
  var ajaxWithCredentials: js.UndefOr[String | Boolean] = js.undefined
  
  var buildPyramid: js.UndefOr[Boolean] = js.undefined
  
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.undefined
  
  var url: String
  
  var useCanvas: js.UndefOr[Boolean] = js.undefined
}
object AjaxWithCredentials {
  
  inline def apply(url: String): AjaxWithCredentials = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxWithCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AjaxWithCredentials] (val x: Self) extends AnyVal {
    
    inline def setAjaxWithCredentials(value: String | Boolean): Self = StObject.set(x, "ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    inline def setAjaxWithCredentialsUndefined: Self = StObject.set(x, "ajaxWithCredentials", js.undefined)
    
    inline def setBuildPyramid(value: Boolean): Self = StObject.set(x, "buildPyramid", value.asInstanceOf[js.Any])
    
    inline def setBuildPyramidUndefined: Self = StObject.set(x, "buildPyramid", js.undefined)
    
    inline def setCrossOriginPolicy(value: String | Boolean): Self = StObject.set(x, "crossOriginPolicy", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginPolicyUndefined: Self = StObject.set(x, "crossOriginPolicy", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUseCanvas(value: Boolean): Self = StObject.set(x, "useCanvas", value.asInstanceOf[js.Any])
    
    inline def setUseCanvasUndefined: Self = StObject.set(x, "useCanvas", js.undefined)
  }
}
