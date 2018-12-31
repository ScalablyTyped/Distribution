package typings
package nodemailerLib.libFetchMod.fetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowErrorResponse: js.UndefOr[scala.Boolean] = js.undefined
  var body: js.UndefOr[
    nodeLib.Buffer | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  var contentType: js.UndefOr[java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`] = js.undefined
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  var cookies: js.UndefOr[Cookies] = js.undefined
  var fetchRes: js.UndefOr[nodeLib.streamMod.Writable] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var redirects: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[nodemailerLib.libFetchMod.ms] = js.undefined
  var tls: js.UndefOr[nodeLib.tlsMod.TlsOptions] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

