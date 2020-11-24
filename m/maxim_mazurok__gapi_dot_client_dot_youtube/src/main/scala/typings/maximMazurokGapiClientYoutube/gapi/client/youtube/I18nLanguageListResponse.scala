package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait I18nLanguageListResponse extends js.Object {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.native
  
  /** A list of supported i18n languages. In this map, the i18n language ID is the map key, and its value is the corresponding i18nLanguage resource. */
  var items: js.UndefOr[js.Array[I18nLanguage]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#i18nLanguageListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.native
}
object I18nLanguageListResponse {
  
  @scala.inline
  def apply(): I18nLanguageListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nLanguageListResponse]
  }
  
  @scala.inline
  implicit class I18nLanguageListResponseOps[Self <: I18nLanguageListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: I18nLanguage*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[I18nLanguage]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setVisitorId(value: String): Self = this.set("visitorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitorId: Self = this.set("visitorId", js.undefined)
  }
}
