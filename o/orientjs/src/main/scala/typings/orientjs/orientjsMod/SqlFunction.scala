package typings.orientjs.orientjsMod

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
    val __obj = js.Dynamic.literal(abs = abs, avg = avg, db = db, sequence = sequence)
  
    __obj.asInstanceOf[SqlFunction]
  }
}

