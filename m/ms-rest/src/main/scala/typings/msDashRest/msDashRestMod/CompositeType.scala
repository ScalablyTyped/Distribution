package typings.msDashRest.msDashRestMod

import typings.msDashRest.Anon_ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositeType extends Mapper {
  @JSName("type")
  var type_CompositeType: Anon_ClassName
}

object CompositeType {
  @scala.inline
  def apply(
    name: MapperType,
    required: Boolean,
    serializedName: String,
    `type`: Anon_ClassName,
    isConstant: js.UndefOr[Boolean] = js.undefined,
    nullable: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined
  ): CompositeType = {
    val __obj = js.Dynamic.literal(name = name, required = required, serializedName = serializedName)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(isConstant)) __obj.updateDynamic("isConstant")(isConstant)
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[CompositeType]
  }
}

