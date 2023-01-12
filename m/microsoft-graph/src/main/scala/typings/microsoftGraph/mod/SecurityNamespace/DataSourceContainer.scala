package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceContainer
  extends StObject
     with Entity {
  
  // Created date and time of the dataSourceContainer entity.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name of the dataSourceContainer entity.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The hold status of the dataSourceContainer. The possible values are: notApplied, applied, applying, removing, partial
  var holdStatus: js.UndefOr[NullableOption[DataSourceHoldStatus]] = js.undefined
  
  // Last modified date and time of the dataSourceContainer.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time that the dataSourceContainer was released from the case.
  var releasedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Latest status of the dataSourceContainer. Possible values are: Active, Released.
  var status: js.UndefOr[NullableOption[DataSourceContainerStatus]] = js.undefined
}
object DataSourceContainer {
  
  inline def apply(): DataSourceContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceContainer] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHoldStatus(value: NullableOption[DataSourceHoldStatus]): Self = StObject.set(x, "holdStatus", value.asInstanceOf[js.Any])
    
    inline def setHoldStatusNull: Self = StObject.set(x, "holdStatus", null)
    
    inline def setHoldStatusUndefined: Self = StObject.set(x, "holdStatus", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setReleasedDateTime(value: NullableOption[String]): Self = StObject.set(x, "releasedDateTime", value.asInstanceOf[js.Any])
    
    inline def setReleasedDateTimeNull: Self = StObject.set(x, "releasedDateTime", null)
    
    inline def setReleasedDateTimeUndefined: Self = StObject.set(x, "releasedDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[DataSourceContainerStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
