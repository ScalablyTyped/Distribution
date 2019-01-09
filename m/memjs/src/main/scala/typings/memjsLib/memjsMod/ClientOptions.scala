package typings
package memjsLib.memjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * `expires` - the default expiration in seconds to use (default 0 - never
    * expire). If `expires` is greater than 30 days (60 x 60 x 24 x 30), it is
    * treated as a UNIX time (number of seconds since January 1, 1970).
    */
  var expires: js.UndefOr[scala.Double] = js.undefined
  /**
    * `failoverTime` - how much to wait until retring a failed server. Default
    * is 60 seconds.
    */
  var failoverTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * `logger` - a logger object that responds to `log(string)` method calls.
    */
  var logger: js.UndefOr[memjsLib.Anon_Args] = js.undefined
  /**
    * `retries` - the number of times to retry an operation in lieu of failures
    * (default 2)
    */
  var retries: js.UndefOr[scala.Double] = js.undefined
  /**
    * `retry_delay` - default is 0.2
    */
  var retry_delay: js.UndefOr[scala.Double] = js.undefined
}

