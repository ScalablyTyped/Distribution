package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `386` extends StObject {
  
  /** The unique identifier of the column. */
  var column_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['column-id'] */ js.Any
}
object `386` {
  
  inline def apply(
    column_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['column-id'] */ js.Any
  ): `386` = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`386`]
  }
  
  extension [Self <: `386`](x: Self) {
    
    inline def setColumn_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['column-id'] */ js.Any
    ): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
  }
}
