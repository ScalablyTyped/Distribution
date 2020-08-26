package typings.openapiFramework.typesMod

import typings.openapiFramework.anon.Coercer
import typings.openapiFramework.basePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIFrameworkOperationContext extends js.Object {
  var additionalFeatures: js.Array[_] = js.native
  var allowsFeatures: Boolean = js.native
  var apiDoc: js.Any = js.native
  var basePaths: js.Array[default] = js.native
  var consumes: js.Array[String] = js.native
  var features: Coercer = js.native
  var methodName: String = js.native
  var methodParameters: js.Array[_] = js.native
  var operationDoc: js.Any = js.native
  var operationHandler: js.Any = js.native
  var path: String = js.native
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
  @scala.inline
  implicit class OpenAPIFrameworkOperationContextOps[Self <: OpenAPIFrameworkOperationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalFeaturesVarargs(value: js.Any*): Self = this.set("additionalFeatures", js.Array(value :_*))
    @scala.inline
    def setAdditionalFeatures(value: js.Array[_]): Self = this.set("additionalFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowsFeatures(value: Boolean): Self = this.set("allowsFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiDoc(value: js.Any): Self = this.set("apiDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePathsVarargs(value: default*): Self = this.set("basePaths", js.Array(value :_*))
    @scala.inline
    def setBasePaths(value: js.Array[default]): Self = this.set("basePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumesVarargs(value: String*): Self = this.set("consumes", js.Array(value :_*))
    @scala.inline
    def setConsumes(value: js.Array[String]): Self = this.set("consumes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatures(value: Coercer): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodParametersVarargs(value: js.Any*): Self = this.set("methodParameters", js.Array(value :_*))
    @scala.inline
    def setMethodParameters(value: js.Array[_]): Self = this.set("methodParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationDoc(value: js.Any): Self = this.set("operationDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationHandler(value: js.Any): Self = this.set("operationHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

