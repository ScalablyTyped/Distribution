package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Advisoryghsaid extends StObject {
  
  /** @example GHSA-rf4j-j272-fj86 */
  var advisory_ghsa_id: String
  
  /** @example A summary of the advisory. */
  var advisory_summary: String
  
  /** @example https://github.com/advisories/GHSA-rf4j-j272-fj86 */
  var advisory_url: String
  
  /** @example critical */
  var severity: String
}
object Advisoryghsaid {
  
  inline def apply(advisory_ghsa_id: String, advisory_summary: String, advisory_url: String, severity: String): Advisoryghsaid = {
    val __obj = js.Dynamic.literal(advisory_ghsa_id = advisory_ghsa_id.asInstanceOf[js.Any], advisory_summary = advisory_summary.asInstanceOf[js.Any], advisory_url = advisory_url.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advisoryghsaid]
  }
  
  extension [Self <: Advisoryghsaid](x: Self) {
    
    inline def setAdvisory_ghsa_id(value: String): Self = StObject.set(x, "advisory_ghsa_id", value.asInstanceOf[js.Any])
    
    inline def setAdvisory_summary(value: String): Self = StObject.set(x, "advisory_summary", value.asInstanceOf[js.Any])
    
    inline def setAdvisory_url(value: String): Self = StObject.set(x, "advisory_url", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
  }
}
