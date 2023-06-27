package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `761` extends StObject {
  
  var ecosystem: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['security-advisory-ecosystems'] */ js.Any
  
  /** @description The unique package name within its ecosystem. */
  var name: js.UndefOr[String | Null] = js.undefined
}
object `761` {
  
  inline def apply(
    ecosystem: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['security-advisory-ecosystems'] */ js.Any
  ): `761` = {
    val __obj = js.Dynamic.literal(ecosystem = ecosystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[`761`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `761`] (val x: Self) extends AnyVal {
    
    inline def setEcosystem(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['security-advisory-ecosystems'] */ js.Any
    ): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
