package typings.msRest.mod

import typings.msRest.AnonNameValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryType extends BaseMapperType {
  var `type`: AnonNameValue
}

object DictionaryType {
  @scala.inline
  def apply(name: MapperType, `type`: AnonNameValue): DictionaryType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryType]
  }
}

