package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlFunction extends _SqlExpression {
  var abs: AbsSqlFunction
  var avg: AbsSqlFunction
  var db: Db
  var sequence: SequenceSqlFunction
}

object SqlFunction {
  @scala.inline
  def apply(abs: AbsSqlFunction, avg: AbsSqlFunction, db: Db, sequence: SequenceSqlFunction): SqlFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abs")(abs)
    __obj.updateDynamic("avg")(avg)
    __obj.updateDynamic("db")(db)
    __obj.updateDynamic("sequence")(sequence)
    __obj.asInstanceOf[SqlFunction]
  }
}

