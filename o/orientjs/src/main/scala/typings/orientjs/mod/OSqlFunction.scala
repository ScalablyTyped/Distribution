package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSqlFunction extends _OSqlExpression {
  var abs: AbsSqlFunction
  var avg: AbsSqlFunction
  var db: ODB
  var sequence: SequenceSqlFunction
}

object OSqlFunction {
  @scala.inline
  def apply(abs: AbsSqlFunction, avg: AbsSqlFunction, db: ODB, sequence: SequenceSqlFunction): OSqlFunction = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OSqlFunction]
  }
}

