package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Declarative Content
////////////////////
/**
  * Use the chrome.declarativeContent API to take actions depending on the content of a page, without requiring permission to read the page's content.
  * Availability: Since Chrome 33.
  * Permissions:  "declarativeContent"
  */
object declarativeContent {
  
  type PageChangedEvent = Event[js.Function0[Unit]]
  
  trait PageStateMatcher extends StObject
  
  trait PageStateMatcherProperties extends StObject {
    
    /** Optional. Matches if all of the CSS selectors in the array match displayed elements in a frame with the same origin as the page's main frame. All selectors in this array must be compound selectors to speed up matching. Note that listing hundreds of CSS selectors or CSS selectors that match hundreds of times per page can still slow down web sites.  */
    var css: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 45. Warning: this is the current Beta channel. More information available on the API documentation pages.
      * Matches if the bookmarked state of the page is equal to the specified value. Requres the bookmarks permission.
      */
    var isBookmarked: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Filters URLs for various criteria. See event filtering. All criteria are case sensitive.  */
    var pageUrl: js.UndefOr[typings.chrome.chrome.declarativeContent.PageStateUrlDetails] = js.undefined
  }
  object PageStateMatcherProperties {
    
    inline def apply(): PageStateMatcherProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageStateMatcherProperties]
    }
    
    extension [Self <: PageStateMatcherProperties](x: Self) {
      
      inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setIsBookmarked(value: Boolean): Self = StObject.set(x, "isBookmarked", value.asInstanceOf[js.Any])
      
      inline def setIsBookmarkedUndefined: Self = StObject.set(x, "isBookmarked", js.undefined)
      
      inline def setPageUrl(value: typings.chrome.chrome.declarativeContent.PageStateUrlDetails): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    }
  }
  
  trait PageStateUrlDetails extends StObject {
    
    /** Optional. Matches if the host name of the URL contains a specified string. To test whether a host name component has a prefix 'foo', use hostContains: '.foo'. This matches 'www.foobar.com' and 'foo.com', because an implicit dot is added at the beginning of the host name. Similarly, hostContains can be used to match against component suffix ('foo.') and to exactly match against components ('.foo.'). Suffix- and exact-matching for the last components need to be done separately using hostSuffix, because no implicit dot is added at the end of the host name.  */
    var hostContains: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the host name of the URL is equal to a specified string.  */
    var hostEquals: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the host name of the URL starts with a specified string.  */
    var hostPrefix: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the host name of the URL ends with a specified string.  */
    var hostSuffix: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the URL without query segment and fragment identifier matches a specified regular expression. Port numbers are stripped from the URL if they match the default port number. The regular expressions use the RE2 syntax.  */
    var originAndPathMatches: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the path segment of the URL contains a specified string.  */
    var pathContains: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the path segment of the URL is equal to a specified string.  */
    var pathEquals: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the path segment of the URL starts with a specified string.  */
    var pathPrefix: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the path segment of the URL ends with a specified string.  */
    var pathSuffix: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the port of the URL is contained in any of the specified port lists. For example [80, 443, [1000, 1200]] matches all requests on port 80, 443 and in the range 1000-1200.  */
    var ports: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
    
    /** Optional. Matches if the query segment of the URL contains a specified string.  */
    var queryContains: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the query segment of the URL is equal to a specified string.  */
    var queryEquals: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the query segment of the URL starts with a specified string.  */
    var queryPrefix: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the query segment of the URL ends with a specified string.  */
    var querySuffix: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the scheme of the URL is equal to any of the schemes specified in the array.  */
    var schemes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional. Matches if the URL (without fragment identifier) contains a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlContains: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the URL (without fragment identifier) is equal to a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlEquals: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the URL (without fragment identifier) matches a specified regular expression. Port numbers are stripped from the URL if they match the default port number. The regular expressions use the RE2 syntax.  */
    var urlMatches: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the URL (without fragment identifier) starts with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlPrefix: js.UndefOr[String] = js.undefined
    
    /** Optional. Matches if the URL (without fragment identifier) ends with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlSuffix: js.UndefOr[String] = js.undefined
  }
  object PageStateUrlDetails {
    
    inline def apply(): PageStateUrlDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageStateUrlDetails]
    }
    
    extension [Self <: PageStateUrlDetails](x: Self) {
      
      inline def setHostContains(value: String): Self = StObject.set(x, "hostContains", value.asInstanceOf[js.Any])
      
      inline def setHostContainsUndefined: Self = StObject.set(x, "hostContains", js.undefined)
      
      inline def setHostEquals(value: String): Self = StObject.set(x, "hostEquals", value.asInstanceOf[js.Any])
      
      inline def setHostEqualsUndefined: Self = StObject.set(x, "hostEquals", js.undefined)
      
      inline def setHostPrefix(value: String): Self = StObject.set(x, "hostPrefix", value.asInstanceOf[js.Any])
      
      inline def setHostPrefixUndefined: Self = StObject.set(x, "hostPrefix", js.undefined)
      
      inline def setHostSuffix(value: String): Self = StObject.set(x, "hostSuffix", value.asInstanceOf[js.Any])
      
      inline def setHostSuffixUndefined: Self = StObject.set(x, "hostSuffix", js.undefined)
      
      inline def setOriginAndPathMatches(value: String): Self = StObject.set(x, "originAndPathMatches", value.asInstanceOf[js.Any])
      
      inline def setOriginAndPathMatchesUndefined: Self = StObject.set(x, "originAndPathMatches", js.undefined)
      
      inline def setPathContains(value: String): Self = StObject.set(x, "pathContains", value.asInstanceOf[js.Any])
      
      inline def setPathContainsUndefined: Self = StObject.set(x, "pathContains", js.undefined)
      
      inline def setPathEquals(value: String): Self = StObject.set(x, "pathEquals", value.asInstanceOf[js.Any])
      
      inline def setPathEqualsUndefined: Self = StObject.set(x, "pathEquals", js.undefined)
      
      inline def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      inline def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      inline def setPathSuffix(value: String): Self = StObject.set(x, "pathSuffix", value.asInstanceOf[js.Any])
      
      inline def setPathSuffixUndefined: Self = StObject.set(x, "pathSuffix", js.undefined)
      
      inline def setPorts(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      inline def setPortsVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, "ports", js.Array(value*))
      
      inline def setQueryContains(value: String): Self = StObject.set(x, "queryContains", value.asInstanceOf[js.Any])
      
      inline def setQueryContainsUndefined: Self = StObject.set(x, "queryContains", js.undefined)
      
      inline def setQueryEquals(value: String): Self = StObject.set(x, "queryEquals", value.asInstanceOf[js.Any])
      
      inline def setQueryEqualsUndefined: Self = StObject.set(x, "queryEquals", js.undefined)
      
      inline def setQueryPrefix(value: String): Self = StObject.set(x, "queryPrefix", value.asInstanceOf[js.Any])
      
      inline def setQueryPrefixUndefined: Self = StObject.set(x, "queryPrefix", js.undefined)
      
      inline def setQuerySuffix(value: String): Self = StObject.set(x, "querySuffix", value.asInstanceOf[js.Any])
      
      inline def setQuerySuffixUndefined: Self = StObject.set(x, "querySuffix", js.undefined)
      
      inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
      
      inline def setUrlContains(value: String): Self = StObject.set(x, "urlContains", value.asInstanceOf[js.Any])
      
      inline def setUrlContainsUndefined: Self = StObject.set(x, "urlContains", js.undefined)
      
      inline def setUrlEquals(value: String): Self = StObject.set(x, "urlEquals", value.asInstanceOf[js.Any])
      
      inline def setUrlEqualsUndefined: Self = StObject.set(x, "urlEquals", js.undefined)
      
      inline def setUrlMatches(value: String): Self = StObject.set(x, "urlMatches", value.asInstanceOf[js.Any])
      
      inline def setUrlMatchesUndefined: Self = StObject.set(x, "urlMatches", js.undefined)
      
      inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
      
      inline def setUrlSuffix(value: String): Self = StObject.set(x, "urlSuffix", value.asInstanceOf[js.Any])
      
      inline def setUrlSuffixUndefined: Self = StObject.set(x, "urlSuffix", js.undefined)
    }
  }
  
  trait SetIcon extends StObject
  
  trait ShowAction extends StObject
  
  trait ShowPageAction extends StObject
}
