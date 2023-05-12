package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `443` extends StObject {
  
  var ecosystem: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-ecosystems'] */ js.Any
  
  /** @description The unique package name within its ecosystem. */
  var name: String | Null
}
object `443` {
  
  inline def apply(
    ecosystem: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-ecosystems'] */ js.Any
  ): `443` = {
    val __obj = js.Dynamic.literal(ecosystem = ecosystem.asInstanceOf[js.Any], name = null)
    __obj.asInstanceOf[`443`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `443`] (val x: Self) extends AnyVal {
    
    inline def setEcosystem(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-ecosystems'] */ js.Any
    ): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
  }
}
