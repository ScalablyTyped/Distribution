package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201422` extends StObject {
  
  /** @description Response */
  var `201`: Content68
  
  var `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed_simple'] */ js.Any
}
object `201422` {
  
  inline def apply(
    `201`: Content68,
    `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed_simple'] */ js.Any
  ): `201422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201422`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content68): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed_simple'] */ js.Any
    ): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
