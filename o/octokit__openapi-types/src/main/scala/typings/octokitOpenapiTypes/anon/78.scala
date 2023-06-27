package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `78` extends StObject {
  
  var name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['variable-name'] */ js.Any
  
  @JSName("org")
  var org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
}
object `78` {
  
  inline def apply(
    name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['variable-name'] */ js.Any,
    org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
  ): `78` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[`78`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `78`] (val x: Self) extends AnyVal {
    
    inline def setName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['variable-name'] */ js.Any
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrg_(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
    ): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
