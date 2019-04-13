package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Transaction")
@js.native
class Transaction () extends js.Object {
  var db: Db = js.native
  var id: scala.Double = js.native
  def commit(): bluebirdLib.bluebirdMod.^[_] = js.native
  def create(record: Record): Transaction = js.native
  def delete(record: Record): Transaction = js.native
  def update(record: Record): Transaction = js.native
}

