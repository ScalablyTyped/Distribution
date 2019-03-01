package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReadPreference extends js.Object {
  var readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String
}

object Anon_ReadPreference {
  @scala.inline
  def apply(readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String): Anon_ReadPreference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ReadPreference]
  }
}

