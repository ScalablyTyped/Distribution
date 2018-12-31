package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptions extends js.Object {
  var safe: js.UndefOr[scala.Boolean | WriteConcern] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var validateBeforeSave: js.UndefOr[scala.Boolean] = js.undefined
}

