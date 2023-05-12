package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRef extends StObject {
  
  var key: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['actions-cache-key-required'] */ js.Any
  
  var ref: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['actions-cache-git-ref-full'] */ js.Any
  ] = js.undefined
}
object KeyRef {
  
  inline def apply(
    key: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['actions-cache-key-required'] */ js.Any
  ): KeyRef = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyRef] (val x: Self) extends AnyVal {
    
    inline def setKey(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['actions-cache-key-required'] */ js.Any
    ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRef(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['actions-cache-git-ref-full'] */ js.Any
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
