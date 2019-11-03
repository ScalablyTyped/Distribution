package typings.msDashRest

import typings.msDashRest.msDashRestMod.Mapper
import typings.msDashRest.msDashRestMod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameValue extends js.Object {
  var name: MapperType
  var value: Mapper
}

object Anon_NameValue {
  @scala.inline
  def apply(name: MapperType, value: Mapper): Anon_NameValue = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[Anon_NameValue]
  }
}

