package typings.msRest.mod

import typings.msRest.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositeType extends Mapper {
  @JSName("type")
  var type_CompositeType: ClassName
}

object CompositeType {
  @scala.inline
  def apply(
    name: MapperType,
    required: Boolean,
    serializedName: String,
    `type`: ClassName,
    isConstant: js.UndefOr[Boolean] = js.undefined,
    nullable: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined
  ): CompositeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], serializedName = serializedName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(isConstant)) __obj.updateDynamic("isConstant")(isConstant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeType]
  }
}

