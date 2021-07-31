package typings.maximMazurokGapiClientSiteverification

import typings.maximMazurokGapiClientSiteverification.gapi.client.siteverification.SiteVerificationWebResourceGettokenRequest
import typings.maximMazurokGapiClientSiteverification.gapi.client.siteverification.SiteVerificationWebResourceResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alt extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** The id of a verified site or domain. */
    var id: String
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
  }
  object Alt {
    
    @scala.inline
    def apply(id: String): Alt = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    @scala.inline
    implicit class AltMutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Request body */
    var resource: SiteVerificationWebResourceGettokenRequest
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    @scala.inline
    def apply(resource: SiteVerificationWebResourceGettokenRequest): Fields = {
      val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setResource(value: SiteVerificationWebResourceGettokenRequest): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** The id of a verified site or domain. */
    var id: String
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Request body */
    var resource: SiteVerificationWebResourceResource
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
  }
  object Id {
    
    @scala.inline
    def apply(id: String, resource: SiteVerificationWebResourceResource): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setResource(value: SiteVerificationWebResourceResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    }
  }
  
  trait Identifier extends StObject {
    
    /** The site identifier. If the type is set to SITE, the identifier is a URL. If the type is set to INET_DOMAIN, the site identifier is a domain name. */
    var identifier: js.UndefOr[String] = js.undefined
    
    /** The site type. Can be SITE or INET_DOMAIN (domain name). */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Identifier {
    
    @scala.inline
    def apply(): Identifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Identifier]
    }
    
    @scala.inline
    implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
  }
  object Key {
    
    @scala.inline
    def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    }
  }
  
  trait Oauthtoken extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Request body */
    var resource: SiteVerificationWebResourceResource
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
    
    /** The method to use for verifying a site or domain. */
    var verificationMethod: String
  }
  object Oauthtoken {
    
    @scala.inline
    def apply(resource: SiteVerificationWebResourceResource, verificationMethod: String): Oauthtoken = {
      val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], verificationMethod = verificationMethod.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oauthtoken]
    }
    
    @scala.inline
    implicit class OauthtokenMutableBuilder[Self <: Oauthtoken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setResource(value: SiteVerificationWebResourceResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      
      @scala.inline
      def setVerificationMethod(value: String): Self = StObject.set(x, "verificationMethod", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrettyPrint extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
    
    /** The method to use for verifying a site or domain. */
    var verificationMethod: String
  }
  object PrettyPrint {
    
    @scala.inline
    def apply(verificationMethod: String): PrettyPrint = {
      val __obj = js.Dynamic.literal(verificationMethod = verificationMethod.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrettyPrint]
    }
    
    @scala.inline
    implicit class PrettyPrintMutableBuilder[Self <: PrettyPrint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      
      @scala.inline
      def setVerificationMethod(value: String): Self = StObject.set(x, "verificationMethod", value.asInstanceOf[js.Any])
    }
  }
}
