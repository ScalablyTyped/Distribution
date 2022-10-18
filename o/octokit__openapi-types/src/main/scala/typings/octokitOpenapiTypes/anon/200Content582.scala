package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content582` extends StObject {
  
  /** Returns a weekly aggregate of the number of additions and deletions pushed to a repository. */
  var `200`: Content582
  
  var `202`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['accepted'] */ js.Any
  
  var `204`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['no_content'] */ js.Any
}
object `200Content582` {
  
  inline def apply(
    `200`: Content582,
    `202`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['accepted'] */ js.Any,
    `204`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['no_content'] */ js.Any
  ): `200Content582` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content582`]
  }
  
  extension [Self <: `200Content582`](x: Self) {
    
    inline def set200(value: Content582): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['accepted'] */ js.Any
    ): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set204(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['no_content'] */ js.Any
    ): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
  }
}
