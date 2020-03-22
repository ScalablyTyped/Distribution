package typings.msRest

import typings.msRest.mod.Mapper
import typings.msRest.mod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var name: MapperType
  var value: Mapper
}

object AnonValue {
  @scala.inline
  def apply(name: MapperType, value: Mapper): AnonValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

