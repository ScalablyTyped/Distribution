package typings
package nodeDashFetchLib.nodeDashFetchMod.fetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestInit extends js.Object {
  // node-fetch extensions
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  // whatwg/fetch standard options
  var body: js.UndefOr[BodyInit] = js.undefined
   // =null http.Agent instance, allows custom proxy, certificate etc.
  var compress: js.UndefOr[scala.Boolean] = js.undefined
   // =true support gzip/deflate content encoding. false to disable
  var follow: js.UndefOr[scala.Double] = js.undefined
  var headers: js.UndefOr[HeaderInit | ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
   // =20 maximum redirect count. 0 to not follow redirect
  var size: js.UndefOr[scala.Double] = js.undefined
   // =0 maximum response body size in bytes. 0 to disable
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

