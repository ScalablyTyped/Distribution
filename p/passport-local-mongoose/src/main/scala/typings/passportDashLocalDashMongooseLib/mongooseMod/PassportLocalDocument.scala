package typings
package passportDashLocalDashMongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassportLocalDocument
  extends stdLib.Document {
  def authenticate(
    password: java.lang.String,
    cb: js.Function3[/* err */ js.Any, /* res */ js.Any, /* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def setPassword(password: java.lang.String, cb: js.Function2[/* err */ js.Any, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
}

