package typings.msDashRest

import typings.msDashRest.msDashRestMod.Mapper
import typings.msDashRest.msDashRestMod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: Mapper
  var name: MapperType
}

object Anon_Element {
  @scala.inline
  def apply(element: Mapper, name: MapperType): Anon_Element = {
    val __obj = js.Dynamic.literal(element = element, name = name)
  
    __obj.asInstanceOf[Anon_Element]
  }
}

