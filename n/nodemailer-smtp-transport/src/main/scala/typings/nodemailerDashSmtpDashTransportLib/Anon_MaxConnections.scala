package typings
package nodemailerDashSmtpDashTransportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxConnections extends js.Object {
  /**
    * is the count of maximum simultaneous connections to make against the SMTP server (defaults to 5)
    */
  var maxConnections: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * limits the message count to be sent using a single connection (defaults to 100). After maxMessages is reached the connection is dropped and a new one is created for the following messages
    */
  var maxMessages: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * set to true to use pooled connections (defaults to false) instead of creating a new connection for every email
    */
  var pool: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * defines the time measuring period in milliseconds (defaults to 1000, ie. to 1 second) for rate limiting
    */
  var rateDelta: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * limits the message count to be sent in rateDelta time. Once rateLimit is reached, sending is paused until the end of the measuring period.
    */
  var rateLimit: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_MaxConnections {
  @scala.inline
  def apply(
    maxConnections: js.UndefOr[scala.Boolean] = js.undefined,
    maxMessages: js.UndefOr[scala.Boolean] = js.undefined,
    pool: js.UndefOr[scala.Boolean] = js.undefined,
    rateDelta: js.UndefOr[scala.Boolean] = js.undefined,
    rateLimit: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_MaxConnections = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxConnections)) __obj.updateDynamic("maxConnections")(maxConnections)
    if (!js.isUndefined(maxMessages)) __obj.updateDynamic("maxMessages")(maxMessages)
    if (!js.isUndefined(pool)) __obj.updateDynamic("pool")(pool)
    if (!js.isUndefined(rateDelta)) __obj.updateDynamic("rateDelta")(rateDelta)
    if (!js.isUndefined(rateLimit)) __obj.updateDynamic("rateLimit")(rateLimit)
    __obj.asInstanceOf[Anon_MaxConnections]
  }
}

