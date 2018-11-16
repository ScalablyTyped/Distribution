package typings
package nodeDashFetchLib.nodeDashFetchMod.fetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Request extends Body {
  // node-fetch extensions to the whatwg/fetch spec
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  var compress: scala.Boolean
  var context: RequestContext
  var counter: scala.Double
  var follow: scala.Double
  var headers: Headers
  var hostname: java.lang.String
  var method: java.lang.String
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: java.lang.String
  var redirect: RequestRedirect
  var referrer: java.lang.String
  var size: scala.Double
  var timeout: scala.Double
  var url: java.lang.String
}

