package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  /** The creation date/time of the job. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The date/time when this job will expire/expired. After a job expired, no new reports are generated. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** The server-generated ID of the job (max. 40 characters). */
  var id: js.UndefOr[String] = js.undefined
  
  /** The name of the job (max. 100 characters). */
  var name: js.UndefOr[String] = js.undefined
  
  /** The type of reports this job creates. Corresponds to the ID of a ReportType. */
  var reportTypeId: js.UndefOr[String] = js.undefined
  
  /** True if this a system-managed job that cannot be modified by the user; otherwise false. */
  var systemManaged: js.UndefOr[Boolean] = js.undefined
}
object Job {
  
  inline def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportTypeId(value: String): Self = StObject.set(x, "reportTypeId", value.asInstanceOf[js.Any])
    
    inline def setReportTypeIdUndefined: Self = StObject.set(x, "reportTypeId", js.undefined)
    
    inline def setSystemManaged(value: Boolean): Self = StObject.set(x, "systemManaged", value.asInstanceOf[js.Any])
    
    inline def setSystemManagedUndefined: Self = StObject.set(x, "systemManaged", js.undefined)
  }
}
