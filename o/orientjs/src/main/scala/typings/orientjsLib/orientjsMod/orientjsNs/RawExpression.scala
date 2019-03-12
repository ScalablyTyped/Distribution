package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawExpression extends _SqlExpression {
  var db: Db
  var value: java.lang.String
  def as(alias: java.lang.String): RawExpression
}

object RawExpression {
  @scala.inline
  def apply(as: java.lang.String => RawExpression, db: Db, value: java.lang.String): RawExpression = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), db = db, value = value)
  
    __obj.asInstanceOf[RawExpression]
  }
}

