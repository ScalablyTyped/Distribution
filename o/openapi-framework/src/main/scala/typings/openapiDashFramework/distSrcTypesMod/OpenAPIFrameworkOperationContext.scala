package typings.openapiDashFramework.distSrcTypesMod

import typings.openapiDashFramework.Anon_Coercer
import typings.openapiDashFramework.distSrcBasePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkOperationContext extends js.Object {
  var additionalFeatures: js.Array[_]
  var allowsFeatures: Boolean
  var apiDoc: js.Any
  var basePaths: js.Array[default]
  var consumes: js.Array[String]
  var features: Anon_Coercer
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
    features: Anon_Coercer,
    methodName: String,
    methodParameters: js.Array[_],
    operationDoc: js.Any,
    operationHandler: js.Any,
    path: String
  ): OpenAPIFrameworkOperationContext = {
    val __obj = js.Dynamic.literal(additionalFeatures = additionalFeatures, allowsFeatures = allowsFeatures, apiDoc = apiDoc, basePaths = basePaths, consumes = consumes, features = features, methodName = methodName, methodParameters = methodParameters, operationDoc = operationDoc, operationHandler = operationHandler, path = path)
  
    __obj.asInstanceOf[OpenAPIFrameworkOperationContext]
  }
}

