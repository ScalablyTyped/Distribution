package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _OSqlExpression extends js.Object

object _OSqlExpression {
  @scala.inline
  def ORawExpression(as: String => typings.orientjs.orientjsMod.ORawExpression, db: ODB, value: String): _OSqlExpression = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), db = db.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_OSqlExpression]
  }
  @scala.inline
  def OSqlFunction(abs: AbsSqlFunction, avg: AbsSqlFunction, db: ODB, sequence: SequenceSqlFunction): _OSqlExpression = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_OSqlExpression]
  }
}

