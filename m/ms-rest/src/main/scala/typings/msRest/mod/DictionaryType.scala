package typings.msRest.mod

import typings.msRest.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryType extends BaseMapperType {
  var `type`: Value
}

object DictionaryType {
  @scala.inline
  def apply(name: MapperType, `type`: Value): DictionaryType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryType]
  }
}

