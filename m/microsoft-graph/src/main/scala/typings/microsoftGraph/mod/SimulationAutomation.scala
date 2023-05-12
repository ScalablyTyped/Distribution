package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationAutomation
  extends StObject
     with Entity {
  
  // Identity of the user who created the attack simulation automation.
  var createdBy: js.UndefOr[NullableOption[EmailIdentity]] = js.undefined
  
  // Date and time when the attack simulation automation was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Description of the attack simulation automation.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name of the attack simulation automation. Supports $filter and $orderby.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identity of the user who most recently modified the attack simulation automation.
  var lastModifiedBy: js.UndefOr[NullableOption[EmailIdentity]] = js.undefined
  
  // Date and time when the attack simulation automation was most recently modified.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time of the latest run of the attack simulation automation.
  var lastRunDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time of the upcoming run of the attack simulation automation.
  var nextRunDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A collection of simulation automation runs.
  var runs: js.UndefOr[NullableOption[js.Array[SimulationAutomationRun]]] = js.undefined
  
  /**
    * Status of the attack simulation automation. Supports $filter and $orderby. The possible values are: unknown, draft,
    * notRunning, running, completed, unknownFutureValue.
    */
  var status: js.UndefOr[NullableOption[SimulationAutomationStatus]] = js.undefined
}
object SimulationAutomation {
  
  inline def apply(): SimulationAutomation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationAutomation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationAutomation] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: NullableOption[EmailIdentity]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[EmailIdentity]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setLastRunDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastRunDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastRunDateTimeNull: Self = StObject.set(x, "lastRunDateTime", null)
    
    inline def setLastRunDateTimeUndefined: Self = StObject.set(x, "lastRunDateTime", js.undefined)
    
    inline def setNextRunDateTime(value: NullableOption[String]): Self = StObject.set(x, "nextRunDateTime", value.asInstanceOf[js.Any])
    
    inline def setNextRunDateTimeNull: Self = StObject.set(x, "nextRunDateTime", null)
    
    inline def setNextRunDateTimeUndefined: Self = StObject.set(x, "nextRunDateTime", js.undefined)
    
    inline def setRuns(value: NullableOption[js.Array[SimulationAutomationRun]]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setRunsNull: Self = StObject.set(x, "runs", null)
    
    inline def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    inline def setRunsVarargs(value: SimulationAutomationRun*): Self = StObject.set(x, "runs", js.Array(value*))
    
    inline def setStatus(value: NullableOption[SimulationAutomationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
