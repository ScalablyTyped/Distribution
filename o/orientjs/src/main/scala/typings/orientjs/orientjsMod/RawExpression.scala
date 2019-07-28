package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawExpression extends _SqlExpression {
  var db: Db
  var value: String
  def as(alias: String): RawExpression
}

object RawExpression {
  @scala.inline
  def apply(as: String => RawExpression, db: Db, value: String): RawExpression = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), db = db, value = value)
  
    __obj.asInstanceOf[RawExpression]
  }
}

