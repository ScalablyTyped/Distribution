package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscriminatorObject extends js.Object {
  var mapping: js.UndefOr[StringDictionary[String]] = js.undefined
  var propertyName: String
}

object DiscriminatorObject {
  @scala.inline
  def apply(propertyName: String, mapping: StringDictionary[String] = null): DiscriminatorObject = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscriminatorObject]
  }
}

