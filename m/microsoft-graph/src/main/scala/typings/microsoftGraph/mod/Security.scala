package typings.microsoftGraph.mod

import typings.microsoftGraph.mod.SecurityNamespace.CasesRoot
import typings.microsoftGraph.mod.SecurityNamespace.Incident
import typings.microsoftGraph.mod.SecurityNamespace.TriggerTypesRoot
import typings.microsoftGraph.mod.SecurityNamespace.TriggersRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Security
  extends StObject
     with Entity {
  
  var alerts: js.UndefOr[NullableOption[js.Array[Alert]]] = js.undefined
  
  // A collection of alerts in Microsoft 365 Defender.
  var alerts_v2: js.UndefOr[NullableOption[js.Array[typings.microsoftGraph.mod.SecurityNamespace.Alert]]] = js.undefined
  
  var attackSimulation: js.UndefOr[NullableOption[AttackSimulationRoot]] = js.undefined
  
  var cases: js.UndefOr[NullableOption[CasesRoot]] = js.undefined
  
  /**
    * A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated
    * metadata that reflects the story of an attack.
    */
  var incidents: js.UndefOr[NullableOption[js.Array[Incident]]] = js.undefined
  
  var secureScoreControlProfiles: js.UndefOr[NullableOption[js.Array[SecureScoreControlProfile]]] = js.undefined
  
  var secureScores: js.UndefOr[NullableOption[js.Array[SecureScore]]] = js.undefined
  
  var triggerTypes: js.UndefOr[NullableOption[TriggerTypesRoot]] = js.undefined
  
  var triggers: js.UndefOr[NullableOption[TriggersRoot]] = js.undefined
}
object Security {
  
  inline def apply(): Security = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Security]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Security] (val x: Self) extends AnyVal {
    
    inline def setAlerts(value: NullableOption[js.Array[Alert]]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    inline def setAlertsNull: Self = StObject.set(x, "alerts", null)
    
    inline def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
    
    inline def setAlertsVarargs(value: Alert*): Self = StObject.set(x, "alerts", js.Array(value*))
    
    inline def setAlerts_v2(value: NullableOption[js.Array[typings.microsoftGraph.mod.SecurityNamespace.Alert]]): Self = StObject.set(x, "alerts_v2", value.asInstanceOf[js.Any])
    
    inline def setAlerts_v2Null: Self = StObject.set(x, "alerts_v2", null)
    
    inline def setAlerts_v2Undefined: Self = StObject.set(x, "alerts_v2", js.undefined)
    
    inline def setAlerts_v2Varargs(value: typings.microsoftGraph.mod.SecurityNamespace.Alert*): Self = StObject.set(x, "alerts_v2", js.Array(value*))
    
    inline def setAttackSimulation(value: NullableOption[AttackSimulationRoot]): Self = StObject.set(x, "attackSimulation", value.asInstanceOf[js.Any])
    
    inline def setAttackSimulationNull: Self = StObject.set(x, "attackSimulation", null)
    
    inline def setAttackSimulationUndefined: Self = StObject.set(x, "attackSimulation", js.undefined)
    
    inline def setCases(value: NullableOption[CasesRoot]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesNull: Self = StObject.set(x, "cases", null)
    
    inline def setCasesUndefined: Self = StObject.set(x, "cases", js.undefined)
    
    inline def setIncidents(value: NullableOption[js.Array[Incident]]): Self = StObject.set(x, "incidents", value.asInstanceOf[js.Any])
    
    inline def setIncidentsNull: Self = StObject.set(x, "incidents", null)
    
    inline def setIncidentsUndefined: Self = StObject.set(x, "incidents", js.undefined)
    
    inline def setIncidentsVarargs(value: Incident*): Self = StObject.set(x, "incidents", js.Array(value*))
    
    inline def setSecureScoreControlProfiles(value: NullableOption[js.Array[SecureScoreControlProfile]]): Self = StObject.set(x, "secureScoreControlProfiles", value.asInstanceOf[js.Any])
    
    inline def setSecureScoreControlProfilesNull: Self = StObject.set(x, "secureScoreControlProfiles", null)
    
    inline def setSecureScoreControlProfilesUndefined: Self = StObject.set(x, "secureScoreControlProfiles", js.undefined)
    
    inline def setSecureScoreControlProfilesVarargs(value: SecureScoreControlProfile*): Self = StObject.set(x, "secureScoreControlProfiles", js.Array(value*))
    
    inline def setSecureScores(value: NullableOption[js.Array[SecureScore]]): Self = StObject.set(x, "secureScores", value.asInstanceOf[js.Any])
    
    inline def setSecureScoresNull: Self = StObject.set(x, "secureScores", null)
    
    inline def setSecureScoresUndefined: Self = StObject.set(x, "secureScores", js.undefined)
    
    inline def setSecureScoresVarargs(value: SecureScore*): Self = StObject.set(x, "secureScores", js.Array(value*))
    
    inline def setTriggerTypes(value: NullableOption[TriggerTypesRoot]): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
    
    inline def setTriggerTypesNull: Self = StObject.set(x, "triggerTypes", null)
    
    inline def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
    
    inline def setTriggers(value: NullableOption[TriggersRoot]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersNull: Self = StObject.set(x, "triggers", null)
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
  }
}
