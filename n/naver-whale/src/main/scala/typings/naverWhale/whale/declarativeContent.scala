package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait PageStateMatcher extends StObject
  
  @js.native
  trait PageStateMatcherProperties extends StObject {
    
    /** Optional. Matches if all of the CSS selectors in the array match displayed elements in a frame with the same origin as the page's main frame. All selectors in this array must be compound selectors to speed up matching. Note that listing hundreds of CSS selectors or CSS selectors that match hundreds of times per page can still slow down web sites.  */
    var css: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Optional.
      * Since Chrome 45. Warning: this is the current Beta channel. More information available on the API documentation pages.
      * Matches if the bookmarked state of the page is equal to the specified value. Requres the bookmarks permission.
      */
    var isBookmarked: js.UndefOr[Boolean] = js.native
    
    /** Optional. Filters URLs for various criteria. See event filtering. All criteria are case sensitive.  */
    var pageUrl: js.UndefOr[typings.chrome.chrome.declarativeContent.PageStateUrlDetails] = js.native
  }
  object PageStateMatcherProperties {
    
    @scala.inline
    def apply(): PageStateMatcherProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageStateMatcherProperties]
    }
    
    @scala.inline
    implicit class PageStateMatcherPropertiesMutableBuilder[Self <: PageStateMatcherProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value :_*))
      
      @scala.inline
      def setIsBookmarked(value: Boolean): Self = StObject.set(x, "isBookmarked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBookmarkedUndefined: Self = StObject.set(x, "isBookmarked", js.undefined)
      
      @scala.inline
      def setPageUrl(value: typings.chrome.chrome.declarativeContent.PageStateUrlDetails): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    }
  }
  
  @js.native
  trait PageStateUrlDetails extends StObject {
    
    /** Optional. Matches if the host name of the URL contains a specified string. To test whether a host name component has a prefix 'foo', use hostContains: '.foo'. This matches 'www.foobar.com' and 'foo.com', because an implicit dot is added at the beginning of the host name. Similarly, hostContains can be used to match against component suffix ('foo.') and to exactly match against components ('.foo.'). Suffix- and exact-matching for the last components need to be done separately using hostSuffix, because no implicit dot is added at the end of the host name.  */
    var hostContains: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the host name of the URL is equal to a specified string.  */
    var hostEquals: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the host name of the URL starts with a specified string.  */
    var hostPrefix: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the host name of the URL ends with a specified string.  */
    var hostSuffix: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the URL without query segment and fragment identifier matches a specified regular expression. Port numbers are stripped from the URL if they match the default port number. The regular expressions use the RE2 syntax.  */
    var originAndPathMatches: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the path segment of the URL contains a specified string.  */
    var pathContains: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the path segment of the URL is equal to a specified string.  */
    var pathEquals: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the path segment of the URL starts with a specified string.  */
    var pathPrefix: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the path segment of the URL ends with a specified string.  */
    var pathSuffix: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the port of the URL is contained in any of the specified port lists. For example [80, 443, [1000, 1200]] matches all requests on port 80, 443 and in the range 1000-1200.  */
    var ports: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
    
    /** Optional. Matches if the query segment of the URL contains a specified string.  */
    var queryContains: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the query segment of the URL is equal to a specified string.  */
    var queryEquals: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the query segment of the URL starts with a specified string.  */
    var queryPrefix: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the query segment of the URL ends with a specified string.  */
    var querySuffix: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the scheme of the URL is equal to any of the schemes specified in the array.  */
    var schemes: js.UndefOr[js.Array[String]] = js.native
    
    /** Optional. Matches if the URL (without fragment identifier) contains a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlContains: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the URL (without fragment identifier) is equal to a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlEquals: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the URL (without fragment identifier) matches a specified regular expression. Port numbers are stripped from the URL if they match the default port number. The regular expressions use the RE2 syntax.  */
    var urlMatches: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the URL (without fragment identifier) starts with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlPrefix: js.UndefOr[String] = js.native
    
    /** Optional. Matches if the URL (without fragment identifier) ends with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlSuffix: js.UndefOr[String] = js.native
  }
  object PageStateUrlDetails {
    
    @scala.inline
    def apply(): PageStateUrlDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageStateUrlDetails]
    }
    
    @scala.inline
    implicit class PageStateUrlDetailsMutableBuilder[Self <: PageStateUrlDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostContains(value: String): Self = StObject.set(x, "hostContains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostContainsUndefined: Self = StObject.set(x, "hostContains", js.undefined)
      
      @scala.inline
      def setHostEquals(value: String): Self = StObject.set(x, "hostEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostEqualsUndefined: Self = StObject.set(x, "hostEquals", js.undefined)
      
      @scala.inline
      def setHostPrefix(value: String): Self = StObject.set(x, "hostPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostPrefixUndefined: Self = StObject.set(x, "hostPrefix", js.undefined)
      
      @scala.inline
      def setHostSuffix(value: String): Self = StObject.set(x, "hostSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostSuffixUndefined: Self = StObject.set(x, "hostSuffix", js.undefined)
      
      @scala.inline
      def setOriginAndPathMatches(value: String): Self = StObject.set(x, "originAndPathMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginAndPathMatchesUndefined: Self = StObject.set(x, "originAndPathMatches", js.undefined)
      
      @scala.inline
      def setPathContains(value: String): Self = StObject.set(x, "pathContains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathContainsUndefined: Self = StObject.set(x, "pathContains", js.undefined)
      
      @scala.inline
      def setPathEquals(value: String): Self = StObject.set(x, "pathEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathEqualsUndefined: Self = StObject.set(x, "pathEquals", js.undefined)
      
      @scala.inline
      def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      @scala.inline
      def setPathSuffix(value: String): Self = StObject.set(x, "pathSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathSuffixUndefined: Self = StObject.set(x, "pathSuffix", js.undefined)
      
      @scala.inline
      def setPorts(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      @scala.inline
      def setPortsVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, "ports", js.Array(value :_*))
      
      @scala.inline
      def setQueryContains(value: String): Self = StObject.set(x, "queryContains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryContainsUndefined: Self = StObject.set(x, "queryContains", js.undefined)
      
      @scala.inline
      def setQueryEquals(value: String): Self = StObject.set(x, "queryEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryEqualsUndefined: Self = StObject.set(x, "queryEquals", js.undefined)
      
      @scala.inline
      def setQueryPrefix(value: String): Self = StObject.set(x, "queryPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryPrefixUndefined: Self = StObject.set(x, "queryPrefix", js.undefined)
      
      @scala.inline
      def setQuerySuffix(value: String): Self = StObject.set(x, "querySuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerySuffixUndefined: Self = StObject.set(x, "querySuffix", js.undefined)
      
      @scala.inline
      def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      @scala.inline
      def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value :_*))
      
      @scala.inline
      def setUrlContains(value: String): Self = StObject.set(x, "urlContains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlContainsUndefined: Self = StObject.set(x, "urlContains", js.undefined)
      
      @scala.inline
      def setUrlEquals(value: String): Self = StObject.set(x, "urlEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlEqualsUndefined: Self = StObject.set(x, "urlEquals", js.undefined)
      
      @scala.inline
      def setUrlMatches(value: String): Self = StObject.set(x, "urlMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlMatchesUndefined: Self = StObject.set(x, "urlMatches", js.undefined)
      
      @scala.inline
      def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
      
      @scala.inline
      def setUrlSuffix(value: String): Self = StObject.set(x, "urlSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlSuffixUndefined: Self = StObject.set(x, "urlSuffix", js.undefined)
    }
  }
  
  @js.native
  trait SetIcon extends StObject
  
  @js.native
  trait ShowPageAction extends StObject
}
