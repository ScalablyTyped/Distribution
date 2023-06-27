package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200201422` extends StObject {
  
  /** @description Reaction exists */
  var `200`: Content140
  
  /** @description Reaction created */
  var `201`: Content140
  
  var `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
}
object `200201422` {
  
  inline def apply(
    `200`: Content140,
    `201`: Content140,
    `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
  ): `200201422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200201422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200201422`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content140): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: Content140): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
    ): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
