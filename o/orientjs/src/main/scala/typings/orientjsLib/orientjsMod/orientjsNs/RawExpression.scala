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
  def apply(as: js.Function1[java.lang.String, RawExpression], db: Db, value: java.lang.String): RawExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("db")(db)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RawExpression]
  }
}

