package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `389` extends StObject {
  
  var key_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['key-id'] */ js.Any
}
object `389` {
  
  inline def apply(
    key_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['key-id'] */ js.Any
  ): `389` = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`389`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `389`] (val x: Self) extends AnyVal {
    
    inline def setKey_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['key-id'] */ js.Any
    ): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
