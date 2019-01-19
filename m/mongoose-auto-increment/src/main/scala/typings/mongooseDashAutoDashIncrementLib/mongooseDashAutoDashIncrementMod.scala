package typings
package mongooseDashAutoDashIncrementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose-auto-increment", JSImport.Namespace)
@js.native
object mongooseDashAutoDashIncrementMod extends js.Object {
  /**
    * Initialize plugin by creating counter collection in database.
    */
  def initialize(connection: mongooseLib.mongooseMod.Connection): scala.Unit = js.native
  /**
    * The function to use when invoking the plugin on a custom schema.
    */
  def plugin(schema: mongooseLib.mongooseMod.Schema[_], options: js.Object): scala.Unit = js.native
}

