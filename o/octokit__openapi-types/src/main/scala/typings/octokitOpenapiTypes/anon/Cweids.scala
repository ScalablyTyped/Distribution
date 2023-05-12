package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.critical
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.high
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.low
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cweids extends StObject {
  
  /** @description The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or `severity`. */
  var cvss_vector_string: js.UndefOr[String | Null] = js.undefined
  
  /** @description A list of Common Weakness Enumeration (CWE) IDs. */
  var cwe_ids: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** @description A detailed description of what the advisory impacts. */
  var description: String
  
  /**
    * @description The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
    * @enum {string|null}
    */
  var severity: js.UndefOr[critical | high | medium | low | Null] = js.undefined
  
  /** @description A short summary of the advisory. */
  var summary: String
  
  /** @description An array of products affected by the vulnerability detailed in a repository security advisory. */
  var vulnerabilities: js.UndefOr[js.Array[Vulnerableversionrange] | Null] = js.undefined
}
object Cweids {
  
  inline def apply(description: String, summary: String): Cweids = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cweids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cweids] (val x: Self) extends AnyVal {
    
    inline def setCvss_vector_string(value: String): Self = StObject.set(x, "cvss_vector_string", value.asInstanceOf[js.Any])
    
    inline def setCvss_vector_stringNull: Self = StObject.set(x, "cvss_vector_string", null)
    
    inline def setCvss_vector_stringUndefined: Self = StObject.set(x, "cvss_vector_string", js.undefined)
    
    inline def setCwe_ids(value: js.Array[String]): Self = StObject.set(x, "cwe_ids", value.asInstanceOf[js.Any])
    
    inline def setCwe_idsNull: Self = StObject.set(x, "cwe_ids", null)
    
    inline def setCwe_idsUndefined: Self = StObject.set(x, "cwe_ids", js.undefined)
    
    inline def setCwe_idsVarargs(value: String*): Self = StObject.set(x, "cwe_ids", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: critical | high | medium | low): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilities(value: js.Array[Vulnerableversionrange]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesNull: Self = StObject.set(x, "vulnerabilities", null)
    
    inline def setVulnerabilitiesUndefined: Self = StObject.set(x, "vulnerabilities", js.undefined)
    
    inline def setVulnerabilitiesVarargs(value: Vulnerableversionrange*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
  }
}
