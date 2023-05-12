package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gistid extends StObject {
  
  var gist_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
}
object Gistid {
  
  inline def apply(
    gist_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
  ): Gistid = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gistid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gistid] (val x: Self) extends AnyVal {
    
    inline def setGist_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
    ): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
