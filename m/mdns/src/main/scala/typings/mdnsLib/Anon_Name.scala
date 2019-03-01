package typings
package mdnsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var protocol: java.lang.String
  var subtypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, protocol: java.lang.String, subtypes: js.Array[java.lang.String] = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("protocol")(protocol)
    if (subtypes != null) __obj.updateDynamic("subtypes")(subtypes)
    __obj.asInstanceOf[Anon_Name]
  }
}

