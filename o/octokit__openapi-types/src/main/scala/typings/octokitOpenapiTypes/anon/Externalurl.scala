package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Externalurl extends StObject {
  
  /** @example "Iv1.25b5d1e65ffc4022" */
  var client_id: js.UndefOr[String] = js.undefined
  
  /** @example "1d4b2097ac622ba702d19de498f005747a8b21d3" */
  var client_secret: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @example 2017-07-08T16:18:44-04:00
    */
  var created_at: String
  
  /** @example The description of the app. */
  var description: String | Null
  
  /**
    * @description The list of events for the GitHub app
    * @example [
    *   "label",
    *   "deployment"
    * ]
    */
  var events: js.Array[String]
  
  /**
    * Format: uri
    * @example https://example.com
    */
  var external_url: String
  
  /**
    * Format: uri
    * @example https://github.com/apps/super-ci
    */
  var html_url: String
  
  /**
    * @description Unique identifier of the GitHub app
    * @example 37
    */
  var id: Double
  
  /**
    * @description The number of installations associated with the GitHub app
    * @example 5
    */
  var installations_count: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The name of the GitHub app
    * @example Probot Owners
    */
  var name: String
  
  /** @example MDExOkludGVncmF0aW9uMQ== */
  var node_id: String
  
  var owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  /** @example "-----BEGIN RSA PRIVATE KEY-----\nMIIEogIBAAKCAQEArYxrNYD/iT5CZVpRJu4rBKmmze3PVmT/gCo2ATUvDvZTPTey\nxcGJ3vvrJXazKk06pN05TN29o98jrYz4cengG3YGsXPNEpKsIrEl8NhbnxapEnM9\nJCMRe0P5JcPsfZlX6hmiT7136GRWiGOUba2X9+HKh8QJVLG5rM007TBER9/z9mWm\nrJuNh+m5l320oBQY/Qq3A7wzdEfZw8qm/mIN0FCeoXH1L6B8xXWaAYBwhTEh6SSn\nZHlO1Xu1JWDmAvBCi0RO5aRSKM8q9QEkvvHP4yweAtK3N8+aAbZ7ovaDhyGz8r6r\nzhU1b8Uo0Z2ysf503WqzQgIajr7Fry7/kUwpgQIDAQABAoIBADwJp80Ko1xHPZDy\nfcCKBDfIuPvkmSW6KumbsLMaQv1aGdHDwwTGv3t0ixSay8CGlxMRtRDyZPib6SvQ\n6OH/lpfpbMdW2ErkksgtoIKBVrDilfrcAvrNZu7NxRNbhCSvN8q0s4ICecjbbVQh\nnueSdlA6vGXbW58BHMq68uRbHkP+k+mM9U0mDJ1HMch67wlg5GbayVRt63H7R2+r\nVxcna7B80J/lCEjIYZznawgiTvp3MSanTglqAYi+m1EcSsP14bJIB9vgaxS79kTu\noiSo93leJbBvuGo8QEiUqTwMw4tDksmkLsoqNKQ1q9P7LZ9DGcujtPy4EZsamSJT\ny8OJt0ECgYEA2lxOxJsQk2kI325JgKFjo92mQeUObIvPfSNWUIZQDTjniOI6Gv63\nGLWVFrZcvQBWjMEQraJA9xjPbblV8PtfO87MiJGLWCHFxmPz2dzoedN+2Coxom8m\nV95CLz8QUShuao6u/RYcvUaZEoYs5bHcTmy5sBK80JyEmafJPtCQVxMCgYEAy3ar\nZr3yv4xRPEPMat4rseswmuMooSaK3SKub19WFI5IAtB/e7qR1Rj9JhOGcZz+OQrl\nT78O2OFYlgOIkJPvRMrPpK5V9lslc7tz1FSh3BZMRGq5jSyD7ETSOQ0c8T2O/s7v\nbeEPbVbDe4mwvM24XByH0GnWveVxaDl51ABD65sCgYB3ZAspUkOA5egVCh8kNpnd\nSd6SnuQBE3ySRlT2WEnCwP9Ph6oPgn+oAfiPX4xbRqkL8q/k0BdHQ4h+zNwhk7+h\nWtPYRAP1Xxnc/F+jGjb+DVaIaKGU18MWPg7f+FI6nampl3Q0KvfxwX0GdNhtio8T\nTj1E+SnFwh56SRQuxSh2gwKBgHKjlIO5NtNSflsUYFM+hyQiPiqnHzddfhSG+/3o\nm5nNaSmczJesUYreH5San7/YEy2UxAugvP7aSY2MxB+iGsiJ9WD2kZzTUlDZJ7RV\nUzWsoqBR+eZfVJ2FUWWvy8TpSG6trh4dFxImNtKejCR1TREpSiTV3Zb1dmahK9GV\nrK9NAoGAbBxRLoC01xfxCTgt5BDiBcFVh4fp5yYKwavJPLzHSpuDOrrI9jDn1oKN\nonq5sDU1i391zfQvdrbX4Ova48BN+B7p63FocP/MK5tyyBoT8zQEk2+vWDOw7H/Z\nu5dTCPxTIsoIwUw1I+7yIxqJzLPFgR2gVBwY1ra/8iAqCj+zeBw=\n-----END RSA PRIVATE KEY-----\n" */
  var pem: js.UndefOr[String] = js.undefined
  
  /**
    * @description The set of permissions for the GitHub app
    * @example {
    *   "issues": "read",
    *   "deployments": "write"
    * }
    */
  var permissions: Contents
  
  /**
    * @description The slug name of the GitHub app
    * @example probot-owners
    */
  var slug: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @example 2017-07-08T16:18:44-04:00
    */
  var updated_at: String
  
  /** @example "6fba8f2fc8a7e8f2cca5577eddd82ca7586b3b6b" */
  var webhook_secret: js.UndefOr[String | Null] = js.undefined
}
object Externalurl {
  
  inline def apply(
    created_at: String,
    events: js.Array[String],
    external_url: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    permissions: Contents,
    updated_at: String
  ): Externalurl = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[Externalurl]
  }
  
  extension [Self <: Externalurl](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstallations_count(value: Double): Self = StObject.set(x, "installations_count", value.asInstanceOf[js.Any])
    
    inline def setInstallations_countUndefined: Self = StObject.set(x, "installations_count", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    
    inline def setPemUndefined: Self = StObject.set(x, "pem", js.undefined)
    
    inline def setPermissions(value: Contents): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setWebhook_secret(value: String): Self = StObject.set(x, "webhook_secret", value.asInstanceOf[js.Any])
    
    inline def setWebhook_secretNull: Self = StObject.set(x, "webhook_secret", null)
    
    inline def setWebhook_secretUndefined: Self = StObject.set(x, "webhook_secret", js.undefined)
  }
}
