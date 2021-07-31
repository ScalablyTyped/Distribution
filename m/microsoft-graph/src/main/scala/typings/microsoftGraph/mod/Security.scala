package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Security
  extends StObject
     with Entity {
  
  // Read-only. Nullable.
  var alerts: js.UndefOr[NullableOption[js.Array[Alert]]] = js.undefined
  
  var secureScoreControlProfiles: js.UndefOr[NullableOption[js.Array[SecureScoreControlProfile]]] = js.undefined
  
  var secureScores: js.UndefOr[NullableOption[js.Array[SecureScore]]] = js.undefined
}
object Security {
  
  @scala.inline
  def apply(): Security = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Security]
  }
  
  @scala.inline
  implicit class SecurityMutableBuilder[Self <: Security] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlerts(value: NullableOption[js.Array[Alert]]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertsNull: Self = StObject.set(x, "alerts", null)
    
    @scala.inline
    def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
    
    @scala.inline
    def setAlertsVarargs(value: Alert*): Self = StObject.set(x, "alerts", js.Array(value :_*))
    
    @scala.inline
    def setSecureScoreControlProfiles(value: NullableOption[js.Array[SecureScoreControlProfile]]): Self = StObject.set(x, "secureScoreControlProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureScoreControlProfilesNull: Self = StObject.set(x, "secureScoreControlProfiles", null)
    
    @scala.inline
    def setSecureScoreControlProfilesUndefined: Self = StObject.set(x, "secureScoreControlProfiles", js.undefined)
    
    @scala.inline
    def setSecureScoreControlProfilesVarargs(value: SecureScoreControlProfile*): Self = StObject.set(x, "secureScoreControlProfiles", js.Array(value :_*))
    
    @scala.inline
    def setSecureScores(value: NullableOption[js.Array[SecureScore]]): Self = StObject.set(x, "secureScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureScoresNull: Self = StObject.set(x, "secureScores", null)
    
    @scala.inline
    def setSecureScoresUndefined: Self = StObject.set(x, "secureScores", js.undefined)
    
    @scala.inline
    def setSecureScoresVarargs(value: SecureScore*): Self = StObject.set(x, "secureScores", js.Array(value :_*))
  }
}
