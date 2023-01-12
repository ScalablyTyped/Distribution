package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAssetImportResponse extends StObject {
  
  /**
    * The id of newly created asset. If this is empty when the operation is complete it means the import failed. Please refer to the assetImportMessages field to understand what went
    * wrong.
    */
  var assetId: js.UndefOr[String] = js.undefined
  
  /** The id of the asset import. */
  var assetImportId: js.UndefOr[String] = js.undefined
  
  /** The message from the asset import. This will contain any warnings (or - in the case of failure - errors) that occurred during import. */
  var assetImportMessages: js.UndefOr[js.Array[AssetImportMessage]] = js.undefined
  
  /** The publish URL for the asset. */
  var publishUrl: js.UndefOr[String] = js.undefined
}
object StartAssetImportResponse {
  
  inline def apply(): StartAssetImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAssetImportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartAssetImportResponse] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: String): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setAssetImportId(value: String): Self = StObject.set(x, "assetImportId", value.asInstanceOf[js.Any])
    
    inline def setAssetImportIdUndefined: Self = StObject.set(x, "assetImportId", js.undefined)
    
    inline def setAssetImportMessages(value: js.Array[AssetImportMessage]): Self = StObject.set(x, "assetImportMessages", value.asInstanceOf[js.Any])
    
    inline def setAssetImportMessagesUndefined: Self = StObject.set(x, "assetImportMessages", js.undefined)
    
    inline def setAssetImportMessagesVarargs(value: AssetImportMessage*): Self = StObject.set(x, "assetImportMessages", js.Array(value*))
    
    inline def setPublishUrl(value: String): Self = StObject.set(x, "publishUrl", value.asInstanceOf[js.Any])
    
    inline def setPublishUrlUndefined: Self = StObject.set(x, "publishUrl", js.undefined)
  }
}
