package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifiers extends StObject {
  
  var cvss: ScoreVectorstring
  
  var cwes: js.Array[CweidName]
  
  var description: String
  
  var ghsa_id: String
  
  var identifiers: js.Array[TypeString]
  
  var published_at: String
  
  var references: js.Array[`544`]
  
  var severity: String
  
  var summary: String
  
  var updated_at: String
  
  var vulnerabilities: js.Array[FirstpatchedversionPackage]
  
  var withdrawn_at: String
}
object Identifiers {
  
  inline def apply(
    cvss: ScoreVectorstring,
    cwes: js.Array[CweidName],
    description: String,
    ghsa_id: String,
    identifiers: js.Array[TypeString],
    published_at: String,
    references: js.Array[`544`],
    severity: String,
    summary: String,
    updated_at: String,
    vulnerabilities: js.Array[FirstpatchedversionPackage],
    withdrawn_at: String
  ): Identifiers = {
    val __obj = js.Dynamic.literal(cvss = cvss.asInstanceOf[js.Any], cwes = cwes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], ghsa_id = ghsa_id.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], vulnerabilities = vulnerabilities.asInstanceOf[js.Any], withdrawn_at = withdrawn_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifiers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Identifiers] (val x: Self) extends AnyVal {
    
    inline def setCvss(value: ScoreVectorstring): Self = StObject.set(x, "cvss", value.asInstanceOf[js.Any])
    
    inline def setCwes(value: js.Array[CweidName]): Self = StObject.set(x, "cwes", value.asInstanceOf[js.Any])
    
    inline def setCwesVarargs(value: CweidName*): Self = StObject.set(x, "cwes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGhsa_id(value: String): Self = StObject.set(x, "ghsa_id", value.asInstanceOf[js.Any])
    
    inline def setIdentifiers(value: js.Array[TypeString]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersVarargs(value: TypeString*): Self = StObject.set(x, "identifiers", js.Array(value*))
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: js.Array[`544`]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: `544`*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilities(value: js.Array[FirstpatchedversionPackage]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesVarargs(value: FirstpatchedversionPackage*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
    
    inline def setWithdrawn_at(value: String): Self = StObject.set(x, "withdrawn_at", value.asInstanceOf[js.Any])
  }
}
