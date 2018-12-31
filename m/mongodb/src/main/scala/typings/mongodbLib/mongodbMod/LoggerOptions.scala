package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  /**
    * Override default global log level.
    */
  var logger: js.UndefOr[log] = js.undefined
  /**
    * Custom logger function
    */
  var loggerLevel: js.UndefOr[java.lang.String] = js.undefined
}

