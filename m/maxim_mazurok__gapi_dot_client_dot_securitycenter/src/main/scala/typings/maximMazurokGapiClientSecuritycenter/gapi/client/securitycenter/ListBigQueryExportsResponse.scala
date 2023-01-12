package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBigQueryExportsResponse extends StObject {
  
  /** The BigQuery exports from the specified parent. */
  var bigQueryExports: js.UndefOr[js.Array[GoogleCloudSecuritycenterV1BigQueryExport]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBigQueryExportsResponse {
  
  inline def apply(): ListBigQueryExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBigQueryExportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBigQueryExportsResponse] (val x: Self) extends AnyVal {
    
    inline def setBigQueryExports(value: js.Array[GoogleCloudSecuritycenterV1BigQueryExport]): Self = StObject.set(x, "bigQueryExports", value.asInstanceOf[js.Any])
    
    inline def setBigQueryExportsUndefined: Self = StObject.set(x, "bigQueryExports", js.undefined)
    
    inline def setBigQueryExportsVarargs(value: GoogleCloudSecuritycenterV1BigQueryExport*): Self = StObject.set(x, "bigQueryExports", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
