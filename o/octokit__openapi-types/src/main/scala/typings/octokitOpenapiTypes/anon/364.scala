package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `364` extends StObject {
  
  var since: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['since-repo'] */ js.Any
  ] = js.undefined
}
object `364` {
  
  inline def apply(): `364` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`364`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `364`] (val x: Self) extends AnyVal {
    
    inline def setSince(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['since-repo'] */ js.Any
    ): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
