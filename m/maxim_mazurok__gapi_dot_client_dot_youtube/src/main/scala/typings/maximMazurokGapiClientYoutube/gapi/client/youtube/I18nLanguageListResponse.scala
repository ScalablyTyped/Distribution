package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
trait I18nLanguageListResponse extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.undefined
  
  /** A list of supported i18n languages. In this map, the i18n language ID is the map key, and its value is the corresponding i18nLanguage resource. */
  var items: js.UndefOr[js.Array[I18nLanguage]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#i18nLanguageListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.undefined
}
object I18nLanguageListResponse {
  
  @scala.inline
  def apply(): I18nLanguageListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nLanguageListResponse]
  }
  
  @scala.inline
  implicit class I18nLanguageListResponseMutableBuilder[Self <: I18nLanguageListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[I18nLanguage]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: I18nLanguage*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
