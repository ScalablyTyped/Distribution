package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `464` extends StObject {
  
  /** @description The username of the user credited. */
  var login: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-credit-types'] */ js.Any
  ] = js.undefined
}
object `464` {
  
  inline def apply(): `464` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`464`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `464`] (val x: Self) extends AnyVal {
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-credit-types'] */ js.Any
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
