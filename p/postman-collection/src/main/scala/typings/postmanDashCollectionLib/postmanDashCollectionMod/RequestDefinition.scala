package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDefinition extends PropertyDefinition {
  var auth: js.UndefOr[RequestAuthDefinition] = js.undefined
  var body: js.UndefOr[RequestBody] = js.undefined
  var certificate: js.UndefOr[CertificateDefinition] = js.undefined
  var header: js.UndefOr[HeaderDefinition] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[ProxyConfigDefinition] = js.undefined
  var url: java.lang.String | Url
}

