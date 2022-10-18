package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsecuresslSecret extends StObject {
  
  var content_type: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-content-type'] */ js.Any
  ] = js.undefined
  
  var insecure_ssl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-insecure-ssl'] */ js.Any
  ] = js.undefined
  
  var secret: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-secret'] */ js.Any
  ] = js.undefined
  
  var url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-url'] */ js.Any
}
object InsecuresslSecret {
  
  inline def apply(
    url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-url'] */ js.Any
  ): InsecuresslSecret = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsecuresslSecret]
  }
  
  extension [Self <: InsecuresslSecret](x: Self) {
    
    inline def setContent_type(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-content-type'] */ js.Any
    ): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setInsecure_ssl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-insecure-ssl'] */ js.Any
    ): Self = StObject.set(x, "insecure_ssl", value.asInstanceOf[js.Any])
    
    inline def setInsecure_sslUndefined: Self = StObject.set(x, "insecure_ssl", js.undefined)
    
    inline def setSecret(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-secret'] */ js.Any
    ): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-url'] */ js.Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
