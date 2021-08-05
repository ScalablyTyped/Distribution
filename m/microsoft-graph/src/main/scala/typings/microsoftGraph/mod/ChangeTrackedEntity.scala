package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeTrackedEntity
  extends StObject
     with Entity {
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identity of the person who last modified the entity.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object ChangeTrackedEntity {
  
  inline def apply(): ChangeTrackedEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeTrackedEntity]
  }
  
  extension [Self <: ChangeTrackedEntity](x: Self) {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
  }
}
