package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSqlFunction extends _OSqlExpression {
  var abs: AbsSqlFunction = js.native
  var avg: AbsSqlFunction = js.native
  var db: ODB = js.native
  var sequence: SequenceSqlFunction = js.native
}

object OSqlFunction {
  @scala.inline
  def apply(abs: AbsSqlFunction, avg: AbsSqlFunction, db: ODB, sequence: SequenceSqlFunction): OSqlFunction = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSqlFunction]
  }
  @scala.inline
  implicit class OSqlFunctionOps[Self <: OSqlFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbs(value: AbsSqlFunction): Self = this.set("abs", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvg(value: AbsSqlFunction): Self = this.set("avg", value.asInstanceOf[js.Any])
    @scala.inline
    def setDb(value: ODB): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequence(value: SequenceSqlFunction): Self = this.set("sequence", value.asInstanceOf[js.Any])
  }
  
}

