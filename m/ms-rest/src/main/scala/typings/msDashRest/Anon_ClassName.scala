package typings.msDashRest

import org.scalablytyped.runtime.StringDictionary
import typings.msDashRest.msDashRestMod.Mapper
import typings.msDashRest.msDashRestMod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: String
  var modelProperties: js.UndefOr[StringDictionary[Mapper]] = js.undefined
  var name: MapperType
}

object Anon_ClassName {
  @scala.inline
  def apply(className: String, name: MapperType, modelProperties: StringDictionary[Mapper] = null): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className, name = name)
    if (modelProperties != null) __obj.updateDynamic("modelProperties")(modelProperties)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

