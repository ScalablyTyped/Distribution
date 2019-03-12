package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var db: Db
  var id: scala.Double
  def commit(): bluebirdLib.bluebirdMod.namespaced[_]
  def create(record: Record): Transaction
  def delete(record: Record): Transaction
  def update(record: Record): Transaction
}

object Transaction {
  @scala.inline
  def apply(
    commit: () => bluebirdLib.bluebirdMod.namespaced[_],
    create: Record => Transaction,
    db: Db,
    delete: Record => Transaction,
    id: scala.Double,
    update: Record => Transaction
  ): Transaction = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), create = js.Any.fromFunction1(create), db = db, delete = js.Any.fromFunction1(delete), id = id, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Transaction]
  }
}

