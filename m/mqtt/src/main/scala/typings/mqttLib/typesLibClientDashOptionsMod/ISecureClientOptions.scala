package typings
package mqttLib.typesLibClientDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISecureClientOptions extends js.Object {
  /**
     * Optionally override the trusted CA certificates in PEM format
     */
  var ca: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
  ] = js.undefined
  /**
     * optional cert chains in PEM format
     */
  var cert: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
  ] = js.undefined
  /**
     * optional private keys in PEM format
     */
  var key: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] | js.Array[js.Object]
  ] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
}

