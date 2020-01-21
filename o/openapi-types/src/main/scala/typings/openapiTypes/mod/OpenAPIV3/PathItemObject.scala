package typings.openapiTypes.mod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathItemObject extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  var delete: js.UndefOr[OperationObject] = js.native
  var description: js.UndefOr[String] = js.native
  var get: js.UndefOr[OperationObject] = js.native
  var head: js.UndefOr[OperationObject] = js.native
  var options: js.UndefOr[OperationObject] = js.native
  var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.native
  var patch: js.UndefOr[OperationObject] = js.native
  var post: js.UndefOr[OperationObject] = js.native
  var put: js.UndefOr[OperationObject] = js.native
  var servers: js.UndefOr[js.Array[ServerObject]] = js.native
  var summary: js.UndefOr[String] = js.native
  var trace: js.UndefOr[OperationObject] = js.native
}

