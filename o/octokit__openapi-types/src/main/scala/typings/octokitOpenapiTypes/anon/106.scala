package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  var id: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-sarif-id'] */ js.Any
  ] = js.undefined
  
  /**
    * Format: uri
    * @description The REST API URL for checking the status of the upload.
    */
  var url: js.UndefOr[String] = js.undefined
}
object `106` {
  
  inline def apply(): `106` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`106`]
  }
  
  extension [Self <: `106`](x: Self) {
    
    inline def setId(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-sarif-id'] */ js.Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
