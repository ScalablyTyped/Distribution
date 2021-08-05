package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncompleteData extends StObject {
  
  // The service does not have source data before the specified time.
  var missingDataBeforeDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Some data was not recorded due to excessive activity.
  var wasThrottled: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object IncompleteData {
  
  inline def apply(): IncompleteData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncompleteData]
  }
  
  extension [Self <: IncompleteData](x: Self) {
    
    inline def setMissingDataBeforeDateTime(value: NullableOption[String]): Self = StObject.set(x, "missingDataBeforeDateTime", value.asInstanceOf[js.Any])
    
    inline def setMissingDataBeforeDateTimeNull: Self = StObject.set(x, "missingDataBeforeDateTime", null)
    
    inline def setMissingDataBeforeDateTimeUndefined: Self = StObject.set(x, "missingDataBeforeDateTime", js.undefined)
    
    inline def setWasThrottled(value: NullableOption[Boolean]): Self = StObject.set(x, "wasThrottled", value.asInstanceOf[js.Any])
    
    inline def setWasThrottledNull: Self = StObject.set(x, "wasThrottled", null)
    
    inline def setWasThrottledUndefined: Self = StObject.set(x, "wasThrottled", js.undefined)
  }
}
