package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_New extends js.Object {
  var `new`: mongooseLib.mongooseLibNumbers.`true`
  var rawResult: mongooseLib.mongooseLibNumbers.`true`
  var upsert: mongooseLib.mongooseLibNumbers.`true`
}

object Anon_New {
  @scala.inline
  def apply(
    `new`: mongooseLib.mongooseLibNumbers.`true`,
    rawResult: mongooseLib.mongooseLibNumbers.`true`,
    upsert: mongooseLib.mongooseLibNumbers.`true`
  ): Anon_New = {
    val __obj = js.Dynamic.literal(`new` = `new`)
    __obj.updateDynamic("rawResult")(rawResult)
    __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[Anon_New]
  }
}

