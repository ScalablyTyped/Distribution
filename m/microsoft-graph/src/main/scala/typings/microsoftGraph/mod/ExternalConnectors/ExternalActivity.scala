package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalActivity
  extends StObject
     with Entity {
  
  // Represents an identity used to identify who is responsible for the activity.
  var performedBy: js.UndefOr[NullableOption[Identity]] = js.undefined
  
  /**
    * The date and time when the particular activity occurred. The DateTimeOffset type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var startDateTime: js.UndefOr[String] = js.undefined
  
  // The type of activity performed. The possible values are: viewed, modified, created, commented, unknownFutureValue.
  var `type`: js.UndefOr[ExternalActivityType] = js.undefined
}
object ExternalActivity {
  
  inline def apply(): ExternalActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalActivity] (val x: Self) extends AnyVal {
    
    inline def setPerformedBy(value: NullableOption[Identity]): Self = StObject.set(x, "performedBy", value.asInstanceOf[js.Any])
    
    inline def setPerformedByNull: Self = StObject.set(x, "performedBy", null)
    
    inline def setPerformedByUndefined: Self = StObject.set(x, "performedBy", js.undefined)
    
    inline def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setType(value: ExternalActivityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
