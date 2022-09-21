package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Export extends StObject {
  
  /** Output only. The sink for export files in Cloud Storage. */
  var cloudStorageSink: js.UndefOr[CloudStorageSink] = js.undefined
  
  /** Output only. The time when the export was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Additional export options. */
  var exportOptions: js.UndefOr[ExportOptions] = js.undefined
  
  /** Output only. The generated export ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Output only. The matter ID. */
  var matterId: js.UndefOr[String] = js.undefined
  
  /** The export name. Don't use special characters (~!$'(),;@:/?) in the name, they can prevent you from downloading exports. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The query parameters used to create the export. */
  var query: js.UndefOr[Query] = js.undefined
  
  /** Output only. The requester of the export. */
  var requester: js.UndefOr[UserInfo] = js.undefined
  
  /** Output only. Details about the export progress and size. */
  var stats: js.UndefOr[ExportStats] = js.undefined
  
  /** Output only. The status of the export. */
  var status: js.UndefOr[String] = js.undefined
}
object Export {
  
  inline def apply(): Export = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Export]
  }
  
  extension [Self <: Export](x: Self) {
    
    inline def setCloudStorageSink(value: CloudStorageSink): Self = StObject.set(x, "cloudStorageSink", value.asInstanceOf[js.Any])
    
    inline def setCloudStorageSinkUndefined: Self = StObject.set(x, "cloudStorageSink", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setExportOptions(value: ExportOptions): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
    
    inline def setExportOptionsUndefined: Self = StObject.set(x, "exportOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequester(value: UserInfo): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setStats(value: ExportStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
