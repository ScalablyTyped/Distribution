package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content582204` extends StObject {
  
  /** For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits. */
  var `200`: Content582
  
  var `204`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['no_content'] */ js.Any
}
object `200Content582204` {
  
  inline def apply(
    `200`: Content582,
    `204`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['no_content'] */ js.Any
  ): `200Content582204` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content582204`]
  }
  
  extension [Self <: `200Content582204`](x: Self) {
    
    inline def set200(value: Content582): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set204(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['no_content'] */ js.Any
    ): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
  }
}
