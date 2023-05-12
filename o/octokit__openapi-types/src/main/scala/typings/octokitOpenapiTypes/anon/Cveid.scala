package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.critical
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.high
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.low
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cveid extends StObject {
  
  /** @description The unique CVE ID assigned to the advisory. */
  val cve_id: String | Null
  
  /** @description Details for the advisory pertaining to the Common Vulnerability Scoring System. */
  val cvss: Score
  
  /** @description Details for the advisory pertaining to Common Weakness Enumeration. */
  val cwes: js.Array[Cweid]
  
  /** @description A long-form Markdown-supported description of the advisory. */
  val description: String
  
  /** @description The unique GitHub Security Advisory ID assigned to the advisory. */
  val ghsa_id: String
  
  /** @description Values that identify this advisory among security information sources. */
  val identifiers: js.Array[TypeValue]
  
  /**
    * Format: date-time
    * @description The time that the advisory was published in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  val published_at: String
  
  /** @description Links to additional advisory information. */
  val references: js.Array[UrlString]
  
  /**
    * @description The severity of the advisory.
    * @enum {string}
    */
  val severity: low | medium | high | critical
  
  /** @description A short, plain text summary of the advisory. */
  val summary: String
  
  /**
    * Format: date-time
    * @description The time that the advisory was last modified in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  val updated_at: String
  
  /** @description Vulnerable version range information for the advisory. */
  val vulnerabilities: js.Array[Package]
  
  /**
    * Format: date-time
    * @description The time that the advisory was withdrawn in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  val withdrawn_at: String | Null
}
object Cveid {
  
  inline def apply(
    cvss: Score,
    cwes: js.Array[Cweid],
    description: String,
    ghsa_id: String,
    identifiers: js.Array[TypeValue],
    published_at: String,
    references: js.Array[UrlString],
    severity: low | medium | high | critical,
    summary: String,
    updated_at: String,
    vulnerabilities: js.Array[Package]
  ): Cveid = {
    val __obj = js.Dynamic.literal(cvss = cvss.asInstanceOf[js.Any], cwes = cwes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], ghsa_id = ghsa_id.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], vulnerabilities = vulnerabilities.asInstanceOf[js.Any], cve_id = null, withdrawn_at = null)
    __obj.asInstanceOf[Cveid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cveid] (val x: Self) extends AnyVal {
    
    inline def setCve_id(value: String): Self = StObject.set(x, "cve_id", value.asInstanceOf[js.Any])
    
    inline def setCve_idNull: Self = StObject.set(x, "cve_id", null)
    
    inline def setCvss(value: Score): Self = StObject.set(x, "cvss", value.asInstanceOf[js.Any])
    
    inline def setCwes(value: js.Array[Cweid]): Self = StObject.set(x, "cwes", value.asInstanceOf[js.Any])
    
    inline def setCwesVarargs(value: Cweid*): Self = StObject.set(x, "cwes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGhsa_id(value: String): Self = StObject.set(x, "ghsa_id", value.asInstanceOf[js.Any])
    
    inline def setIdentifiers(value: js.Array[TypeValue]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersVarargs(value: TypeValue*): Self = StObject.set(x, "identifiers", js.Array(value*))
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: js.Array[UrlString]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: UrlString*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setSeverity(value: low | medium | high | critical): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilities(value: js.Array[Package]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesVarargs(value: Package*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
    
    inline def setWithdrawn_at(value: String): Self = StObject.set(x, "withdrawn_at", value.asInstanceOf[js.Any])
    
    inline def setWithdrawn_atNull: Self = StObject.set(x, "withdrawn_at", null)
  }
}
