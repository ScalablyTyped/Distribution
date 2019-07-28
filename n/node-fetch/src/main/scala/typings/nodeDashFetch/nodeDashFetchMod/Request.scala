package typings.nodeDashFetch.nodeDashFetchMod

import typings.node.httpMod.Agent
import typings.node.urlMod.URL
import typings.nodeDashFetch.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Request")
@js.native
class Request protected () extends Body {
  def this(input: String) = this()
  def this(input: Anon_Href) = this()
  def this(input: Request) = this()
  def this(input: String, init: RequestInit) = this()
  def this(input: Anon_Href, init: RequestInit) = this()
  def this(input: Request, init: RequestInit) = this()
  // node-fetch extensions to the whatwg/fetch spec
  var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL, Agent])] = js.native
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

