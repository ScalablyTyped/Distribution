package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sha extends StObject {
  
  /** The unique identifier of the gist. */
  var gist_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
  
  var sha: String
}
object Sha {
  
  inline def apply(
    gist_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any,
    sha: String
  ): Sha = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sha] (val x: Self) extends AnyVal {
    
    inline def setGist_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
    ): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
