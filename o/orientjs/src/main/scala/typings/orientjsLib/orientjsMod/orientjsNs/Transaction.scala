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
    commit: js.Function0[bluebirdLib.bluebirdMod.namespaced[_]],
    create: js.Function1[Record, Transaction],
    db: Db,
    delete: js.Function1[Record, Transaction],
    id: scala.Double,
    update: js.Function1[Record, Transaction]
  ): Transaction = {
    val __obj = js.Dynamic.literal(commit = commit, create = create, db = db, delete = delete, id = id, update = update)
  
    __obj.asInstanceOf[Transaction]
  }
}

