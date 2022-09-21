package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `347` extends StObject {
  
  /** A repository ID. Only return repositories with an ID greater than this ID. */
  var since: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['since-repo'] */ js.Any
  ] = js.undefined
}
object `347` {
  
  inline def apply(): `347` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`347`]
  }
  
  extension [Self <: `347`](x: Self) {
    
    inline def setSince(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['since-repo'] */ js.Any
    ): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
