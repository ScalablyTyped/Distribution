package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MitreAttack extends StObject {
  
  /** Additional MITRE ATT&CK tactics related to this finding, if any. */
  var additionalTactics: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Additional MITRE ATT&CK techniques related to this finding, if any, along with any of their respective parent techniques. */
  var additionalTechniques: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The MITRE ATT&CK tactic most closely represented by this finding, if any. */
  var primaryTactic: js.UndefOr[String] = js.undefined
  
  /**
    * The MITRE ATT&CK technique most closely represented by this finding, if any. primary_techniques is a repeated field because there are multiple levels of MITRE ATT&CK techniques. If
    * the technique most closely represented by this finding is a sub-technique (e.g. `SCANNING_IP_BLOCKS`), both the sub-technique and its parent technique(s) will be listed (e.g.
    * `SCANNING_IP_BLOCKS`, `ACTIVE_SCANNING`).
    */
  var primaryTechniques: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The MITRE ATT&CK version referenced by the above fields. E.g. "8". */
  var version: js.UndefOr[String] = js.undefined
}
object MitreAttack {
  
  inline def apply(): MitreAttack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitreAttack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MitreAttack] (val x: Self) extends AnyVal {
    
    inline def setAdditionalTactics(value: js.Array[String]): Self = StObject.set(x, "additionalTactics", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTacticsUndefined: Self = StObject.set(x, "additionalTactics", js.undefined)
    
    inline def setAdditionalTacticsVarargs(value: String*): Self = StObject.set(x, "additionalTactics", js.Array(value*))
    
    inline def setAdditionalTechniques(value: js.Array[String]): Self = StObject.set(x, "additionalTechniques", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTechniquesUndefined: Self = StObject.set(x, "additionalTechniques", js.undefined)
    
    inline def setAdditionalTechniquesVarargs(value: String*): Self = StObject.set(x, "additionalTechniques", js.Array(value*))
    
    inline def setPrimaryTactic(value: String): Self = StObject.set(x, "primaryTactic", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTacticUndefined: Self = StObject.set(x, "primaryTactic", js.undefined)
    
    inline def setPrimaryTechniques(value: js.Array[String]): Self = StObject.set(x, "primaryTechniques", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTechniquesUndefined: Self = StObject.set(x, "primaryTechniques", js.undefined)
    
    inline def setPrimaryTechniquesVarargs(value: String*): Self = StObject.set(x, "primaryTechniques", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
