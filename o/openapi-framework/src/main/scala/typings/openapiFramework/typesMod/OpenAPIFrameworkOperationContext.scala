package typings.openapiFramework.typesMod

import typings.openapiFramework.anon.Coercer
import typings.openapiFramework.basePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkOperationContext extends js.Object {
  var additionalFeatures: js.Array[_]
  var allowsFeatures: Boolean
  var apiDoc: js.Any
  var basePaths: js.Array[default]
  var consumes: js.Array[String]
  var features: Coercer
  var methodName: String
  var methodParameters: js.Array[_]
  var operationDoc: js.Any
  var operationHandler: js.Any
  var path: String
}

object OpenAPIFrameworkOperationContext {
  @scala.inline
  def apply(
    additionalFeatures: js.Array[_],
    allowsFeatures: Boolean,
    apiDoc: js.Any,
    basePaths: js.Array[default],
    consumes: js.Array[String],
    features: Coercer,
    methodName: String,
    methodParameters: js.Array[_],
    operationDoc: js.Any,
    operationHandler: js.Any,
    path: String
  ): OpenAPIFrameworkOperationContext = {
    val __obj = js.Dynamic.literal(additionalFeatures = additionalFeatures.asInstanceOf[js.Any], allowsFeatures = allowsFeatures.asInstanceOf[js.Any], apiDoc = apiDoc.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], consumes = consumes.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], methodParameters = methodParameters.asInstanceOf[js.Any], operationDoc = operationDoc.asInstanceOf[js.Any], operationHandler = operationHandler.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIFrameworkOperationContext]
  }
}

