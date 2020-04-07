package typings.openapiTypes.mod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathItemObject extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  var delete: js.UndefOr[OperationObject] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var get: js.UndefOr[OperationObject] = js.undefined
  var head: js.UndefOr[OperationObject] = js.undefined
  var options: js.UndefOr[OperationObject] = js.undefined
  var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.undefined
  var patch: js.UndefOr[OperationObject] = js.undefined
  var post: js.UndefOr[OperationObject] = js.undefined
  var put: js.UndefOr[OperationObject] = js.undefined
  var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var trace: js.UndefOr[OperationObject] = js.undefined
}

object PathItemObject {
  @scala.inline
  def apply(
    $ref: String = null,
    delete: OperationObject = null,
    description: String = null,
    get: OperationObject = null,
    head: OperationObject = null,
    options: OperationObject = null,
    parameters: js.Array[ReferenceObject | ParameterObject] = null,
    patch: OperationObject = null,
    post: OperationObject = null,
    put: OperationObject = null,
    servers: js.Array[ServerObject] = null,
    summary: String = null,
    trace: OperationObject = null
  ): PathItemObject = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (put != null) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathItemObject]
  }
}

