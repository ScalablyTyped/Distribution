package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Realm extends StObject {
  
  /** Output only. The creation time. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Human readable description of the realm. */
  var description: js.UndefOr[String] = js.undefined
  
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The labels associated with this realm. Each label is a key-value pair. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.Realm & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The resource name of the realm, in the following form: `projects/{project}/locations/{location}/realms/{realm}`. For example,
    * `projects/my-project/locations/{location}/realms/my-realm`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. Time zone where all policies targeting this realm are evaluated. The value of this field must be from the IANA time zone database: https://www.iana.org/time-zones. */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /** Output only. The last-modified time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Realm {
  
  inline def apply(): Realm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Realm]
  }
  
  extension [Self <: Realm](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.Realm & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
