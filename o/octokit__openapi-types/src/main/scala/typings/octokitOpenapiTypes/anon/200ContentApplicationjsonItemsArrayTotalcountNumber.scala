package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonItemsArrayTotalcountNumber` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonItemsArrayTotalcountNumber
  
  var `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
}
object `200ContentApplicationjsonItemsArrayTotalcountNumber` {
  
  inline def apply(
    `200`: ContentApplicationjsonItemsArrayTotalcountNumber,
    `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
  ): `200ContentApplicationjsonItemsArrayTotalcountNumber` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonItemsArrayTotalcountNumber`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonItemsArrayTotalcountNumber`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonItemsArrayTotalcountNumber): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
    ): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
