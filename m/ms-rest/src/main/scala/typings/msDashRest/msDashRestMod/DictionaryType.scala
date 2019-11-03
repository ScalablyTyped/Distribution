package typings.msDashRest.msDashRestMod

import typings.msDashRest.Anon_NameValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryType extends BaseMapperType {
  var `type`: Anon_NameValue
}

object DictionaryType {
  @scala.inline
  def apply(name: MapperType, `type`: Anon_NameValue): DictionaryType = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DictionaryType]
  }
}

