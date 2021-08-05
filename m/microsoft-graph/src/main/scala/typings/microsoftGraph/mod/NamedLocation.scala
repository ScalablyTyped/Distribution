package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedLocation
  extends StObject
     with Entity {
  
  /**
    * The Timestamp type represents creation date and time of the location using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Human-readable name of the location.
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The Timestamp type represents last modified date and time of the location using ISO 8601 format and is always in UTC
    * time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var modifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object NamedLocation {
  
  inline def apply(): NamedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedLocation]
  }
  
  extension [Self <: NamedLocation](x: Self) {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateTimeNull: Self = StObject.set(x, "modifiedDateTime", null)
    
    inline def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
  }
}
