package typings.msDashRest.msDashRestMod

import typings.msDashRest.Anon_Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceType extends Mapper {
  @JSName("type")
  var type_SequenceType: Anon_Element
}

object SequenceType {
  @scala.inline
  def apply(
    name: MapperType,
    required: Boolean,
    serializedName: String,
    `type`: Anon_Element,
    isConstant: js.UndefOr[Boolean] = js.undefined,
    nullable: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined
  ): SequenceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], serializedName = serializedName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(isConstant)) __obj.updateDynamic("isConstant")(isConstant.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceType]
  }
}

