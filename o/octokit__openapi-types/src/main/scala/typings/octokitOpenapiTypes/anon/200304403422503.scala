package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200304403422503` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonIncompleteresultsBooleanItemsArrayTotalcountNumber
  
  var `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
  
  var `403`: Content41
  
  var `422`: Content414
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `200304403422503` {
  
  inline def apply(
    `200`: ContentApplicationjsonIncompleteresultsBooleanItemsArrayTotalcountNumber,
    `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any,
    `403`: Content41,
    `422`: Content414,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `200304403422503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200304403422503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200304403422503`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonIncompleteresultsBooleanItemsArrayTotalcountNumber): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
    ): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
