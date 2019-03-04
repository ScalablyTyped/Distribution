package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewTrue extends js.Object {
  var `new`: mongooseLib.mongooseLibNumbers.`true`
  var upsert: mongooseLib.mongooseLibNumbers.`true`
}

object Anon_NewTrue {
  @scala.inline
  def apply(`new`: mongooseLib.mongooseLibNumbers.`true`, upsert: mongooseLib.mongooseLibNumbers.`true`): Anon_NewTrue = {
    val __obj = js.Dynamic.literal(upsert = upsert)
    __obj.updateDynamic("new")(`new`)
    __obj.asInstanceOf[Anon_NewTrue]
  }
}

