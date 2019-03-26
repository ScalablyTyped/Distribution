package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalDocumentationObject extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object ExternalDocumentationObject {
  @scala.inline
  def apply(url: java.lang.String, description: java.lang.String = null): ExternalDocumentationObject = {
    val __obj = js.Dynamic.literal(url = url)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ExternalDocumentationObject]
  }
}

