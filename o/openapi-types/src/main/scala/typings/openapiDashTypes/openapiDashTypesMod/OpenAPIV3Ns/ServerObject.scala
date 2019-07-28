package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns

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
    val __obj = js.Dynamic.literal(url = url)
    if (description != null) __obj.updateDynamic("description")(description)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[ServerObject]
  }
}

