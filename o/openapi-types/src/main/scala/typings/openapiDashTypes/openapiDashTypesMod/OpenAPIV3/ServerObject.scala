package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerObject extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var url: String
  var variables: js.UndefOr[StringDictionary[ServerVariableObject]] = js.undefined
}

object ServerObject {
  @scala.inline
  def apply(url: String, description: String = null, variables: StringDictionary[ServerVariableObject] = null): ServerObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerObject]
  }
}

