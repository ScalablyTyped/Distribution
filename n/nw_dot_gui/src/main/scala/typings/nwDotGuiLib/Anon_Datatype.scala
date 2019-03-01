package typings
package nwDotGuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datatype extends js.Object {
  var datatype: java.lang.String
  var format: java.lang.String
}

object Anon_Datatype {
  @scala.inline
  def apply(datatype: java.lang.String, format: java.lang.String): Anon_Datatype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("datatype")(datatype)
    __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[Anon_Datatype]
  }
}

