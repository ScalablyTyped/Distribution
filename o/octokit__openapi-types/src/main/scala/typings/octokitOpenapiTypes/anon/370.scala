package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `370` extends StObject {
  
  var username: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
}
object `370` {
  
  inline def apply(
    username: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
  ): `370` = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[`370`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `370`] (val x: Self) extends AnyVal {
    
    inline def setUsername(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
    ): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
