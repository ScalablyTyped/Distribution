package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadRequest extends StObject {
  
  /**
    * File types that will be returned. If INVENTORY_SOURCE is requested, no other file types may be requested. Acceptable values are: - "AD" - "AD_GROUP" - "CAMPAIGN" - "INSERTION_ORDER"
    * - "INVENTORY_SOURCE" - "LINE_ITEM"
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The IDs of the specified filter type. This is used to filter entities to fetch. At least one ID must be specified. */
  var filterIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Filter type used to filter entities to fetch. PARTNER_ID and INVENTORY_SOURCE_ID may only be used when downloading inventory sources. */
  var filterType: js.UndefOr[String] = js.undefined
  
  /** SDF Version (column names, types, order) in which the entities will be returned. Default to 5. */
  var version: js.UndefOr[String] = js.undefined
}
object DownloadRequest {
  
  @scala.inline
  def apply(): DownloadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadRequest]
  }
  
  @scala.inline
  implicit class DownloadRequestMutableBuilder[Self <: DownloadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    @scala.inline
    def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value :_*))
    
    @scala.inline
    def setFilterIds(value: js.Array[String]): Self = StObject.set(x, "filterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIdsUndefined: Self = StObject.set(x, "filterIds", js.undefined)
    
    @scala.inline
    def setFilterIdsVarargs(value: String*): Self = StObject.set(x, "filterIds", js.Array(value :_*))
    
    @scala.inline
    def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
