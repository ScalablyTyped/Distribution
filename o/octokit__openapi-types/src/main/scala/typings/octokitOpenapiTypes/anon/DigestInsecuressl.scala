package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigestInsecuressl extends StObject {
  
  var content_type: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-content-type'] */ js.Any
  ] = js.undefined
  
  /** @example "sha256" */
  var digest: js.UndefOr[String] = js.undefined
  
  var insecure_ssl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-insecure-ssl'] */ js.Any
  ] = js.undefined
  
  var secret: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-secret'] */ js.Any
  ] = js.undefined
  
  /** @example "abc" */
  var token: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-url'] */ js.Any
  ] = js.undefined
}
object DigestInsecuressl {
  
  inline def apply(): DigestInsecuressl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigestInsecuressl]
  }
  
  extension [Self <: DigestInsecuressl](x: Self) {
    
    inline def setContent_type(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-content-type'] */ js.Any
    ): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setInsecure_ssl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-insecure-ssl'] */ js.Any
    ): Self = StObject.set(x, "insecure_ssl", value.asInstanceOf[js.Any])
    
    inline def setInsecure_sslUndefined: Self = StObject.set(x, "insecure_ssl", js.undefined)
    
    inline def setSecret(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-secret'] */ js.Any
    ): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['webhook-config-url'] */ js.Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
