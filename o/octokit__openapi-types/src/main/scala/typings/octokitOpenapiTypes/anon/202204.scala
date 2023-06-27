package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202204` extends StObject {
  
  /** @description Returns a weekly aggregate of the number of additions and deletions pushed to a repository. */
  var `200`: Content416
  
  var `202`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['accepted'] */ js.Any
  
  var `204`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['no_content'] */ js.Any
}
object `202204` {
  
  inline def apply(
    `200`: Content416,
    `202`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['accepted'] */ js.Any,
    `204`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['no_content'] */ js.Any
  ): `202204` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202204`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202204`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content416): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['accepted'] */ js.Any
    ): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set204(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['no_content'] */ js.Any
    ): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
  }
}
