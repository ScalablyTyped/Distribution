package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathItemObject extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
  var delete: js.UndefOr[OperationObject] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var get: js.UndefOr[OperationObject] = js.undefined
  var head: js.UndefOr[OperationObject] = js.undefined
  var options: js.UndefOr[OperationObject] = js.undefined
  var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.undefined
  var patch: js.UndefOr[OperationObject] = js.undefined
  var post: js.UndefOr[OperationObject] = js.undefined
  var put: js.UndefOr[OperationObject] = js.undefined
  var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var trace: js.UndefOr[OperationObject] = js.undefined
}

object PathItemObject {
  @scala.inline
  def apply(
    $ref: java.lang.String = null,
    delete: OperationObject = null,
    description: java.lang.String = null,
    get: OperationObject = null,
    head: OperationObject = null,
    options: OperationObject = null,
    parameters: js.Array[ReferenceObject | ParameterObject] = null,
    patch: OperationObject = null,
    post: OperationObject = null,
    put: OperationObject = null,
    servers: js.Array[ServerObject] = null,
    summary: java.lang.String = null,
    trace: OperationObject = null
  ): PathItemObject = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (description != null) __obj.updateDynamic("description")(description)
    if (get != null) __obj.updateDynamic("get")(get)
    if (head != null) __obj.updateDynamic("head")(head)
    if (options != null) __obj.updateDynamic("options")(options)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (patch != null) __obj.updateDynamic("patch")(patch)
    if (post != null) __obj.updateDynamic("post")(post)
    if (put != null) __obj.updateDynamic("put")(put)
    if (servers != null) __obj.updateDynamic("servers")(servers)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (trace != null) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[PathItemObject]
  }
}

