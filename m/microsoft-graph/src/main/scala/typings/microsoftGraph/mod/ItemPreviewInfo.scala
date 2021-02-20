package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemPreviewInfo extends StObject {
  
  var getUrl: js.UndefOr[NullableOption[String]] = js.native
  
  var postParameters: js.UndefOr[NullableOption[String]] = js.native
  
  var postUrl: js.UndefOr[NullableOption[String]] = js.native
}
object ItemPreviewInfo {
  
  @scala.inline
  def apply(): ItemPreviewInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemPreviewInfo]
  }
  
  @scala.inline
  implicit class ItemPreviewInfoMutableBuilder[Self <: ItemPreviewInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUrl(value: NullableOption[String]): Self = StObject.set(x, "getUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUrlNull: Self = StObject.set(x, "getUrl", null)
    
    @scala.inline
    def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
    
    @scala.inline
    def setPostParameters(value: NullableOption[String]): Self = StObject.set(x, "postParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostParametersNull: Self = StObject.set(x, "postParameters", null)
    
    @scala.inline
    def setPostParametersUndefined: Self = StObject.set(x, "postParameters", js.undefined)
    
    @scala.inline
    def setPostUrl(value: NullableOption[String]): Self = StObject.set(x, "postUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUrlNull: Self = StObject.set(x, "postUrl", null)
    
    @scala.inline
    def setPostUrlUndefined: Self = StObject.set(x, "postUrl", js.undefined)
  }
}
