package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pushprotectionbypassedby extends StObject {
  
  var created_at: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-created-at'] */ js.Any
  ] = js.undefined
  
  var html_url: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-html-url'] */ js.Any
  ] = js.undefined
  
  /**
    * Format: uri
    * @description The REST API URL of the code locations for this alert.
    */
  var locations_url: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any
  ] = js.undefined
  
  /** @description Whether push protection was bypassed for the detected secret. */
  var push_protection_bypassed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Format: date-time
    * @description The time that push protection was bypassed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var push_protection_bypassed_at: js.UndefOr[String | Null] = js.undefined
  
  var push_protection_bypassed_by: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  ] = js.undefined
  
  var resolution: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-resolution'] */ js.Any
  ] = js.undefined
  
  /** @description The comment that was optionally added when this alert was closed */
  var resolution_comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format: date-time
    * @description The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var resolved_at: js.UndefOr[String | Null] = js.undefined
  
  var resolved_by: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  ] = js.undefined
  
  /** @description The secret that was detected. */
  var secret: js.UndefOr[String] = js.undefined
  
  /** @description The type of secret that secret scanning detected. */
  var secret_type: js.UndefOr[String] = js.undefined
  
  /**
    * @description User-friendly name for the detected secret, matching the `secret_type`.
    * For a list of built-in patterns, see "[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)."
    */
  var secret_type_display_name: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-state'] */ js.Any
  ] = js.undefined
  
  var updated_at: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-updated-at'] */ js.Any
  ] = js.undefined
  
  var url: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-url'] */ js.Any
  ] = js.undefined
}
object Pushprotectionbypassedby {
  
  inline def apply(): Pushprotectionbypassedby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pushprotectionbypassedby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pushprotectionbypassedby] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-created-at'] */ js.Any
    ): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setHtml_url(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-html-url'] */ js.Any
    ): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setLocations_url(value: String): Self = StObject.set(x, "locations_url", value.asInstanceOf[js.Any])
    
    inline def setLocations_urlUndefined: Self = StObject.set(x, "locations_url", js.undefined)
    
    inline def setNumber(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any
    ): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPush_protection_bypassed(value: Boolean): Self = StObject.set(x, "push_protection_bypassed", value.asInstanceOf[js.Any])
    
    inline def setPush_protection_bypassedNull: Self = StObject.set(x, "push_protection_bypassed", null)
    
    inline def setPush_protection_bypassedUndefined: Self = StObject.set(x, "push_protection_bypassed", js.undefined)
    
    inline def setPush_protection_bypassed_at(value: String): Self = StObject.set(x, "push_protection_bypassed_at", value.asInstanceOf[js.Any])
    
    inline def setPush_protection_bypassed_atNull: Self = StObject.set(x, "push_protection_bypassed_at", null)
    
    inline def setPush_protection_bypassed_atUndefined: Self = StObject.set(x, "push_protection_bypassed_at", js.undefined)
    
    inline def setPush_protection_bypassed_by(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "push_protection_bypassed_by", value.asInstanceOf[js.Any])
    
    inline def setPush_protection_bypassed_byUndefined: Self = StObject.set(x, "push_protection_bypassed_by", js.undefined)
    
    inline def setResolution(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-resolution'] */ js.Any
    ): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setResolution_comment(value: String): Self = StObject.set(x, "resolution_comment", value.asInstanceOf[js.Any])
    
    inline def setResolution_commentNull: Self = StObject.set(x, "resolution_comment", null)
    
    inline def setResolution_commentUndefined: Self = StObject.set(x, "resolution_comment", js.undefined)
    
    inline def setResolved_at(value: String): Self = StObject.set(x, "resolved_at", value.asInstanceOf[js.Any])
    
    inline def setResolved_atNull: Self = StObject.set(x, "resolved_at", null)
    
    inline def setResolved_atUndefined: Self = StObject.set(x, "resolved_at", js.undefined)
    
    inline def setResolved_by(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "resolved_by", value.asInstanceOf[js.Any])
    
    inline def setResolved_byUndefined: Self = StObject.set(x, "resolved_by", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setSecret_type(value: String): Self = StObject.set(x, "secret_type", value.asInstanceOf[js.Any])
    
    inline def setSecret_typeUndefined: Self = StObject.set(x, "secret_type", js.undefined)
    
    inline def setSecret_type_display_name(value: String): Self = StObject.set(x, "secret_type_display_name", value.asInstanceOf[js.Any])
    
    inline def setSecret_type_display_nameUndefined: Self = StObject.set(x, "secret_type_display_name", js.undefined)
    
    inline def setState(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-state'] */ js.Any
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdated_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-updated-at'] */ js.Any
    ): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-url'] */ js.Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
