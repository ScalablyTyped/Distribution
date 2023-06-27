package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.critical
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.draft
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.high
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.low
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.medium
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.published
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.triage
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.withdrawn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Creditsdetailed extends StObject {
  
  /** @description The author of the advisory. */
  var author: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any) | Null
  
  /**
    * Format: date-time
    * @description The date and time of when the advisory was closed, in ISO 8601 format.
    */
  var closed_at: String | Null
  
  /**
    * Format: date-time
    * @description The date and time of when the advisory was created, in ISO 8601 format.
    */
  var created_at: String | Null
  
  var credits: js.Array[`542`] | Null
  
  var credits_detailed: (js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-credit'] */ js.Any
  ]) | Null
  
  /** @description The Common Vulnerabilities and Exposures (CVE) ID. */
  var cve_id: String | Null
  
  var cvss: Vectorstring | Null
  
  /** @description A list of only the CWE IDs. */
  var cwe_ids: js.Array[String] | Null
  
  var cwes: js.Array[CweidName] | Null
  
  /** @description A detailed description of what the advisory entails. */
  var description: String | Null
  
  /** @description The GitHub Security Advisory ID. */
  var ghsa_id: String
  
  /**
    * Format: uri
    * @description The URL for the advisory.
    */
  var html_url: String
  
  var identifiers: js.Array[ValueString]
  
  /**
    * Format: date-time
    * @description The date and time of when the advisory was published, in ISO 8601 format.
    */
  var published_at: String | Null
  
  /** @description The publisher of the advisory. */
  var publisher: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any) | Null
  
  /**
    * @description The severity of the advisory.
    * @enum {string|null}
    */
  var severity: critical | high | medium | low | Null
  
  /**
    * @description The state of the advisory.
    * @enum {string}
    */
  var state: published | closed | withdrawn | draft | triage
  
  var submission: Accepted | Null
  
  /** @description A short summary of the advisory. */
  var summary: String
  
  /**
    * Format: date-time
    * @description The date and time of when the advisory was last updated, in ISO 8601 format.
    */
  var updated_at: String | Null
  
  /** @description The API URL for the advisory. */
  var url: String
  
  var vulnerabilities: (js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-vulnerability'] */ js.Any
  ]) | Null
  
  /**
    * Format: date-time
    * @description The date and time of when the advisory was withdrawn, in ISO 8601 format.
    */
  var withdrawn_at: String | Null
}
object Creditsdetailed {
  
  inline def apply(
    ghsa_id: String,
    html_url: String,
    identifiers: js.Array[ValueString],
    state: published | closed | withdrawn | draft | triage,
    summary: String,
    url: String
  ): Creditsdetailed = {
    val __obj = js.Dynamic.literal(ghsa_id = ghsa_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], author = null, closed_at = null, created_at = null, credits = null, credits_detailed = null, cve_id = null, cvss = null, cwe_ids = null, cwes = null, description = null, published_at = null, publisher = null, severity = null, submission = null, updated_at = null, vulnerabilities = null, withdrawn_at = null)
    __obj.asInstanceOf[Creditsdetailed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Creditsdetailed] (val x: Self) extends AnyVal {
    
    inline def setAuthor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    inline def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setCredits(value: js.Array[`542`]): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    inline def setCreditsNull: Self = StObject.set(x, "credits", null)
    
    inline def setCreditsVarargs(value: `542`*): Self = StObject.set(x, "credits", js.Array(value*))
    
    inline def setCredits_detailed(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-credit'] */ js.Any
        ]
    ): Self = StObject.set(x, "credits_detailed", value.asInstanceOf[js.Any])
    
    inline def setCredits_detailedNull: Self = StObject.set(x, "credits_detailed", null)
    
    inline def setCredits_detailedVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-credit'] */ js.Any)*
    ): Self = StObject.set(x, "credits_detailed", js.Array(value*))
    
    inline def setCve_id(value: String): Self = StObject.set(x, "cve_id", value.asInstanceOf[js.Any])
    
    inline def setCve_idNull: Self = StObject.set(x, "cve_id", null)
    
    inline def setCvss(value: Vectorstring): Self = StObject.set(x, "cvss", value.asInstanceOf[js.Any])
    
    inline def setCvssNull: Self = StObject.set(x, "cvss", null)
    
    inline def setCwe_ids(value: js.Array[String]): Self = StObject.set(x, "cwe_ids", value.asInstanceOf[js.Any])
    
    inline def setCwe_idsNull: Self = StObject.set(x, "cwe_ids", null)
    
    inline def setCwe_idsVarargs(value: String*): Self = StObject.set(x, "cwe_ids", js.Array(value*))
    
    inline def setCwes(value: js.Array[CweidName]): Self = StObject.set(x, "cwes", value.asInstanceOf[js.Any])
    
    inline def setCwesNull: Self = StObject.set(x, "cwes", null)
    
    inline def setCwesVarargs(value: CweidName*): Self = StObject.set(x, "cwes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setGhsa_id(value: String): Self = StObject.set(x, "ghsa_id", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setIdentifiers(value: js.Array[ValueString]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersVarargs(value: ValueString*): Self = StObject.set(x, "identifiers", js.Array(value*))
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setPublished_atNull: Self = StObject.set(x, "published_at", null)
    
    inline def setPublisher(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setSeverity(value: critical | high | medium | low): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setState(value: published | closed | withdrawn | draft | triage): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSubmission(value: Accepted): Self = StObject.set(x, "submission", value.asInstanceOf[js.Any])
    
    inline def setSubmissionNull: Self = StObject.set(x, "submission", null)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilities(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-vulnerability'] */ js.Any
        ]
    ): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesNull: Self = StObject.set(x, "vulnerabilities", null)
    
    inline def setVulnerabilitiesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-vulnerability'] */ js.Any)*
    ): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
    
    inline def setWithdrawn_at(value: String): Self = StObject.set(x, "withdrawn_at", value.asInstanceOf[js.Any])
    
    inline def setWithdrawn_atNull: Self = StObject.set(x, "withdrawn_at", null)
  }
}
