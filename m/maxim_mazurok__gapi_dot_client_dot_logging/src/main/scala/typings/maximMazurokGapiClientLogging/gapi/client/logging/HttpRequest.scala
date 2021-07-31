package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRequest extends StObject {
  
  /** The number of HTTP response bytes inserted into cache. Set only when a cache fill was attempted. */
  var cacheFillBytes: js.UndefOr[String] = js.undefined
  
  /** Whether or not an entity was served from cache (with or without validation). */
  var cacheHit: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not a cache lookup was attempted. */
  var cacheLookup: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not the response was validated with the origin server before being served from cache. This field is only meaningful if cache_hit is True. */
  var cacheValidatedWithOriginServer: js.UndefOr[Boolean] = js.undefined
  
  /** The request processing latency on the server, from the time the request was received until the response was sent. */
  var latency: js.UndefOr[String] = js.undefined
  
  /** Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket" */
  var protocol: js.UndefOr[String] = js.undefined
  
  /** The referer URL of the request, as defined in HTTP/1.1 Header Field Definitions (http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). */
  var referer: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address (IPv4 or IPv6) of the client that issued the HTTP request. This field can include port information. Examples: "192.168.1.1", "10.0.0.1:80",
    * "FE80::0202:B3FF:FE1E:8329".
    */
  var remoteIp: js.UndefOr[String] = js.undefined
  
  /** The request method. Examples: "GET", "HEAD", "PUT", "POST". */
  var requestMethod: js.UndefOr[String] = js.undefined
  
  /** The size of the HTTP request message in bytes, including the request headers and the request body. */
  var requestSize: js.UndefOr[String] = js.undefined
  
  /** The scheme (http, https), the host name, the path and the query portion of the URL that was requested. Example: "http://example.com/some/info?color=red". */
  var requestUrl: js.UndefOr[String] = js.undefined
  
  /** The size of the HTTP response message sent back to the client, in bytes, including the response headers and the response body. */
  var responseSize: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address (IPv4 or IPv6) of the origin server that the request was sent to. This field can include port information. Examples: "192.168.1.1", "10.0.0.1:80",
    * "FE80::0202:B3FF:FE1E:8329".
    */
  var serverIp: js.UndefOr[String] = js.undefined
  
  /** The response code indicating the status of response. Examples: 200, 404. */
  var status: js.UndefOr[Double] = js.undefined
  
  /** The user agent sent by the client. Example: "Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Q312461; .NET CLR 1.0.3705)". */
  var userAgent: js.UndefOr[String] = js.undefined
}
object HttpRequest {
  
  @scala.inline
  def apply(): HttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequest]
  }
  
  @scala.inline
  implicit class HttpRequestMutableBuilder[Self <: HttpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheFillBytes(value: String): Self = StObject.set(x, "cacheFillBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheFillBytesUndefined: Self = StObject.set(x, "cacheFillBytes", js.undefined)
    
    @scala.inline
    def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
    
    @scala.inline
    def setCacheLookup(value: Boolean): Self = StObject.set(x, "cacheLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheLookupUndefined: Self = StObject.set(x, "cacheLookup", js.undefined)
    
    @scala.inline
    def setCacheValidatedWithOriginServer(value: Boolean): Self = StObject.set(x, "cacheValidatedWithOriginServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheValidatedWithOriginServerUndefined: Self = StObject.set(x, "cacheValidatedWithOriginServer", js.undefined)
    
    @scala.inline
    def setLatency(value: String): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    @scala.inline
    def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpUndefined: Self = StObject.set(x, "remoteIp", js.undefined)
    
    @scala.inline
    def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
    
    @scala.inline
    def setRequestSize(value: String): Self = StObject.set(x, "requestSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestSizeUndefined: Self = StObject.set(x, "requestSize", js.undefined)
    
    @scala.inline
    def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUrlUndefined: Self = StObject.set(x, "requestUrl", js.undefined)
    
    @scala.inline
    def setResponseSize(value: String): Self = StObject.set(x, "responseSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseSizeUndefined: Self = StObject.set(x, "responseSize", js.undefined)
    
    @scala.inline
    def setServerIp(value: String): Self = StObject.set(x, "serverIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerIpUndefined: Self = StObject.set(x, "serverIp", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
