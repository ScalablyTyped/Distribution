package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenoteResource
  extends StObject
     with OnenoteEntityBaseModel {
  
  // The content stream
  var content: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // The URL for downloading the content
  var contentUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnenoteResource {
  
  @scala.inline
  def apply(): OnenoteResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteResource]
  }
  
  @scala.inline
  implicit class OnenoteResourceMutableBuilder[Self <: OnenoteResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: NullableOption[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentUrl(value: NullableOption[String]): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
  }
}
