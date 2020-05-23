package typings.nodemailerSmtpTransport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxConnections extends js.Object {
  /**
    * is the count of maximum simultaneous connections to make against the SMTP server (defaults to 5)
    */
  var maxConnections: js.UndefOr[Boolean] = js.undefined
  /**
    * limits the message count to be sent using a single connection (defaults to 100). After maxMessages is reached the connection is dropped and a new one is created for the following messages
    */
  var maxMessages: js.UndefOr[Boolean] = js.undefined
  /**
    * set to true to use pooled connections (defaults to false) instead of creating a new connection for every email
    */
  var pool: js.UndefOr[Boolean] = js.undefined
  /**
    * defines the time measuring period in milliseconds (defaults to 1000, ie. to 1 second) for rate limiting
    */
  var rateDelta: js.UndefOr[Boolean] = js.undefined
  /**
    * limits the message count to be sent in rateDelta time. Once rateLimit is reached, sending is paused until the end of the measuring period.
    */
  var rateLimit: js.UndefOr[Boolean] = js.undefined
}

object MaxConnections {
  @scala.inline
  def apply(
    maxConnections: js.UndefOr[Boolean] = js.undefined,
    maxMessages: js.UndefOr[Boolean] = js.undefined,
    pool: js.UndefOr[Boolean] = js.undefined,
    rateDelta: js.UndefOr[Boolean] = js.undefined,
    rateLimit: js.UndefOr[Boolean] = js.undefined
  ): MaxConnections = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxConnections)) __obj.updateDynamic("maxConnections")(maxConnections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMessages)) __obj.updateDynamic("maxMessages")(maxMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pool)) __obj.updateDynamic("pool")(pool.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rateDelta)) __obj.updateDynamic("rateDelta")(rateDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rateLimit)) __obj.updateDynamic("rateLimit")(rateLimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxConnections]
  }
}

