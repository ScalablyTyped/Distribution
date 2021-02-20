package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxWithCredentials extends StObject {
  
  var ajaxWithCredentials: js.UndefOr[String | Boolean] = js.native
  
  var buildPyramid: js.UndefOr[Boolean] = js.native
  
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.native
  
  var url: String = js.native
  
  var useCanvas: js.UndefOr[Boolean] = js.native
}
object AjaxWithCredentials {
  
  @scala.inline
  def apply(url: String): AjaxWithCredentials = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxWithCredentials]
  }
  
  @scala.inline
  implicit class AjaxWithCredentialsMutableBuilder[Self <: AjaxWithCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxWithCredentials(value: String | Boolean): Self = StObject.set(x, "ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxWithCredentialsUndefined: Self = StObject.set(x, "ajaxWithCredentials", js.undefined)
    
    @scala.inline
    def setBuildPyramid(value: Boolean): Self = StObject.set(x, "buildPyramid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildPyramidUndefined: Self = StObject.set(x, "buildPyramid", js.undefined)
    
    @scala.inline
    def setCrossOriginPolicy(value: String | Boolean): Self = StObject.set(x, "crossOriginPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginPolicyUndefined: Self = StObject.set(x, "crossOriginPolicy", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCanvas(value: Boolean): Self = StObject.set(x, "useCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCanvasUndefined: Self = StObject.set(x, "useCanvas", js.undefined)
  }
}
