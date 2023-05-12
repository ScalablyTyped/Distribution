package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.critical
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.draft
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.high
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.low
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.medium
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.published
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Summary extends StObject {
  
  /** @description A list of users receiving credit for their participation in the security advisory. */
  var credits: js.UndefOr[js.Array[LoginString] | Null] = js.undefined
  
  /** @description The Common Vulnerabilities and Exposures (CVE) ID. */
  var cve_id: js.UndefOr[String | Null] = js.undefined
  
  /** @description The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or `severity`. */
  var cvss_vector_string: js.UndefOr[String | Null] = js.undefined
  
  /** @description A list of Common Weakness Enumeration (CWE) IDs. */
  var cwe_ids: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** @description A detailed description of what the advisory impacts. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * @description The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
    * @enum {string|null}
    */
  var severity: js.UndefOr[critical | high | medium | low | Null] = js.undefined
  
  /**
    * @description The state of the advisory.
    * @enum {string}
    */
  var state: js.UndefOr[published | closed | draft] = js.undefined
  
  /** @description A short summary of the advisory. */
  var summary: js.UndefOr[String] = js.undefined
  
  /** @description A product affected by the vulnerability detailed in a repository security advisory. */
  var vulnerabilities: js.UndefOr[js.Array[Vulnerableversionrange]] = js.undefined
}
object Summary {
  
  inline def apply(): Summary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Summary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Summary] (val x: Self) extends AnyVal {
    
    inline def setCredits(value: js.Array[LoginString]): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    inline def setCreditsNull: Self = StObject.set(x, "credits", null)
    
    inline def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    inline def setCreditsVarargs(value: LoginString*): Self = StObject.set(x, "credits", js.Array(value*))
    
    inline def setCve_id(value: String): Self = StObject.set(x, "cve_id", value.asInstanceOf[js.Any])
    
    inline def setCve_idNull: Self = StObject.set(x, "cve_id", null)
    
    inline def setCve_idUndefined: Self = StObject.set(x, "cve_id", js.undefined)
    
    inline def setCvss_vector_string(value: String): Self = StObject.set(x, "cvss_vector_string", value.asInstanceOf[js.Any])
    
    inline def setCvss_vector_stringNull: Self = StObject.set(x, "cvss_vector_string", null)
    
    inline def setCvss_vector_stringUndefined: Self = StObject.set(x, "cvss_vector_string", js.undefined)
    
    inline def setCwe_ids(value: js.Array[String]): Self = StObject.set(x, "cwe_ids", value.asInstanceOf[js.Any])
    
    inline def setCwe_idsNull: Self = StObject.set(x, "cwe_ids", null)
    
    inline def setCwe_idsUndefined: Self = StObject.set(x, "cwe_ids", js.undefined)
    
    inline def setCwe_idsVarargs(value: String*): Self = StObject.set(x, "cwe_ids", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSeverity(value: critical | high | medium | low): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setState(value: published | closed | draft): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setVulnerabilities(value: js.Array[Vulnerableversionrange]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesUndefined: Self = StObject.set(x, "vulnerabilities", js.undefined)
    
    inline def setVulnerabilitiesVarargs(value: Vulnerableversionrange*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
  }
}
