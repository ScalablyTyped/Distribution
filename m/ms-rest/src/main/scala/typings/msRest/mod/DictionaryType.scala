package typings.msRest.mod

import typings.msRest.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryType extends BaseMapperType {
  var `type`: AnonValue
}

object DictionaryType {
  @scala.inline
  def apply(name: MapperType, `type`: AnonValue): DictionaryType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryType]
  }
}

