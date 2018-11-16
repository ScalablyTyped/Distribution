package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** See the node-mongodb-native driver instance for options that it understands. */

trait ConnectionOpenOptions extends ConnectionOptionsBase {
  /** mongoose-specific options */
  var config: js.UndefOr[mongooseLib.Anon_AutoIndex] = js.undefined
}

