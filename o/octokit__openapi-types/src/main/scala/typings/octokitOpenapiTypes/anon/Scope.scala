package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-package'] */ js.Any
  ] = js.undefined
  
  /** @description The path to the manifest filename. */
  var manifest_path: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-scope'] */ js.Any
  ] = js.undefined
}
object Scope {
  
  inline def apply(): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
    
    inline def setManifest_path(value: String): Self = StObject.set(x, "manifest_path", value.asInstanceOf[js.Any])
    
    inline def setManifest_pathUndefined: Self = StObject.set(x, "manifest_path", js.undefined)
    
    inline def setScope(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-scope'] */ js.Any
    ): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def set_package(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-package'] */ js.Any
    ): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
