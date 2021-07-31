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
  
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReportTypeId(value: String): Self = StObject.set(x, "reportTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTypeIdUndefined: Self = StObject.set(x, "reportTypeId", js.undefined)
    
    @scala.inline
    def setSystemManaged(value: Boolean): Self = StObject.set(x, "systemManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemManagedUndefined: Self = StObject.set(x, "systemManaged", js.undefined)
  }
}
