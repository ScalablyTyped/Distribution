package typings.mqtt.typesLibClientDashOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISecureClientOptions extends js.Object {
  /**
    * Optionally override the trusted CA certificates in PEM format
    */
  var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
  /**
    * optional cert chains in PEM format
    */
  var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
  /**
    * optional private keys in PEM format
    */
  var key: js.UndefOr[String | (js.Array[Buffer | js.Object | String]) | Buffer] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object ISecureClientOptions {
  @scala.inline
  def apply(
    ca: String | (js.Array[Buffer | String]) | Buffer = null,
    cert: String | (js.Array[Buffer | String]) | Buffer = null,
    key: String | (js.Array[Buffer | js.Object | String]) | Buffer = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  ): ISecureClientOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[ISecureClientOptions]
  }
}

