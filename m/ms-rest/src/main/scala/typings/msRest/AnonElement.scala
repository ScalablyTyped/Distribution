package typings.msRest

import typings.msRest.mod.Mapper
import typings.msRest.mod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement extends js.Object {
  var element: Mapper
  var name: MapperType
}

object AnonElement {
  @scala.inline
  def apply(element: Mapper, name: MapperType): AnonElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonElement]
  }
}

