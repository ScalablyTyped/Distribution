package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindAndModifyWriteOpResultObject[TSchema] extends js.Object {
  //The raw lastErrorObject returned from the command.
  var lastErrorObject: js.UndefOr[js.Any] = js.undefined
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[scala.Double] = js.undefined
  //Document returned from findAndModify command.
  var value: js.UndefOr[TSchema] = js.undefined
}

