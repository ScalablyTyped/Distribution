package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.IdentitySet
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource
  extends StObject
     with Entity {
  
  // The user who created the dataSource.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The date and time the dataSource was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the dataSource. This will be the name of the SharePoint site.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The hold status of the dataSource.The possible values are: notApplied, applied, applying, removing, partial
  var holdStatus: js.UndefOr[NullableOption[DataSourceHoldStatus]] = js.undefined
}
object DataSource {
  
  inline def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHoldStatus(value: NullableOption[DataSourceHoldStatus]): Self = StObject.set(x, "holdStatus", value.asInstanceOf[js.Any])
    
    inline def setHoldStatusNull: Self = StObject.set(x, "holdStatus", null)
    
    inline def setHoldStatusUndefined: Self = StObject.set(x, "holdStatus", js.undefined)
  }
}
