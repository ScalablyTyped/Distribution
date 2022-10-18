package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `416` extends StObject {
  
  /** If `true` pull requests are omitted from the response (empty array). */
  var exclude_pull_requests: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['exclude-pull-requests'] */ js.Any
  ] = js.undefined
}
object `416` {
  
  inline def apply(): `416` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`416`]
  }
  
  extension [Self <: `416`](x: Self) {
    
    inline def setExclude_pull_requests(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['exclude-pull-requests'] */ js.Any
    ): Self = StObject.set(x, "exclude_pull_requests", value.asInstanceOf[js.Any])
    
    inline def setExclude_pull_requestsUndefined: Self = StObject.set(x, "exclude_pull_requests", js.undefined)
  }
}
