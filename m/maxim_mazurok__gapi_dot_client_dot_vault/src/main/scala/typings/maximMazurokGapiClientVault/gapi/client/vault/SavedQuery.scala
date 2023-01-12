package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedQuery extends StObject {
  
  /** Output only. The server-generated timestamp when the saved query was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The name of the saved query. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The matter ID of the matter the saved query is saved in. The server does not use this field during create and always uses matter ID in the URL. */
  var matterId: js.UndefOr[String] = js.undefined
  
  /** The search parameters of the saved query. */
  var query: js.UndefOr[Query] = js.undefined
  
  /** A unique identifier for the saved query. */
  var savedQueryId: js.UndefOr[String] = js.undefined
}
object SavedQuery {
  
  inline def apply(): SavedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavedQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavedQuery] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSavedQueryId(value: String): Self = StObject.set(x, "savedQueryId", value.asInstanceOf[js.Any])
    
    inline def setSavedQueryIdUndefined: Self = StObject.set(x, "savedQueryId", js.undefined)
  }
}
