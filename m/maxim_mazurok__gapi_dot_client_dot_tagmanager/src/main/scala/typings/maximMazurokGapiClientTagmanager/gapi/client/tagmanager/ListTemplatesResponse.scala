package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplatesResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** All GTM Custom Templates of a GTM Container. */
  var template: js.UndefOr[js.Array[CustomTemplate]] = js.undefined
}
object ListTemplatesResponse {
  
  @scala.inline
  def apply(): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListTemplatesResponseMutableBuilder[Self <: ListTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTemplate(value: js.Array[CustomTemplate]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTemplateVarargs(value: CustomTemplate*): Self = StObject.set(x, "template", js.Array(value :_*))
  }
}
