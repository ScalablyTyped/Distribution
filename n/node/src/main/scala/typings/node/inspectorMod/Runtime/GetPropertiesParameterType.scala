package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPropertiesParameterType extends js.Object {
  /**
    * If true, returns accessor properties (with getter/setter) only; internal properties are not returned either.
    * @experimental
    */
  var accessorPropertiesOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether preview should be generated for the results.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifier of the object to return properties for.
    */
  var objectId: RemoteObjectId
  /**
    * If true, returns properties belonging only to the element itself, not to its prototype chain.
    */
  var ownProperties: js.UndefOr[Boolean] = js.undefined
}

object GetPropertiesParameterType {
  @scala.inline
  def apply(
    objectId: RemoteObjectId,
    accessorPropertiesOnly: js.UndefOr[Boolean] = js.undefined,
    generatePreview: js.UndefOr[Boolean] = js.undefined,
    ownProperties: js.UndefOr[Boolean] = js.undefined
  ): GetPropertiesParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    if (!js.isUndefined(accessorPropertiesOnly)) __obj.updateDynamic("accessorPropertiesOnly")(accessorPropertiesOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(generatePreview)) __obj.updateDynamic("generatePreview")(generatePreview.asInstanceOf[js.Any])
    if (!js.isUndefined(ownProperties)) __obj.updateDynamic("ownProperties")(ownProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesParameterType]
  }
}

