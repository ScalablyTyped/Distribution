package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `518` extends StObject {
  
  var issue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['issue'] */ js.Any
  ] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object `518` {
  
  inline def apply(): `518` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`518`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `518`] (val x: Self) extends AnyVal {
    
    inline def setIssue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['issue'] */ js.Any
    ): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
