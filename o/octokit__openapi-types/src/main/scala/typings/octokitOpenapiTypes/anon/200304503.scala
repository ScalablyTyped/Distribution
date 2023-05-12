package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200304503` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonPushprotectionbypassedat
  
  var `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabelsreadonly['not_modified'] */ js.Any
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `200304503` {
  
  inline def apply(
    `200`: ContentApplicationjsonPushprotectionbypassedat,
    `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabelsreadonly['not_modified'] */ js.Any,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `200304503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200304503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200304503`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonPushprotectionbypassedat): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabelsreadonly['not_modified'] */ js.Any
    ): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
