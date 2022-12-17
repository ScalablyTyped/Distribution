package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appslug extends StObject {
  
  var app_slug: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['app-slug'] */ js.Any
}
object Appslug {
  
  inline def apply(
    app_slug: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['app-slug'] */ js.Any
  ): Appslug = {
    val __obj = js.Dynamic.literal(app_slug = app_slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appslug]
  }
  
  extension [Self <: Appslug](x: Self) {
    
    inline def setApp_slug(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['app-slug'] */ js.Any
    ): Self = StObject.set(x, "app_slug", value.asInstanceOf[js.Any])
  }
}
