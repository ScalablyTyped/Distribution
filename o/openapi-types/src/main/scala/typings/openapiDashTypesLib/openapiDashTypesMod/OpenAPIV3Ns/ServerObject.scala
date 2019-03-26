package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerObject extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ServerVariableObject]] = js.undefined
}

object ServerObject {
  @scala.inline
  def apply(
    url: java.lang.String,
    description: java.lang.String = null,
    variables: org.scalablytyped.runtime.StringDictionary[ServerVariableObject] = null
  ): ServerObject = {
    val __obj = js.Dynamic.literal(url = url)
    if (description != null) __obj.updateDynamic("description")(description)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[ServerObject]
  }
}

