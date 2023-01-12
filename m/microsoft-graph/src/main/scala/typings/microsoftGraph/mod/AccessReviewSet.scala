package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewSet
  extends StObject
     with Entity {
  
  // Represents the template and scheduling for an access review.
  var definitions: js.UndefOr[NullableOption[js.Array[AccessReviewScheduleDefinition]]] = js.undefined
  
  // Represents a collection of access review history data and the scopes used to collect that data.
  var historyDefinitions: js.UndefOr[NullableOption[js.Array[AccessReviewHistoryDefinition]]] = js.undefined
}
object AccessReviewSet {
  
  inline def apply(): AccessReviewSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessReviewSet] (val x: Self) extends AnyVal {
    
    inline def setDefinitions(value: NullableOption[js.Array[AccessReviewScheduleDefinition]]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsNull: Self = StObject.set(x, "definitions", null)
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setDefinitionsVarargs(value: AccessReviewScheduleDefinition*): Self = StObject.set(x, "definitions", js.Array(value*))
    
    inline def setHistoryDefinitions(value: NullableOption[js.Array[AccessReviewHistoryDefinition]]): Self = StObject.set(x, "historyDefinitions", value.asInstanceOf[js.Any])
    
    inline def setHistoryDefinitionsNull: Self = StObject.set(x, "historyDefinitions", null)
    
    inline def setHistoryDefinitionsUndefined: Self = StObject.set(x, "historyDefinitions", js.undefined)
    
    inline def setHistoryDefinitionsVarargs(value: AccessReviewHistoryDefinition*): Self = StObject.set(x, "historyDefinitions", js.Array(value*))
  }
}
