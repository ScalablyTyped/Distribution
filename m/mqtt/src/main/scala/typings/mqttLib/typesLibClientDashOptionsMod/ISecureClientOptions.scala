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
    java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer
  ] = js.undefined
  /**
    * optional cert chains in PEM format
    */
  var cert: js.UndefOr[
    java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer
  ] = js.undefined
  /**
    * optional private keys in PEM format
    */
  var key: js.UndefOr[
    java.lang.String | (js.Array[nodeLib.Buffer | js.Object | java.lang.String]) | nodeLib.Buffer
  ] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
}

object ISecureClientOptions {
  @scala.inline
  def apply(
    ca: java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer = null,
    cert: java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer = null,
    key: java.lang.String | (js.Array[nodeLib.Buffer | js.Object | java.lang.String]) | nodeLib.Buffer = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  ): ISecureClientOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[ISecureClientOptions]
  }
}

