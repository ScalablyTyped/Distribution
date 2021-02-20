package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncompleteData extends StObject {
  
  // The service does not have source data before the specified time.
  var missingDataBeforeDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Some data was not recorded due to excessive activity.
  var wasThrottled: js.UndefOr[NullableOption[Boolean]] = js.native
}
object IncompleteData {
  
  @scala.inline
  def apply(): IncompleteData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncompleteData]
  }
  
  @scala.inline
  implicit class IncompleteDataMutableBuilder[Self <: IncompleteData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissingDataBeforeDateTime(value: NullableOption[String]): Self = StObject.set(x, "missingDataBeforeDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingDataBeforeDateTimeNull: Self = StObject.set(x, "missingDataBeforeDateTime", null)
    
    @scala.inline
    def setMissingDataBeforeDateTimeUndefined: Self = StObject.set(x, "missingDataBeforeDateTime", js.undefined)
    
    @scala.inline
    def setWasThrottled(value: NullableOption[Boolean]): Self = StObject.set(x, "wasThrottled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasThrottledNull: Self = StObject.set(x, "wasThrottled", null)
    
    @scala.inline
    def setWasThrottledUndefined: Self = StObject.set(x, "wasThrottled", js.undefined)
  }
}
