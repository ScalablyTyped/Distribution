package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202409422` extends StObject {
  
  /** Response */
  var `201`: Content487
  
  /** Merged branch response */
  var `202`: ContentApplicationjson34
  
  /** Conflict when there is a merge conflict or the commit's status checks failed */
  var `409`: Any
  
  var `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
}
object `202409422` {
  
  inline def apply(
    `201`: Content487,
    `202`: ContentApplicationjson34,
    `409`: Any,
    `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
  ): `202409422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202409422`]
  }
  
  extension [Self <: `202409422`](x: Self) {
    
    inline def set201(value: Content487): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjson34): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
    ): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
