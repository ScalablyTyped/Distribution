package typings.maximMazurokGapiClientDomainsrdap

import org.scalablytyped.runtime.TopLevel
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDomainsrdap.anon.Accesstoken
import typings.maximMazurokGapiClientDomainsrdap.anon.Alt
import typings.maximMazurokGapiClientDomainsrdap.anon.Callback
import typings.maximMazurokGapiClientDomainsrdap.anon.Fields
import typings.maximMazurokGapiClientDomainsrdap.anon.Key
import typings.maximMazurokGapiClientDomainsrdap.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object domainsrdap {
      
      @js.native
      trait AutnumResource extends StObject {
        
        /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
        def get(): Request[RdapResponse] = js.native
        def get(request: Accesstoken): Request[RdapResponse] = js.native
      }
      
      @js.native
      trait DomainResource extends StObject {
        
        /** Look up RDAP information for a domain by name. */
        def get(): Request[HttpBody] = js.native
        def get(request: Alt): Request[HttpBody] = js.native
      }
      
      @js.native
      trait EntityResource extends StObject {
        
        /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
        def get(): Request[RdapResponse] = js.native
        def get(request: Callback): Request[RdapResponse] = js.native
      }
      
      @js.native
      trait HttpBody extends StObject {
        
        /** The HTTP Content-Type header value specifying the content type of the body. */
        var contentType: js.UndefOr[String] = js.native
        
        /** The HTTP request/response body as raw binary. */
        var data: js.UndefOr[String] = js.native
        
        /** Application specific response metadata. Must be set in the first response for streaming APIs. */
        var extensions: js.UndefOr[
                js.Array[
                  /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.HttpBody with TopLevel[js.Any]
                ]
              ] = js.native
      }
      object HttpBody {
        
        @scala.inline
        def apply(): HttpBody = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[HttpBody]
        }
        
        @scala.inline
        implicit class HttpBodyMutableBuilder[Self <: HttpBody] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
          
          @scala.inline
          def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
          
          @scala.inline
          def setExtensions(
            value: js.Array[
                      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.HttpBody with TopLevel[js.Any]
                    ]
          ): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
          
          @scala.inline
          def setExtensionsVarargs(
            value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.HttpBody with TopLevel[js.Any])*
          ): Self = StObject.set(x, "extensions", js.Array(value :_*))
        }
      }
      
      @js.native
      trait IpResource extends StObject {
        
        /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
        def get(): Request[RdapResponse] = js.native
        def get(request: Fields): Request[RdapResponse] = js.native
      }
      
      @js.native
      trait Link extends StObject {
        
        /** Target URL of a link. Example: "http://example.com/previous". */
        var href: js.UndefOr[String] = js.native
        
        /** Language code of a link. Example: "en". */
        var hreflang: js.UndefOr[String] = js.native
        
        /** Media type of the link destination. Example: "screen". */
        var media: js.UndefOr[String] = js.native
        
        /** Relation type of a link. Example: "previous". */
        var rel: js.UndefOr[String] = js.native
        
        /** Title of this link. Example: "title". */
        var title: js.UndefOr[String] = js.native
        
        /** Content type of the link. Example: "application/json". */
        var `type`: js.UndefOr[String] = js.native
        
        /** URL giving context for the link. Example: "http://example.com/current". */
        var value: js.UndefOr[String] = js.native
      }
      object Link {
        
        @scala.inline
        def apply(): Link = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Link]
        }
        
        @scala.inline
        implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
          
          @scala.inline
          def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
          
          @scala.inline
          def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
          
          @scala.inline
          def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
          
          @scala.inline
          def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
      
      @js.native
      trait NameserverResource extends StObject {
        
        /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
        def get(): Request[RdapResponse] = js.native
        def get(request: Key): Request[RdapResponse] = js.native
      }
      
      @js.native
      trait Notice extends StObject {
        
        /** Description of the notice. */
        var description: js.UndefOr[js.Array[String]] = js.native
        
        /** Link to a document containing more information. */
        var links: js.UndefOr[js.Array[Link]] = js.native
        
        /** Title of a notice. Example: "Terms of Service". */
        var title: js.UndefOr[String] = js.native
        
        /**
          * Type values defined in [section 10.2.1 of RFC 7483](https://tools.ietf.org/html/rfc7483#section-10.2.1) specific to a whole response: "result set truncated due to authorization",
          * "result set truncated due to excessive load", "result set truncated due to unexplainable reasons".
          */
        var `type`: js.UndefOr[String] = js.native
      }
      object Notice {
        
        @scala.inline
        def apply(): Notice = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Notice]
        }
        
        @scala.inline
        implicit class NoticeMutableBuilder[Self <: Notice] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          @scala.inline
          def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value :_*))
          
          @scala.inline
          def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
          
          @scala.inline
          def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      @js.native
      trait RdapResponse extends StObject {
        
        /** Error description. */
        var description: js.UndefOr[js.Array[String]] = js.native
        
        /** Error HTTP code. Example: "501". */
        var errorCode: js.UndefOr[Double] = js.native
        
        /** HTTP response with content type set to "application/json+rdap". */
        var jsonResponse: js.UndefOr[HttpBody] = js.native
        
        /** Error language code. Error response info fields are defined in [section 6 of RFC 7483](https://tools.ietf.org/html/rfc7483#section-6). */
        var lang: js.UndefOr[String] = js.native
        
        /** Notices applying to this response. */
        var notices: js.UndefOr[js.Array[Notice]] = js.native
        
        /** RDAP conformance level. */
        var rdapConformance: js.UndefOr[js.Array[String]] = js.native
        
        /** Error title. */
        var title: js.UndefOr[String] = js.native
      }
      object RdapResponse {
        
        @scala.inline
        def apply(): RdapResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[RdapResponse]
        }
        
        @scala.inline
        implicit class RdapResponseMutableBuilder[Self <: RdapResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          @scala.inline
          def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value :_*))
          
          @scala.inline
          def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
          
          @scala.inline
          def setJsonResponse(value: HttpBody): Self = StObject.set(x, "jsonResponse", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setJsonResponseUndefined: Self = StObject.set(x, "jsonResponse", js.undefined)
          
          @scala.inline
          def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
          
          @scala.inline
          def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
          
          @scala.inline
          def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value :_*))
          
          @scala.inline
          def setRdapConformance(value: js.Array[String]): Self = StObject.set(x, "rdapConformance", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRdapConformanceUndefined: Self = StObject.set(x, "rdapConformance", js.undefined)
          
          @scala.inline
          def setRdapConformanceVarargs(value: String*): Self = StObject.set(x, "rdapConformance", js.Array(value :_*))
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
      
      @js.native
      trait V1Resource extends StObject {
        
        /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
        def getDomains(): Request[RdapResponse] = js.native
        def getDomains(request: Oauthtoken): Request[RdapResponse] = js.native
        
        /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
        def getEntities(): Request[RdapResponse] = js.native
        def getEntities(request: Oauthtoken): Request[RdapResponse] = js.native
        
        /** Get help information for the RDAP API, including links to documentation. */
        def getHelp(): Request[HttpBody] = js.native
        def getHelp(request: Oauthtoken): Request[HttpBody] = js.native
        
        /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
        def getIp(): Request[HttpBody] = js.native
        def getIp(request: Oauthtoken): Request[HttpBody] = js.native
        
        /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
        def getNameservers(): Request[RdapResponse] = js.native
        def getNameservers(request: Oauthtoken): Request[RdapResponse] = js.native
      }
    }
  }
}
