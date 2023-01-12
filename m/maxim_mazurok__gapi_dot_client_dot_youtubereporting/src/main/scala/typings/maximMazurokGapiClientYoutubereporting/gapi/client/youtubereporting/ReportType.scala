package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportType extends StObject {
  
  /** The date/time when this report type was/will be deprecated. */
  var deprecateTime: js.UndefOr[String] = js.undefined
  
  /** The ID of the report type (max. 100 characters). */
  var id: js.UndefOr[String] = js.undefined
  
  /** The name of the report type (max. 100 characters). */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * True if this a system-managed report type; otherwise false. Reporting jobs for system-managed report types are created automatically and can thus not be used in the `CreateJob`
    * method.
    */
  var systemManaged: js.UndefOr[Boolean] = js.undefined
}
object ReportType {
  
  inline def apply(): ReportType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportType] (val x: Self) extends AnyVal {
    
    inline def setDeprecateTime(value: String): Self = StObject.set(x, "deprecateTime", value.asInstanceOf[js.Any])
    
    inline def setDeprecateTimeUndefined: Self = StObject.set(x, "deprecateTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSystemManaged(value: Boolean): Self = StObject.set(x, "systemManaged", value.asInstanceOf[js.Any])
    
    inline def setSystemManagedUndefined: Self = StObject.set(x, "systemManaged", js.undefined)
  }
}
