package typings.openapiFramework.typesMod

import typings.openapiFramework.basePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkAPIContext extends js.Object {
  var basePaths: js.Array[default]
  def getApiDoc(): js.Any
}

object OpenAPIFrameworkAPIContext {
  @scala.inline
  def apply(basePaths: js.Array[default], getApiDoc: () => js.Any): OpenAPIFrameworkAPIContext = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], getApiDoc = js.Any.fromFunction0(getApiDoc))
    __obj.asInstanceOf[OpenAPIFrameworkAPIContext]
  }
}

