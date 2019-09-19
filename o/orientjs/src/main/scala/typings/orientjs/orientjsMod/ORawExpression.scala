package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ORawExpression extends _OSqlExpression {
  var db: ODB
  var value: String
  def as(alias: String): ORawExpression
}

object ORawExpression {
  @scala.inline
  def apply(as: String => ORawExpression, db: ODB, value: String): ORawExpression = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), db = db, value = value)
  
    __obj.asInstanceOf[ORawExpression]
  }
}

