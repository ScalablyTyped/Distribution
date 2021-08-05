package typings.maximMazurokGapiClientLicensing

import typings.maximMazurokGapiClientLicensing.gapi.client.licensing.LicenseAssignment
import typings.maximMazurokGapiClientLicensing.gapi.client.licensing.LicenseAssignmentInsert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accesstoken extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** A product's unique identifier. For more information about products in this version of the API, see Products and SKUs. */
    var productId: String
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs. */
    var skuId: String
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
    
    /**
      * The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use
      * a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
      */
    var userId: String
  }
  object Accesstoken {
    
    inline def apply(productId: String, skuId: String, userId: String): Accesstoken = {
      val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], skuId = skuId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accesstoken]
    }
    
    extension [Self <: Accesstoken](x: Self) {
      
      inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Alt extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** A product's unique identifier. For more information about products in this version of the API, see Products and SKUs. */
    var productId: String
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Request body */
    var resource: LicenseAssignmentInsert
    
    /** A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs. */
    var skuId: String
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Alt {
    
    inline def apply(productId: String, resource: LicenseAssignmentInsert, skuId: String): Alt = {
      val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], skuId = skuId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    extension [Self <: Alt](x: Self) {
      
      inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setResource(value: LicenseAssignmentInsert): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait Callback extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** A product's unique identifier. For more information about products in this version of the API, see Products and SKUs. */
    var productId: String
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs. */
    var skuId: String
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Callback {
    
    inline def apply(productId: String, skuId: String): Callback = {
      val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], skuId = skuId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait CustomerId extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Customer's `customerId`. A previous version of this API accepted the primary domain name as a value for this field. If the customer is suspended, the server returns an error. */
    var customerId: String
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** The `maxResults` query string determines how many entries are returned on each page of a large response. This is an optional parameter. The value must be a positive number. */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /**
      * Token to fetch the next page of data. The `maxResults` query string is related to the `pageToken` since `maxResults` determines how many entries are returned on each page. This
      * is an optional query string. If not specified, the server returns the first page.
      */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** A product's unique identifier. For more information about products in this version of the API, see Products and SKUs. */
    var productId: String
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object CustomerId {
    
    inline def apply(customerId: String, productId: String): CustomerId = {
      val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerId]
    }
    
    extension [Self <: CustomerId](x: Self) {
      
      inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Customer's `customerId`. A previous version of this API accepted the primary domain name as a value for this field. If the customer is suspended, the server returns an error. */
    var customerId: String
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** The `maxResults` query string determines how many entries are returned on each page of a large response. This is an optional parameter. The value must be a positive number. */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /**
      * Token to fetch the next page of data. The `maxResults` query string is related to the `pageToken` since `maxResults` determines how many entries are returned on each page. This
      * is an optional query string. If not specified, the server returns the first page.
      */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** A product's unique identifier. For more information about products in this version of the API, see Products and SKUs. */
    var productId: String
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs. */
    var skuId: String
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply(customerId: String, productId: String, skuId: String): Fields = {
      val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], skuId = skuId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** A product's unique identifier. For more information about products in this version of the API, see Products and SKUs. */
    var productId: String
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Request body */
    var resource: LicenseAssignment
    
    /** A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs. */
    var skuId: String
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
    
    /**
      * The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use
      * a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
      */
    var userId: String
  }
  object Key {
    
    inline def apply(productId: String, resource: LicenseAssignment, skuId: String, userId: String): Key = {
      val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], skuId = skuId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setResource(value: LicenseAssignment): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
