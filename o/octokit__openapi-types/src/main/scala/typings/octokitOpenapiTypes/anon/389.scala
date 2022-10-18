package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `389` extends StObject {
  
  /** The unique identifier of the project. */
  var project_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['project-id'] */ js.Any
}
object `389` {
  
  inline def apply(
    project_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['project-id'] */ js.Any
  ): `389` = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`389`]
  }
  
  extension [Self <: `389`](x: Self) {
    
    inline def setProject_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['project-id'] */ js.Any
    ): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
  }
}
