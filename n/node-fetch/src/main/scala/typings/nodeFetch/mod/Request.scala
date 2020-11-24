package typings.nodeFetch.mod

import typings.node.httpMod.Agent
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-fetch", "Request")
@js.native
class Request protected ()
  extends Body
     with _RequestInfo {
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
  
  // node-fetch extensions to the whatwg/fetch spec
  var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.native
  
  var compress: Boolean = js.native
  
  var context: RequestContext = js.native
  
  var counter: Double = js.native
  
  var follow: Double = js.native
  
  var headers: Headers = js.native
  
  var hostname: String = js.native
  
  var method: String = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var protocol: String = js.native
  
  var redirect: RequestRedirect = js.native
  
  var referrer: String = js.native
  
  var url: String = js.native
}
