package typings.openapiDefaultSetter.mod

import typings.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIDefaultSetter extends IOpenAPIDefaultSetter {
  var headersDefaults: js.Any
  var queryDefaults: js.Any
}

object OpenAPIDefaultSetter {
  @scala.inline
  def apply(handle: Request => Unit, headersDefaults: js.Any, queryDefaults: js.Any): OpenAPIDefaultSetter = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), headersDefaults = headersDefaults.asInstanceOf[js.Any], queryDefaults = queryDefaults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenAPIDefaultSetter]
  }
}

