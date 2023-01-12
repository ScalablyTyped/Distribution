package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.critical
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.high
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.low
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cveid extends StObject {
  
  var cve_id: js.UndefOr[String | Null] = js.undefined
  
  var cvss: Score
  
  var cwes: js.Array[Cweid]
  
  var description: String
  
  var ghsa_id: String
  
  var identifiers: js.Array[Value]
  
  /** Format: date-time */
  var published_at: String
  
  var references: js.Array[UrlString]
  
  /** @enum {string} */
  var severity: low | medium | high | critical
  
  var summary: String
  
  /** Format: date-time */
  var updated_at: String
  
  var vulnerabilities: js.Array[Firstpatchedversion]
  
  /** Format: date-time */
  var withdrawn_at: String | Null
}
object Cveid {
  
  inline def apply(
    cvss: Score,
    cwes: js.Array[Cweid],
    description: String,
    ghsa_id: String,
    identifiers: js.Array[Value],
    published_at: String,
    references: js.Array[UrlString],
    severity: low | medium | high | critical,
    summary: String,
    updated_at: String,
    vulnerabilities: js.Array[Firstpatchedversion]
  ): Cveid = {
    val __obj = js.Dynamic.literal(cvss = cvss.asInstanceOf[js.Any], cwes = cwes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], ghsa_id = ghsa_id.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], vulnerabilities = vulnerabilities.asInstanceOf[js.Any], withdrawn_at = null)
    __obj.asInstanceOf[Cveid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cveid] (val x: Self) extends AnyVal {
    
    inline def setCve_id(value: String): Self = StObject.set(x, "cve_id", value.asInstanceOf[js.Any])
    
    inline def setCve_idNull: Self = StObject.set(x, "cve_id", null)
    
    inline def setCve_idUndefined: Self = StObject.set(x, "cve_id", js.undefined)
    
    inline def setCvss(value: Score): Self = StObject.set(x, "cvss", value.asInstanceOf[js.Any])
    
    inline def setCwes(value: js.Array[Cweid]): Self = StObject.set(x, "cwes", value.asInstanceOf[js.Any])
    
    inline def setCwesVarargs(value: Cweid*): Self = StObject.set(x, "cwes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGhsa_id(value: String): Self = StObject.set(x, "ghsa_id", value.asInstanceOf[js.Any])
    
    inline def setIdentifiers(value: js.Array[Value]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersVarargs(value: Value*): Self = StObject.set(x, "identifiers", js.Array(value*))
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: js.Array[UrlString]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: UrlString*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setSeverity(value: low | medium | high | critical): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilities(value: js.Array[Firstpatchedversion]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesVarargs(value: Firstpatchedversion*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
    
    inline def setWithdrawn_at(value: String): Self = StObject.set(x, "withdrawn_at", value.asInstanceOf[js.Any])
    
    inline def setWithdrawn_atNull: Self = StObject.set(x, "withdrawn_at", null)
  }
}
