package typings.openapiFramework.typesMod

import typings.openapiFramework.basePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkPathContext extends js.Object {
  var basePaths: js.Array[default]
  def getApiDoc(): js.Any
  def getPathDoc(): js.Any
}

object OpenAPIFrameworkPathContext {
  @scala.inline
  def apply(basePaths: js.Array[default], getApiDoc: () => js.Any, getPathDoc: () => js.Any): OpenAPIFrameworkPathContext = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], getApiDoc = js.Any.fromFunction0(getApiDoc), getPathDoc = js.Any.fromFunction0(getPathDoc))
    __obj.asInstanceOf[OpenAPIFrameworkPathContext]
  }
}

