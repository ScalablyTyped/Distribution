package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMapperType extends js.Object {
  var name: MapperType
}

object BaseMapperType {
  @scala.inline
  def apply(name: MapperType): BaseMapperType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMapperType]
  }
}

