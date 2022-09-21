package typings.octokitOpenapiTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `501` extends StObject {
  
  var reviewer: js.UndefOr[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ]
  ] = js.undefined
  
  var `type`: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['deployment-reviewer-type'] */ js.Any
  ] = js.undefined
}
object `501` {
  
  inline def apply(): `501` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`501`]
  }
  
  extension [Self <: `501`](x: Self) {
    
    inline def setReviewer(
      value: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
        ]
    ): Self = StObject.set(x, "reviewer", value.asInstanceOf[js.Any])
    
    inline def setReviewerUndefined: Self = StObject.set(x, "reviewer", js.undefined)
    
    inline def setType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['deployment-reviewer-type'] */ js.Any
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
