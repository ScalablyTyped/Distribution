package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Export extends StObject {
  
  /** Output only. Export sink for cloud storage files. */
  var cloudStorageSink: js.UndefOr[CloudStorageSink] = js.native
  
  /** Output only. The time when the export was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Advanced options of the export. */
  var exportOptions: js.UndefOr[ExportOptions] = js.native
  
  /** Output only. The generated export ID. */
  var id: js.UndefOr[String] = js.native
  
  /** Output only. The matter ID. */
  var matterId: js.UndefOr[String] = js.native
  
  /** The export name. */
  var name: js.UndefOr[String] = js.native
  
  /** The search query being exported. */
  var query: js.UndefOr[Query] = js.native
  
  /** Output only. The requester of the export. */
  var requester: js.UndefOr[UserInfo] = js.native
  
  /** Output only. Export statistics. */
  var stats: js.UndefOr[ExportStats] = js.native
  
  /** Output only. The export status. */
  var status: js.UndefOr[String] = js.native
}
object Export {
  
  @scala.inline
  def apply(): Export = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Export]
  }
  
  @scala.inline
  implicit class ExportMutableBuilder[Self <: Export] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudStorageSink(value: CloudStorageSink): Self = StObject.set(x, "cloudStorageSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudStorageSinkUndefined: Self = StObject.set(x, "cloudStorageSink", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setExportOptions(value: ExportOptions): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportOptionsUndefined: Self = StObject.set(x, "exportOptions", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRequester(value: UserInfo): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    @scala.inline
    def setStats(value: ExportStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
