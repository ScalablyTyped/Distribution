package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientOptions extends js.Object {
  var accessKey: java.lang.String
  var endPoint: java.lang.String
  var port: js.UndefOr[scala.Double] = js.undefined
  var region: js.UndefOr[Region] = js.undefined
  var secretKey: java.lang.String
  var sessionToken: js.UndefOr[java.lang.String] = js.undefined
  var transport: js.UndefOr[js.Any] = js.undefined
  var useSSL: js.UndefOr[scala.Boolean] = js.undefined
}

