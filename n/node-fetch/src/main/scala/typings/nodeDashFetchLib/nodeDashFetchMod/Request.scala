package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Request")
@js.native
class Request protected () extends Body {
  def this(input: java.lang.String) = this()
  def this(input: nodeDashFetchLib.Anon_Href) = this()
  def this(input: Request) = this()
  def this(input: java.lang.String, init: RequestInit) = this()
  def this(input: nodeDashFetchLib.Anon_Href, init: RequestInit) = this()
  def this(input: Request, init: RequestInit) = this()
  // node-fetch extensions to the whatwg/fetch spec
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.native
  var compress: scala.Boolean = js.native
  var context: RequestContext = js.native
  var counter: scala.Double = js.native
  var follow: scala.Double = js.native
  var headers: Headers = js.native
  var hostname: java.lang.String = js.native
  var method: java.lang.String = js.native
  var port: js.UndefOr[scala.Double] = js.native
  var protocol: java.lang.String = js.native
  var redirect: RequestRedirect = js.native
  var referrer: java.lang.String = js.native
  var url: java.lang.String = js.native
}

