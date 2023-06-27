package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `521` extends StObject {
  
  var ecosystem: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['security-advisory-ecosystems'] */ js.Any
  
  /** @description The unique package name within its ecosystem. */
  var name: String | Null
}
object `521` {
  
  inline def apply(
    ecosystem: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['security-advisory-ecosystems'] */ js.Any
  ): `521` = {
    val __obj = js.Dynamic.literal(ecosystem = ecosystem.asInstanceOf[js.Any], name = null)
    __obj.asInstanceOf[`521`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `521`] (val x: Self) extends AnyVal {
    
    inline def setEcosystem(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['security-advisory-ecosystems'] */ js.Any
    ): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
  }
}
