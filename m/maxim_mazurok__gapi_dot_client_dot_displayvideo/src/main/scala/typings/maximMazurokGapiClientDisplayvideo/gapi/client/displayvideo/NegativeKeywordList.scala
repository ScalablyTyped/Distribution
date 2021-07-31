package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegativeKeywordList extends StObject {
  
  /** Output only. The unique ID of the advertiser the negative keyword list belongs to. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Required. The display name of the negative keyword list. Must be UTF-8 encoded with a maximum size of 255 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the negative keyword list. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the negative keyword list. Assigned by the system. */
  var negativeKeywordListId: js.UndefOr[String] = js.undefined
}
object NegativeKeywordList {
  
  @scala.inline
  def apply(): NegativeKeywordList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegativeKeywordList]
  }
  
  @scala.inline
  implicit class NegativeKeywordListMutableBuilder[Self <: NegativeKeywordList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNegativeKeywordListId(value: String): Self = StObject.set(x, "negativeKeywordListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeKeywordListIdUndefined: Self = StObject.set(x, "negativeKeywordListId", js.undefined)
  }
}
