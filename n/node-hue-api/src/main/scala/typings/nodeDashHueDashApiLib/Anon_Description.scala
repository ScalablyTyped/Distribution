package typings
package nodeDashHueDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: java.lang.String
  var name: java.lang.String
  var number: java.lang.String
  var serial: java.lang.String
  var udn: java.lang.String
}

object Anon_Description {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String,
    number: java.lang.String,
    serial: java.lang.String,
    udn: java.lang.String
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("serial")(serial)
    __obj.updateDynamic("udn")(udn)
    __obj.asInstanceOf[Anon_Description]
  }
}

