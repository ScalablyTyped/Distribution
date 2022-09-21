package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Correlator extends StObject {
  
  /**
    * @description Correlator provides a key that is used to group snapshots submitted over time. Only the "latest" submitted snapshot for a given combination of `job.correlator` and `detector.name` will be considered when calculating a repository's current dependencies. Correlator should be as unique as it takes to distinguish all detection runs for a given "wave" of CI workflow you run. If you're using GitHub Actions, a good default value for this could be the environment variables GITHUB_WORKFLOW and GITHUB_JOB concatenated together. If you're using a build matrix, then you'll also need to add additional key(s) to distinguish between each submission inside a matrix variation.
    * @example yourworkflowname_yourjobname
    */
  var correlator: String
  
  /**
    * @description The url for the job.
    * @example http://example.com/build
    */
  var html_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description The external ID of the job.
    * @example 5622a2b0-63f6-4732-8c34-a1ab27e102a11
    */
  var id: String
}
object Correlator {
  
  inline def apply(correlator: String, id: String): Correlator = {
    val __obj = js.Dynamic.literal(correlator = correlator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Correlator]
  }
  
  extension [Self <: Correlator](x: Self) {
    
    inline def setCorrelator(value: String): Self = StObject.set(x, "correlator", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
